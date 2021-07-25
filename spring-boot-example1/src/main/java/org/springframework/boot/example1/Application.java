package org.springframework.boot.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		SpringApplication springApplication = new SpringApplication(Application.class);
//		springApplication.run(args);
	}

}
