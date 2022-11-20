package com.projetoteste.Cursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.Cursos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	

}
