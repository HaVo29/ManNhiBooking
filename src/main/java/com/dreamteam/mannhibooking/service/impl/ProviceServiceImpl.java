package com.dreamteam.mannhibooking.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamteam.mannhibooking.dto.ProviceDTO;
import com.dreamteam.mannhibooking.entity.ProviceEntity;
import com.dreamteam.mannhibooking.repository.ProviceRepository;
import com.dreamteam.mannhibooking.service.ProviceService;

@Service
public class ProviceServiceImpl implements ProviceService {
	
	@Autowired
    private  ProviceRepository proviceRepository;
    
	@Autowired
    private ModelMapper modelMapper;

	@Override
	public ProviceDTO update(Long id,ProviceDTO proviceDTO) {
		
		ProviceEntity proviceEntity = proviceRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("proviceRepository not found with id: " + id));

		// Update fields
		proviceEntity.setName(proviceDTO.getName());
		proviceEntity.setValidflag(proviceDTO.getValidflag());
		proviceEntity.setCode(proviceDTO.getCode());
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		ProviceEntity updateEntity = proviceRepository.save(proviceEntity);

		return modelMapper.map(updateEntity, ProviceDTO.class);
	}
	
	@Override
	public ProviceDTO create(ProviceDTO proviceDTO) {
		// Chuyển đổi DTO thành Entity
		ProviceEntity proviceEntity = modelMapper.map(proviceDTO, ProviceEntity.class);;
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		ProviceEntity saveEntity = proviceRepository.save(proviceEntity);

		return modelMapper.map(saveEntity, ProviceDTO.class);
	}
	
    @Override
    public ProviceDTO getProviceById(Long id) {
    	ProviceEntity proviceEntity = proviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("News not found"));
        return modelMapper.map(proviceEntity, ProviceDTO.class);
    }
    
    @Override
    public List<ProviceDTO> getAllProvice() {
        List<ProviceEntity> proviceList = proviceRepository.findAll();
        return proviceList.stream()
                .map(news -> modelMapper.map(news, ProviceDTO.class))
                .collect(Collectors.toList());
    }
    
    @Override
    public void deleteProvice(Long id) {
    	
    	proviceRepository.updateProviceByID(2,id);
    }
    
    @Override
    public void deleteListProvice(List<Long> listId) {
    	proviceRepository.updateNewsList(listId,2);
    }
    
	
}
