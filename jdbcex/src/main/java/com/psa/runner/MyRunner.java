package com.psa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.dao.DaoImpl;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	DaoImpl dao;
	@Override
	public void run(String... args) throws Exception {
		//insert data into db;
		//dao.insertRecords();
		  dao.deleteRecords();
		List list= dao.getRecords();
		list.forEach(rec -> System.out.println(rec));

	}

}
