package br.com.recorde.exemplo07.repositorios;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recorde.exemplo07.entidades.Professor;
import br.com.recorde.exemplo07.entidades.Turma;


@Component
public class ProfessorRepository {
	
	private Map<String, Professor> map = new HashMap<String, Professor>();
	
	public void save(Professor professor) {
		map.put(professor.getMatricula(), professor);
	}
	
    public Professor findById(String matricula) {
		return map.get(matricula);
	}

    public List<Professor> findAll() {
		return new ArrayList<Professor>(map.values());
	}


}
