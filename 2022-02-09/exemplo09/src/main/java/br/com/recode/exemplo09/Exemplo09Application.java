package br.com.recode.exemplo09;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.exemplo09.entidades.Aluno;
import br.com.recode.exemplo09.entidades.Turma;
import br.com.recode.exemplo09.repositorios.AlunoRepository;
import br.com.recode.exemplo09.repositorios.TurmaRepository;



@SpringBootApplication
public class Exemplo09Application  implements CommandLineRunner{
	
	
	@Autowired
	private TurmaRepository turmaRepository; 
	
	@Autowired
	private AlunoRepository alunoRepository; 
	



	public static void main(String[] args) {
		SpringApplication.run(Exemplo09Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		Turma turmaJava = new Turma();
		turmaJava.setId(null);
		turmaJava.setCodigo(11L);
		turmaJava.setCurso("Java Web");
		
		Turma turmaReact = new Turma(null, 22L, "ReactJS");
		
		Aluno aluno1 = new Aluno();
		aluno1.setId(null);
		aluno1.setMatricula("1010");
		aluno1.setNome("Oswaldo");
		aluno1.setTeste(10);
		aluno1.setProva(10);
		
		Aluno aluno2 = new Aluno(null, "2020", "Gisele", 9,9);
		Aluno aluno3 = new Aluno(null, "3030", "Giovanna", 8,8);
		Aluno aluno4 = new Aluno(null, "4040", "Giulianna", 7,7);
		
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
