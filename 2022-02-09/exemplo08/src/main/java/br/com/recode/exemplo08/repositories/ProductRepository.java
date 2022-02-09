package br.com.recode.exemplo08.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo08.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
