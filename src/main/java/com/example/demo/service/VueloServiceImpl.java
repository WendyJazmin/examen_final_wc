package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vuelo;
import com.example.demo.repository.IVueloRepository;

@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepository IVueloReposiktory;

	@Override
	public List<Vuelo> buscar(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		//Vuelo vuelo = 
		return null;
	}

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.IVueloReposiktory.insertar(vuelo);;
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.IVueloReposiktory.buscarTodos();
	}
}
