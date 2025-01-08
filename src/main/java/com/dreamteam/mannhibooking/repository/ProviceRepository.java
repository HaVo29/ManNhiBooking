package com.dreamteam.mannhibooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dreamteam.mannhibooking.entity.ProviceEntity;


@Repository
public interface ProviceRepository extends JpaRepository<ProviceEntity, Long> {

	 Optional<ProviceEntity> findById(Long id);
	 
	 @Transactional
	 @Modifying
	 @Query(value ="UPDATE PROVPF SET validflag = ?1 WHERE id = ?2 ",nativeQuery = true)
	 void updateProviceByID(int validflag,Long id);
	 
	 @Transactional
	 @Modifying
	 @Query("UPDATE ProviceEntity n SET n.validflag = :validflag WHERE n.id IN :idList")
	 void updateNewsList(List<Long> idList,int validflag);
	 
}
