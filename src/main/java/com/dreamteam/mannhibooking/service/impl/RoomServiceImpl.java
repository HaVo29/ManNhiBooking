package com.dreamteam.mannhibooking.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamteam.mannhibooking.dto.RoomDTO;
import com.dreamteam.mannhibooking.entity.HotelEntity;
import com.dreamteam.mannhibooking.entity.RoomEntity;
import com.dreamteam.mannhibooking.exception.ModelNotFoundException;
import com.dreamteam.mannhibooking.projections.DetailRoom;
import com.dreamteam.mannhibooking.repository.HotelRepository;
import com.dreamteam.mannhibooking.repository.RoomRepository;
import com.dreamteam.mannhibooking.service.RoomService;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	
	private RoomRepository roomRepository;
	
	private HotelRepository hotelRepository;
	
	private ModelMapper modelMapper;
	
	@Autowired
	public RoomServiceImpl (RoomRepository roomRepository,ModelMapper modelMapper,HotelRepository hotelRepository) {
		this.roomRepository = roomRepository;
		this.modelMapper= modelMapper;
		this.hotelRepository = hotelRepository;
	}
	
	@Override
	public DetailRoom findDetailRoomById(Long id) {
		DetailRoom detailRoom = roomRepository.findDetailRoomById(id);
		return detailRoom;
	}
	
	@Override
	public List<DetailRoom> findDetaiRooms(){
		List<DetailRoom> listDetail = roomRepository.findDetailRoooms();
		return listDetail;
	}
	
	@Override
	public RoomDTO create(RoomDTO roomDTO) {
		
		HotelEntity hotel = hotelRepository.findById(roomDTO.getHotelId())
				.orElseThrow(() -> new ModelNotFoundException("HotelRepository not found with id: " + roomDTO.getHotelId()));
		
		// Chuyển đổi DTO thành Entity
		RoomEntity roomEntity = modelMapper.map(roomDTO, RoomEntity.class);;
		roomEntity.setHotel(hotel);
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		RoomEntity saveEntity = roomRepository.save(roomEntity);

		return modelMapper.map(saveEntity, RoomDTO.class);
	}
	
}
