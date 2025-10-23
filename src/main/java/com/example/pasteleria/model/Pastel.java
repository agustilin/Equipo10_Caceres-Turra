package com.example.pasteleria.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pastel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String sabor;
	private double tamanio;
	private String forma;
	private double precio;

	@ManyToMany(mappedBy = "pasteles")
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Pedido> pedidos;
}