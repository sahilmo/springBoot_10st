package com.sedar.springboot.basics.springbootin10st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10stApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10stApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(" :-> " + name + "\n");
		}
	}

}
