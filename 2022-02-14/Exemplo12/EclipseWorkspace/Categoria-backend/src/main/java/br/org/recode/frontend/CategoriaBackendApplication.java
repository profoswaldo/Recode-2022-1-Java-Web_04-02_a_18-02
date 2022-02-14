package br.org.recode.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.recode.frontend.dao.CategoriaRepository;
import br.org.recode.frontend.model.Categoria;

@SpringBootApplication
public class CategoriaBackendApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(CategoriaBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		

	}

}

