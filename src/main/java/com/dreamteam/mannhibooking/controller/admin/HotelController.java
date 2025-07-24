package com.dreamteam.mannhibooking.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamteam.mannhibooking.dto.HotelDTO;
import com.dreamteam.mannhibooking.service.HotelService;
import com.dreamteam.mannhibooking.service.ProviceService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private ProviceService proviceService ;
	
	@Qualifier("HotelServiceImpl")
	private HotelService hotelService  ;
	
//	public HotelController (HotelService hotelService,ProviceService proviceService) {
//		this.hotelService = hotelService;
//		this.proviceService = proviceService;
//	}
	
	@PostMapping
	public HotelDTO createHotel(@RequestBody HotelDTO model){
		return hotelService.create(model);
	}
	
	@PutMapping(value = "/{id}")
	public HotelDTO updateProvice(@RequestBody HotelDTO model, @PathVariable("id") long id){
		model.setId(id);
		return hotelService.update(model.getId(),model);
	}
	
	@PutMapping(value = "/delete/{id}")
	public void updateValidFlagProvice(@RequestBody HotelDTO model, @PathVariable("id") long id){
		model.setId(id);
       
		hotelService.deleteHotel(model.getId());
	}
	
	@GetMapping(value = "/{id}")
	public HotelDTO getHotelbyID(@PathVariable("id") long id){
		// commentline
		return hotelService.getHotelById(id);
	}
}
