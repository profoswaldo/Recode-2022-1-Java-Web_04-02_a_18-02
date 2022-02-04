package br.com.recode.exemplo02.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.exemplo02.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> lista = new ArrayList<Category>(); // gambiarra provisória
		
		lista.add(new Category(1L, "Cadernos")); // gambiarra provisória
		lista.add(new Category(2L, "Livros")); // gambiarra provisória

		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category cat = new Category(1L, "Cadernos"); // gambiarra provisória
		
		return ResponseEntity.ok().body(cat);
	}
	
}
