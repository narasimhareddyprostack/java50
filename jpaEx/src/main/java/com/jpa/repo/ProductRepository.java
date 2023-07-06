package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
