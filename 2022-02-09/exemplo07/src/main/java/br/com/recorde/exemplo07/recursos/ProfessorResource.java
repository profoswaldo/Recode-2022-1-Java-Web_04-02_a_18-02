package br.com.recorde.exemplo07.recursos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recorde.exemplo07.entidades.Aluno;
import br.com.recorde.exemplo07.entidades.Professor;
import br.com.recorde.exemplo07.repositorios.ProfessorRepository;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorResource {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping
	public ResponseEntity<List<Professor>> findAll(){
		
		List<Professor> professores = professorRepository.findAll();

		return ResponseEntity.ok().body(professores);
	}
	
	@GetMapping(value = "/{matricula}")
	public ResponseEntity<Professor> findById(@PathVariable String matricula){
		
		Professor professor = professorRepository.findById(matricula);
		
		return ResponseEntity.ok().body(professor);
	}
	

}
