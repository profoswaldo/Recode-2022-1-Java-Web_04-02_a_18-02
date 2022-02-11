package br.com.recode.exemplo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.exemplo10.modelo.negocio.Cliente;
import br.com.recode.exemplo10.modelo.persistencia.DadosCliente;

@SpringBootApplication
public class ExemploApplication implements CommandLineRunner{
	
	@Autowired
	private DadosCliente dadosCliente;

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(null);
		cliente1.setCodigo_cli(1111L);
		cliente1.setNome("Oswaldo");
		cliente1.setEndereco("Rua XXX nr xx");
		cliente1.setTelefone("9999-9999");
		cliente1.setEmail("oswaldo@recodepro.br");
		cliente1.setData("01/02/2022");
		
		Cliente cliente2 = 
				new Cliente(null, 2222L, 
				            "Vania", "Rua YYY nr yy", "9888-8888", 
				            "vania@recodepro.br", "23/01/2022");
		
		Cliente cliente3 = 
				new Cliente(null, 3333L, "Cristiano", "Rua ZZZ nr zz", 
						"9777-7777", "cristiano@recodepro.br", "17/11/2021");
		
		
		dadosCliente.save(cliente1);
		dadosCliente.save(cliente2);
		dadosCliente.save(cliente3);
		
	}

}
