package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Vuelo;
import com.example.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelos")
public class VueloController {

	@Autowired
	private IVueloService iVueloService;
	
	//GET
	
		@GetMapping("/buscar")
		public String buscarTodos(Model modelo){
			List<Vuelo> lista = this.iVueloService.buscarTodos();
			modelo.addAttribute("vuelos",lista);
			return "vistaListaVuelos";
		}
		
		@PostMapping("/insertar")
		public String insertarVuelo(Vuelo vuelo) {
			this.iVueloService.insertar(vuelo);
			return "redirect:/vuelos/buscar";
		}
}
