package br.org.recode.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.recode.frontend.dao.UserRepository;
import br.org.recode.frontend.model.User;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("Oswaldo", "Peres", "oswaldo@recodepro.br"));
		userRepo.save(new User("Gisele", "Felippe", "gisele@recodepro.br"));
		userRepo.save(new User("Giovanna", "Felippe", "giovanna@recodepro.br"));
		userRepo.save(new User("Giulianna", "Felippe", "giulianna@recodepro.br"));
	}

}

