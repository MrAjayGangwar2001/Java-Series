package com.spring.JDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.JDBC.Model.Alien;
import com.spring.JDBC.Repository.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien = context.getBean(Alien.class);

		alien.setId(101);
		alien.setName("Ajay");
		alien.setCourse("Full stack Java Developer");


		AlienRepo AR = context.getBean(AlienRepo.class);
		AR.saveData(alien);

		System.out.println(AR.GetAllData());
	}

}
