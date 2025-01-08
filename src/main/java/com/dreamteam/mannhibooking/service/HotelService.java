package com.dreamteam.mannhibooking.service;

import java.util.List;

import com.dreamteam.mannhibooking.dto.HotelDTO;

public interface HotelService {

	HotelDTO update(Long id,HotelDTO hotelDTO);
	HotelDTO create(HotelDTO hotelDTO);
	HotelDTO getHotelById(Long id);
	List<HotelDTO> getAllHotel() ;
	void deleteHotel(Long id);
	void deleteListHotel(List<Long> id);
}
