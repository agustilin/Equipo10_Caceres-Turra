package com.example.pasteleria.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private LocalDate fechaePedido;
    private double total;
    private String estado;

    //getters y setters
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaePedido() {
        return fechaePedido;
    }
    public void setFechaePedido(LocalDate fechaePedido) {
        this.fechaePedido = fechaePedido;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


    @ManyToOne
    @JoinColumn(name = "cliente_rut")
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
        name = "pedido_pastel",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "pastel_id")
    )
    private List<Pastel> pasteles;


}
