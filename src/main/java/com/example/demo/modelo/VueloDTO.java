package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


public class VueloDTO {

	
	private String numero;
	
	private String origen;
	
	private String destino;
	
	private BigDecimal valorAsiento; //individual
	
	private String nombreAvion;
	
	public VueloDTO() {
		
	}

	public VueloDTO(String numero, String origen, String destino, BigDecimal valorAsiento, String nombreAvion) {
		super();
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.valorAsiento = valorAsiento;
		this.nombreAvion = nombreAvion;
	}
	
	
	

	
}
