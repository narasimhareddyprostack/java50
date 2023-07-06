package com.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Employee;
import com.jpa.repository.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository  empRepo;

	@Override
	public void run(String... args) throws Exception {
		//create document
		empRepo.save(new Employee(101,"Rahul","Rahul@gmail.com", 45000.00));
		empRepo.save(new Employee(102,"Sonia","Sonia@gmail.com", 45000.00));
		
		//read operation
		empRepo.findAll().forEach(doc->System.out.println(doc));
		

	}

}
