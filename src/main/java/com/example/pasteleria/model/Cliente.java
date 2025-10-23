package com.example.pasteleria.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	@Id
	private String run;
	
	private String nombre;
	private String apellido;
	private int edad;
	private String correo;

	// Relación con Pedido
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
    private List<Pedido> pedidos;
}