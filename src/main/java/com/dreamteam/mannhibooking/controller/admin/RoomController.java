package com.dreamteam.mannhibooking.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamteam.mannhibooking.dto.RoomDTO;
import com.dreamteam.mannhibooking.projections.DetailRoom;
import com.dreamteam.mannhibooking.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	private RoomService roomService ;
	
	@Autowired
	public RoomController (RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping(value = "/{id}")
	public DetailRoom getDetailRoomByID(@PathVariable("id") long id){
		return roomService.findDetailRoomById(id);
	}
	@GetMapping(value = "/list")
	public List<DetailRoom> getDetailRooms(){
		return roomService.findDetaiRooms();
	}
	
	@PostMapping
	public RoomDTO createRoom(@RequestBody RoomDTO model){
		return roomService.create(model);
	}
}
