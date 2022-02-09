package br.com.recode.exemplo09.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo09.entidades.Turma;


@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}