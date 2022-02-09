package br.com.recode.exemplo08.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.exemplo08.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}