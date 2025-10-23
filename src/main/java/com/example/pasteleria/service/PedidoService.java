package com.example.pasteleria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pasteleria.model.Pedido;
import com.example.pasteleria.repository.PedidoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidorepo;

    public List<Pedido> getAllPedidos(){
        return (List<Pedido>)pedidorepo.findAll();
    }

    public Pedido getPedidoById(Long id){
        return pedidorepo.findById(id).orElse(null);
    }

    public Pedido savePedido(Pedido p){
        return pedidorepo.save(p);
    }

    public void deletePedido(Long id){
        pedidorepo.deleteById(id);
    }

    //Agregar logica extra como que calcule el total del pedido, etc
    
}
