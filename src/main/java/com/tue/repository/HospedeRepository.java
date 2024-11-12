package com.tue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tue.entity.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede, Long>{
	
}
