package br.org.recode.frontend.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.recode.frontend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
