package com.dreamteam.mannhibooking.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamteam.mannhibooking.dto.ProviceDTO;
import com.dreamteam.mannhibooking.entity.ProviceEntity;
import com.dreamteam.mannhibooking.repository.ProviceRepository;
import com.dreamteam.mannhibooking.service.ProviceService;

@Service
public class ProviceServiceImpl implements ProviceService {
	
    private final ProviceRepository proviceRepository;
    
    private final ModelMapper modelMapper;

    // Constructor injection
    @Autowired
    public ProviceServiceImpl(ProviceRepository proviceRepository , ModelMapper modelMapper) {
        this.proviceRepository = proviceRepository;
        this.modelMapper = modelMapper;
    }

	@Override
	public ProviceDTO save(ProviceDTO proviceDTO) {
		// Chuyển đổi DTO thành Entity
		ProviceEntity proviceEntity = modelMapper.map(proviceDTO, ProviceEntity.class);;
		 // Lưu hoặc cập nhật đối tượng vào cơ sở dữ liệu
		ProviceEntity saveEntity = proviceRepository.save(proviceEntity);

		return modelMapper.map(saveEntity, ProviceDTO.class);
	}
}
