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

		// Alien obj = new Alien();         // Here We can do that and it will work
		// String print = obj.Start();
		// System.out.println(print);

		
		// NOTE : - If we are creating manual object ( like normal java methods) then spring says 
		// if you are crating object of a class so you have handel it and manage it i am not responsible.


		// what Spring Says : 
		// I can give you object and i will manage and handle but for this you have to tell me and this is recommended approach.
		
		// Now spring will create object

		Alien obj = context.getBean(Alien.class);
		obj.Start();

	}

}
