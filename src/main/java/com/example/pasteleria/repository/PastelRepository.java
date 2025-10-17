package com.example.pasteleria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.pasteleria.model.Pastel;

@Repository
public interface PastelRepository extends CrudRepository<Pastel, Long> {
	
}