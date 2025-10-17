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

import com.example.pasteleria.model.Cliente;
import com.example.pasteleria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired 
	private ClienteService clienteserv;
	
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteserv.getAllClientes();
	}
	
	@GetMapping("/{run}")
	public Cliente getClienteByRun(@PathVariable String run) {
		return clienteserv.getClienteByRun(run);
	}
	
	@PostMapping
	public Cliente saveCliente(@RequestBody Cliente c) {
		return clienteserv.saveClientes(c);
	}
	
	@DeleteMapping("/{run}")
	public void deleteCliente(@PathVariable String run) {
		clienteserv.deleteCliente(run);
	}
}