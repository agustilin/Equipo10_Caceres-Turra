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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private LocalDate fechaePedido;
    private double total;
    private String estado;

    // Relación con Cliente
    @ManyToOne
    @JoinColumn(name = "cliente_rut")
    private Cliente cliente;

    // Relación con Pastel
    @ManyToMany
    @JoinTable(
        name = "pedido_pastel",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "pastel_id")
    )
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Pastel> pasteles;


}
