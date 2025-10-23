package com.example.pasteleria.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pasteleria.model.Pastel;
import com.example.pasteleria.repository.PastelRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PastelService {
	
	private final PastelRepository pastelrepo;
	
	public List<Pastel> getPasteles() {
		return (List<Pastel>) pastelrepo.findAll();
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