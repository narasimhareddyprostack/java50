package com.psa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.bean.HelloBean;


@Component
public class MyRunnner implements CommandLineRunner {

	
	@Autowired
	HelloBean bean;
	@Override
	public void run(String... args) throws Exception {
		bean.sayHello();

	}

}
