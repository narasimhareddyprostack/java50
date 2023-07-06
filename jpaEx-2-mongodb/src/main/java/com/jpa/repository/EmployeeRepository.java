package com.jpa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jpa.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
