package br.com.recorde.exemplo06.recursos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recorde.exemplo06.entidades.Aluno;
import br.com.recorde.exemplo06.repositorios.AlunoRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		
		List<Aluno> alunos = alunoRepository.findAll();

		return ResponseEntity.ok().body(alunos);
	}
	
	@GetMapping(value = "/{matricula}")
	public ResponseEntity<Aluno> findById(@PathVariable String matricula){
		
		Aluno aluno = alunoRepository.findById(matricula);
		
		return ResponseEntity.ok().body(aluno);
	}
	

}
