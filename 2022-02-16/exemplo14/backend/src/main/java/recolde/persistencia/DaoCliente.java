package recolde.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import recolde.modelos.Cliente;

public interface DaoCliente extends JpaRepository<Cliente, Long> {
}