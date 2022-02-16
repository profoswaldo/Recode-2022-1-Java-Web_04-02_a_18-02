package br.org.recode.frontend.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.recode.frontend.model.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
