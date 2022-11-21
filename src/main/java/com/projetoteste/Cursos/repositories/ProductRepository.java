package com.projetoteste.Cursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.Cursos.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
