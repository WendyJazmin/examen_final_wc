package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Vuelo;

public interface IVueloRepository {
	
	public List<Vuelo> buscar(String origen, String destino, LocalDateTime fechaVuelo);

	public void insertar(Vuelo vuelo);
	
	public Vuelo buscarVuelo(Integer id);
	
	public List<Vuelo> buscarTodos();
}
