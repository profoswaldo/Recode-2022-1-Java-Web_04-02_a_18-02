package br.com.recode.exemplo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.exemplo10.modelo.negocio.Cliente;
import br.com.recode.exemplo10.modelo.negocio.Venda;
import br.com.recode.exemplo10.modelo.persistencia.DadosClientes;
import br.com.recode.exemplo10.modelo.persistencia.DadosVendas;

@SpringBootApplication
public class ExemploApplication implements CommandLineRunner{
	
	@Autowired
	private DadosClientes dadosClientes;
	
	@Autowired
	private DadosVendas dadosVendas;

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Dados CLientes
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(null);
		cliente1.setCodigo_cli(1111L);
		cliente1.setNome("Oswaldo");
		cliente1.setEndereco("Rua XXX nr xx");
		cliente1.setTelefone("9999-9999");
		cliente1.setEmail("oswaldo@recodepro.br");
		cliente1.setData("01/02/2022");
		
		Cliente cliente2 = new Cliente(null, 2222L, "Vania", "Rua YYY nr yy", "9888-8888", "vania@recodepro.br", "23/01/2022");
		
		Cliente cliente3 = 
				new Cliente(null, 3333L, "Cristiano", "Rua ZZZ nr zz", "9777-7777", "cristiano@recodepro.br", "17/11/2021");
		
		
		// Dados Vendas
		
		
		Venda venda1 = 
				new Venda(null, 1100L, "22/02/2022", "08:00");
		
		Venda venda2 = 
				new Venda(null, 2200L, "25/02/2022", "09:00");
		Venda venda3 = 
				new Venda(null, 3300L, "27/02/2022", "10:00");
		Venda venda4 = 
				new Venda(null, 4400L, "20/02/2022", "11:00");
		Venda venda5 = 
				new Venda(null, 5500L, "18/02/2022", "11:30");
		
		
		//Persistencia Cliente
		
		dadosClientes.save(cliente1);
		dadosClientes.save(cliente2);
		dadosClientes.save(cliente3);
		
		
		//Persistencia Vendas
		
		dadosVendas.save(venda1);
		dadosVendas.save(venda2);
		dadosVendas.save(venda3);
		dadosVendas.save(venda4);
		dadosVendas.save(venda5);
		

		
	}
	
	
	

}
