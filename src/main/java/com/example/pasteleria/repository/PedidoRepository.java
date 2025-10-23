package com.example.pasteleria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pasteleria.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
