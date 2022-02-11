package br.com.recode.exemplo10.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo10.modelo.negocio.Cliente;


@Repository
public interface DadosCliente extends JpaRepository<Cliente, Long> {

}
