package com.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Product;
import com.jpa.repo.ProductRepository;

@Component
public class MyRunnner implements CommandLineRunner {
    
	@Autowired
	ProductRepository prodRepo;
	@Override
	public void run(String... args) throws Exception {
		//insert Data
		prodRepo.save(new Product("Iphone 14", 56000.00));
		prodRepo.save(new Product("Iphone 15", 156000.00));
		prodRepo.save(new Product("Iphone 16", 256000.00));
		prodRepo.save(new Product("Iphone 17", 356000.00));
		/*
		List<Product> products= prodRepo.findAll();
		
		for(Product product:products) {
			System.out.println(product);
		}
		//prodRepo.
		 
		 */
		prodRepo.findAll()
		         .forEach(System.out::println);
		
	}

}
