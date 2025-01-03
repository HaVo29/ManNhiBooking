package com.dreamteam.mannhibooking.service;

import java.util.List;

import com.dreamteam.mannhibooking.dto.ProviceDTO;

public interface ProviceService {

	ProviceDTO update(Long id,ProviceDTO proviceDTO);
	ProviceDTO create(ProviceDTO proviceDTO);
	ProviceDTO getProviceById(Long id);
	List<ProviceDTO> getAllProvice() ;
	void deleteProvice(Long id);
	void deleteListProvice(List<Long> id);
}
