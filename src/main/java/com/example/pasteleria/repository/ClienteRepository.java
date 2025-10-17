package com.example.pasteleria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.pasteleria.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

}