package br.com.recode.exemplo09.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo09.entidades.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {

}