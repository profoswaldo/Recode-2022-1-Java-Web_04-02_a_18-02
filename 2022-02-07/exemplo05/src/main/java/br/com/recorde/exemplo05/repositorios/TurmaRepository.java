package br.com.recorde.exemplo05.repositorios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recorde.exemplo05.entidades.Turma;


@Component
public class TurmaRepository {
	
	private Map<Long, Turma> map = new HashMap<Long, Turma>();
	
	public void save(Turma turma) {
		map.put(turma.getCodigo(), turma);
	}
	
    public Turma findById(Long codigo) {
		return map.get(codigo);
	}

    public List<Turma> findAll() {
		return new ArrayList<Turma>(map.values());
	}


}
