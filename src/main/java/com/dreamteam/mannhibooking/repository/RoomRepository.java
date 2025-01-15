package com.dreamteam.mannhibooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dreamteam.mannhibooking.entity.RoomEntity;
import com.dreamteam.mannhibooking.projections.DetailRoom;


@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {

	 Optional<RoomEntity> findById(Long id);
	 
	 @Transactional
	 @Modifying
	 @Query(value ="UPDATE ROOMPF SET validflag = ?1 WHERE id = ?2 ",nativeQuery = true)
	 void updateRoomByID(int validflag,Long id);
	 
	 @Transactional
	 @Modifying
	 @Query(value ="UPDATE ROOMPF SET validflag = ?1 WHERE id IN :idList",nativeQuery = true)
	 void updateRoomList(int validflag,List<Long> idList);
	 
	 DetailRoom findDetailRoomById(Long id);// Dùng interface projection
	 
	// Hoặc dùng trong query methods
	    @Query("select u.name as name, u.totalPeople as totalPeople,u.totalBed as totalBed  ,u.price as price from RoomEntity u ")
	 List<DetailRoom> findDetailRoooms();
}
