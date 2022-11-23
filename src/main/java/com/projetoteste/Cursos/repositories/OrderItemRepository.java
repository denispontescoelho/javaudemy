package com.projetoteste.Cursos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.Cursos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	

}
