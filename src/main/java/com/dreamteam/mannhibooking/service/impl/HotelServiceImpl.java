package com.dreamteam.mannhibooking.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamteam.mannhibooking.dto.HotelDTO;
import com.dreamteam.mannhibooking.entity.HotelEntity;
import com.dreamteam.mannhibooking.entity.ProviceEntity;
import com.dreamteam.mannhibooking.exception.ModelNotFoundException;
import com.dreamteam.mannhibooking.repository.HotelRepository;
import com.dreamteam.mannhibooking.repository.ProviceRepository;
import com.dreamteam.mannhibooking.repository.RoomRepository;
import com.dreamteam.mannhibooking.service.HotelService;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	
	@Autowired
    private  HotelRepository hotelRepository;
	
	@Autowired
    private  ProviceRepository proviceRepository;
	
	@Autowired
    private  RoomRepository roomRepository;
    
	@Autowired
    private ModelMapper modelMapper;

	@Override
	@Transactional(rollbackFor = ModelNotFoundException.class)
	public HotelDTO update(Long id,HotelDTO hotelDTO) {
		
		HotelEntity hotelEntity = hotelRepository.findById(id)
	                .orElseThrow(() -> new ModelNotFoundException("HotelRepository not found with id: " + id));

		// Update fields
		hotelEntity.setName(hotelDTO.getName());
		hotelEntity.setAddr01(hotelDTO.getAddr01());
		hotelEntity.setAddr02(hotelDTO.getAddr02());
		hotelEntity.setAddr03(hotelDTO.getAddr03());
		hotelEntity.setAddr04(hotelDTO.getAddr04());
		hotelEntity.setDetail(hotelDTO.getDetail());
		hotelEntity.setOpenTime(hotelDTO.getOpenTime());
		hotelEntity.setCloseTime(hotelDTO.getCloseTime());
		hotelEntity.setStatus(hotelDTO.getStatus());
		hotelEntity.setCheckIn(hotelDTO.getCheckIn());
		hotelEntity.setCheckOut(hotelDTO.getCheckOut());
		hotelEntity.setValidFlag(hotelDTO.getValidFlag());
		hotelEntity.setDisplayFlag(hotelDTO.getDisplayFlag());
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		HotelEntity updateEntity = hotelRepository.save(hotelEntity);
		
		Long id1 = (long) 4;
		
		HotelEntity hotelEntity1 = hotelRepository.findById(id1)
               .orElseThrow(() -> new ModelNotFoundException("HotelRepository not found with id: " + id));

		return modelMapper.map(updateEntity, HotelDTO.class);
	}
	
	@Override
	public HotelDTO create(HotelDTO hotelDTO) {
		
		ProviceEntity provice = proviceRepository.findById(hotelDTO.getProviceId())
				.orElseThrow(() -> new RuntimeException("Provice not found"));
		
		// Chuyển đổi DTO thành Entity
		HotelEntity hotelEntity = modelMapper.map(hotelDTO, HotelEntity.class);;
		hotelEntity.setProvice(provice);
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		HotelEntity saveEntity = hotelRepository.save(hotelEntity);

		return modelMapper.map(saveEntity, HotelDTO.class);
	}
	
    @Override
    public HotelDTO getHotelById(Long id) {
    	HotelEntity hotelEntity = hotelRepository.findById(id)
                .orElseThrow(() -> new ModelNotFoundException("Hotel with ID " + id + " not found"));
    	
//    	ProviceEntity provice = proviceRepository.findById(hotelEntity.getProvice().getId())
//    			.orElseThrow(() -> new RuntimeException("News not found"));;
        return modelMapper.map(hotelEntity, HotelDTO.class);
    }
    
    @Override
    public List<HotelDTO> getAllHotel() {
        List<HotelEntity> hotelList = hotelRepository.findAll();
        return hotelList.stream()
                .map(hotels -> modelMapper.map(hotels, HotelDTO.class))
                .collect(Collectors.toList());
    }
    
    @Override
    public void deleteHotel(Long id) {
    	
    	hotelRepository.updateHotelByID(2,id);
    }
    
    @Override
    public void deleteListHotel(List<Long> listId) {
    	hotelRepository.updateHotelList(2,listId);
    }
    
    @Override
    public List<HotelDTO> getListHotelByProviceId(Long id) {
        List<HotelEntity> hotelList = hotelRepository.getListHotelByProviceID(id);
        return hotelList.stream()
                .map(hotels -> modelMapper.map(hotels, HotelDTO.class))
                .collect(Collectors.toList());
    }
    
	
}
