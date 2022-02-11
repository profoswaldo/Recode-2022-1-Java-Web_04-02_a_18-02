package br.com.recode.exemplo10.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.exemplo10.modelo.negocio.Cliente;
import br.com.recode.exemplo10.modelo.persistencia.DadosCliente;

@RestController
@RequestMapping(value = "/clientes")
public class ControleCliente {
	
	@Autowired
	private DadosCliente dadosCliente;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		
		List<Cliente> clientes = dadosCliente.findAll();

		return ResponseEntity.ok().body(clientes);
	}
	
	@GetMapping(value = "/{codigo_cli}")
	public ResponseEntity<Cliente> findById(@PathVariable Long codigo_cli){
		
		Cliente cliente = dadosCliente.findById(codigo_cli).get();
		
		return ResponseEntity.ok().body(cliente);
	}

}
