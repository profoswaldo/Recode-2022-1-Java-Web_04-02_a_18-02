package br.org.recode.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.recode.frontend.dao.CategoriaRepository;
import br.org.recode.frontend.model.Categoria;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping("/categorias")
	public List<Categoria> listaDeCategorias() {
		
		return categoriaRepository.findAll();	
	}
}