package br.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.recode.model.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Long>{

}
