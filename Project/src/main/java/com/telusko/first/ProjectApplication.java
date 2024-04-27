package com.telusko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		
		Alien obj =context.getBean(Alien.class);
		obj.code();
	}

}
