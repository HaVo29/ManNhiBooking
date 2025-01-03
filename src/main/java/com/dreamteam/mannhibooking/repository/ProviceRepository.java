package com.dreamteam.mannhibooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreamteam.mannhibooking.entity.ProviceEntity;

@Repository
public interface ProviceRepository extends JpaRepository<ProviceEntity, Long> {

	 Optional<ProviceEntity> findById(Long id);
}
