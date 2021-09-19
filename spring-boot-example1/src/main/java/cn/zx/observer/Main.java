package cn.zx.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	// ApplicationStartingEvent 无法监听
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
