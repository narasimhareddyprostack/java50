package com.psa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.bean.HelloBean;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	HelloBean obj;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		obj.sayHello();

	}

}
