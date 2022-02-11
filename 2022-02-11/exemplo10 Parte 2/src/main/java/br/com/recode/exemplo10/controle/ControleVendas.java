package br.com.recode.exemplo10.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.exemplo10.modelo.negocio.Venda;
import br.com.recode.exemplo10.modelo.persistencia.DadosVendas;

@RestController
@RequestMapping(value = "/vendas")
public class ControleVendas {
	
	@Autowired
	private DadosVendas dadosVendas;
	
	@GetMapping
	public ResponseEntity<List<Venda>> findAll(){
		
		List<Venda> vendas = dadosVendas.findAll();

		return ResponseEntity.ok().body(vendas);
	}
	
	@GetMapping(value = "/{codigo_venda}")
	public ResponseEntity<Venda> findById(@PathVariable Long codigo_venda){
		
		Venda venda = dadosVendas.findById(codigo_venda).get();
		
		return ResponseEntity.ok().body(venda);
	}

}
