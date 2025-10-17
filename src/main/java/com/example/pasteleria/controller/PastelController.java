package com.example.pasteleria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pasteleria.model.Pastel;
import com.example.pasteleria.service.PastelService;

@RestController
@RequestMapping("/pasteles")
public class PastelController {

	@Autowired
	private PastelService pastelservice;
	
	@GetMapping
	public List<Pastel> getPasteles() {
		return (List<Pastel>) pastelservice.getPasteles();
	}
	
	@GetMapping("/{id}")
	public Pastel getPastelById(@PathVariable Long id) {
		return pastelservice.getPastelById(id);
	}
	
	@PostMapping
	public Pastel guardarapastel(@RequestBody Pastel p) {
		return pastelservice.savePastel(p);
	}
	
	@DeleteMapping("/{id}")
	public void deletePastelById(@PathVariable Long id) {
		pastelservice.deletePastel(id);
	}
}