package br.com.recorde.exemplo06;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recorde.exemplo06.entidades.Aluno;
import br.com.recorde.exemplo06.entidades.Turma;
import br.com.recorde.exemplo06.repositorios.AlunoRepository;
import br.com.recorde.exemplo06.repositorios.TurmaRepository;

@SpringBootApplication
public class Exemplo06Application implements CommandLineRunner{
	
	
	@Autowired
	private TurmaRepository turmaRepository; 
	
	@Autowired
	private AlunoRepository alunoRepository; 
	


	public static void main(String[] args) {
		SpringApplication.run(Exemplo06Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Turma turmaJava = new Turma(1L, 11L, "Java Web");
		Turma turmaReact = new Turma(2L, 22L, "ReactJS");
		
		Aluno aluno1 = new Aluno(10L, "1010", "Oswaldo", 10,10);
		Aluno aluno2 = new Aluno(20L, "2020", "Gisele", 9,9);
		Aluno aluno3 = new Aluno(30L, "3030", "Giovanna", 8,8);
		Aluno aluno4 = new Aluno(40L, "4040", "Giulianna", 7,7);
		
		aluno1.setTurma(turmaJava);
		aluno2.setTurma(turmaJava);
		aluno3.setTurma(turmaReact);
		aluno4.setTurma(turmaReact);
		

		turmaJava.getAlunos().addAll(Arrays.asList(aluno1, aluno2));
		turmaReact.getAlunos().addAll(Arrays.asList(aluno3, aluno4));
		
		turmaRepository.save(turmaJava);
		turmaRepository.save(turmaReact);
		
		alunoRepository.save(aluno1);
		alunoRepository.save(aluno2);
		alunoRepository.save(aluno3);
		alunoRepository.save(aluno4);
		
		
	}

}
