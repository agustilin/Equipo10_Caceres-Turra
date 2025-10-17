package com.example.pasteleria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pastel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String sabor;
	private float tamanio;
	private String forma;

	public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getSabor() {
    	return sabor;
    }
    
    public void setSabor(String sabor) {
    	this.sabor = sabor;
    }
    
    public float getTamanio() {
    	return tamanio;
    }
    
    public void setTamanio(float tamanio) {
    	this.tamanio = tamanio;
    }
   
    public String getForma() {
    	return forma;
    }
    
    public void setForma(String forma) {
    	this.forma = forma;
    }
}