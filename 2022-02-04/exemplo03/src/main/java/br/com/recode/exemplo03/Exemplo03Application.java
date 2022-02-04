package br.com.recode.exemplo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.exemplo03.entities.Category;
import br.com.recode.exemplo03.repositories.CategoryRepository;

@SpringBootApplication
public class Exemplo03Application implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;  //nao instanciar diretamente;
	

	public static void main(String[] args) {
		SpringApplication.run(Exemplo03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 =new Category(1L, "Cadernos");
		Category cat2 = new Category(2L, "Livros");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
