package com.example.pasteleria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pasteleria.model.Cliente;
import com.example.pasteleria.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienterepo;
	
	public List<Cliente> getAllClientes() {
		return (List<Cliente>) clienterepo.findAll();
	}
	
	public Cliente getClienteByRun(String run) {
		return clienterepo.findById(run).orElse(null);
	}
	
	public Cliente saveClientes(Cliente c) {
		return clienterepo.save(c);
	}
	
	public void deleteCliente(String run) {
		clienterepo.deleteById(run);
	}
}