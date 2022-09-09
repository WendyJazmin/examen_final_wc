package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Vuelo;

public interface IVueloService {

	public List<Vuelo> buscar(String origen, String destino, LocalDateTime fechaVuelo);

	public void insertar(Vuelo vuelo);
	
	public List<Vuelo> buscarTodos();
}
