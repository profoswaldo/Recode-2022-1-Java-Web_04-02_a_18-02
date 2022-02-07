package br.com.recode.exemplo04.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.exemplo04.entities.Category;
import br.com.recode.exemplo04.repositories.CategoryRepository;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;  //nao instanciar diretamente;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> lista = categoryRepository.findAll();

		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category cat = categoryRepository.findById(id);
		
		return ResponseEntity.ok().body(cat);
	}
	
}
