package br.com.recode.exemplo10.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo10.modelo.negocio.Cliente;
import br.com.recode.exemplo10.modelo.negocio.Venda;


@Repository
public interface DadosVendas extends JpaRepository<Venda, Long> {

}
