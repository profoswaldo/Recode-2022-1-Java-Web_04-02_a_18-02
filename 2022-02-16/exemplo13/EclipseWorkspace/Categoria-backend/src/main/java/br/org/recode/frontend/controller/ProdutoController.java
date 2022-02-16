package br.org.recode.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.recode.frontend.dao.ProdutoRepository;
import br.org.recode.frontend.model.Produto;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listaDeProdutos() {
		
		return produtoRepository.findAll();	
	}
}