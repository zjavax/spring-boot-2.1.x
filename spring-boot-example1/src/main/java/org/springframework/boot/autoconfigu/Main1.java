package org.springframework.boot.autoconfigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses=TigerProperties.class)
public class Main1 {

	public static void main(String[] args) {

		SpringApplication.run(Main1.class, args);
	}
}
