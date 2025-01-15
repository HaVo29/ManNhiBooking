package com.dreamteam.mannhibooking.service;

import java.util.List;

import com.dreamteam.mannhibooking.dto.RoomDTO;
import com.dreamteam.mannhibooking.projections.DetailRoom;

public interface RoomService {

	RoomDTO create(RoomDTO roomDTO);
	DetailRoom findDetailRoomById(Long id);
	List<DetailRoom> findDetaiRooms();
}
