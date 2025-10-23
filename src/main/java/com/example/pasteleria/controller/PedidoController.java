package com.example.pasteleria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pasteleria.model.Pedido;
import com.example.pasteleria.service.PedidoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoserv;
    
    @GetMapping
    public List<Pedido> getPedidos(){
        return pedidoserv.getAllPedidos();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Long id) {
        return pedidoserv.getPedidoById(id);
    }

    @PostMapping
    public Pedido savePedido(@RequestBody Pedido p) {
        return pedidoserv.savePedido(p);
    }

    public void deletePedido(@PathVariable Long id) {
        pedidoserv.deletePedido(id);
    }


}
