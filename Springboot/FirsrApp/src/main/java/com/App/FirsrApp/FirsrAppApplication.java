package com.App.FirsrApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirsrAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FirsrAppApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(FirsrAppApplication.class, args);

		System.out.println("Hey Alien ! This is My First App and Learning fron Youtube Telusko");

		

		// Now spring will create object

		Alien obj = context.getBean(Alien.class);
		obj.Start();

	}

}
