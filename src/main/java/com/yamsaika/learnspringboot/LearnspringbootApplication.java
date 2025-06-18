package com.yamsaika.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnspringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnspringbootApplication.class, args);
		/*
		User userObj = new User();
		userObj.process();
		/***
			Throws NullPointerException since Order object is not initialzied
			order is @lazy, @component class
		 */

		 //context.close();
	}

}
