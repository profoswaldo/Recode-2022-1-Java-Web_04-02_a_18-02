package br.org.recode.frontend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.recode.frontend.dao.CategoriaRepository;
import br.org.recode.frontend.dao.ProdutoRepository;
import br.org.recode.frontend.model.Categoria;
import br.org.recode.frontend.model.Produto;

@SpringBootApplication
public class CategoriaBackendApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(CategoriaBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		

		Produto p1 = new Produto(null, "TV", 2200.00, cat1);
		Produto p2 = new Produto(null, "Domain Driven Design", 120.00, cat2);
		Produto p3 = new Produto(null, "PS5", 2800.00, cat1);
		Produto p4 = new Produto(null, "Docker", 100.00, cat2);

		cat1.getProdutos().addAll(Arrays.asList(p1, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);
		produtoRepository.save(p4);
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
		
		

	}

}

