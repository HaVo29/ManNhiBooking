package com.dreamteam.mannhibooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dreamteam.mannhibooking.entity.ProviceEntity;

@Repository
public interface ProviceRepository extends JpaRepository<ProviceEntity, Long> {

	 Optional<ProviceEntity> findById(Long id);
	 
	 @Modifying
	 @Query("UPDATE PROVPF n SET n.validflag = :newValidflag WHERE n.id = :id")
	 int updateProviceByID(@Param("newValidflag") String newValidflag, @Param("id") Long id);
	 
	 @Modifying
	 @Query("UPDATE PROVPF n SET n.validflag = :newValidflag WHERE n.id IN :idList")
	 void updateNewsList(@Param("idList") List<Long> idList, @Param("newValidflag") String newValidflag);
	 
}
