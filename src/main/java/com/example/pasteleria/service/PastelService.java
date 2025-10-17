package com.example.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasteleria.model.Pastel;
import com.example.pasteleria.repository.PastelRepository;

@Service
public class PastelService {
	
	@Autowired
	private PastelRepository pastelrepo;
	
	public Iterable<Pastel> getPasteles() {
		return pastelrepo.findAll();
	}
	
	public Pastel getPastelById(Long id) {
		return pastelrepo.findById(id).orElse(null);
	}
	
	public Pastel savePastel(Pastel p) {
		return pastelrepo.save(p);
	}
	
	public void deletePastel(Long id) {
		pastelrepo.deleteById(id);
	}
}