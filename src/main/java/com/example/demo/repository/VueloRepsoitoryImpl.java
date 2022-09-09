package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepsoitoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager entityManger;

	@Override
	public List<Vuelo> buscar(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManger
				.createQuery("SELECT v FROM Vuelo v WHERE v.origen := origen AND v.destino := destino AND v.fechaVuelo :=fechaVuelo",Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		
		return myQuery.getResultList();
		
	}

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManger.persist(vuelo);
	}

	@Override
	public Vuelo buscarVuelo(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManger.find(Vuelo.class, id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<Vuelo> myQuery = this.entityManger
				.createQuery("SELECT v FROM Vuelo v",Vuelo.class);
		return myQuery.getResultList();
	}
	
	
	
}
