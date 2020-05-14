package org.tama.todo.TaMa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.tama.todo.controller.demo"})
public class TaMaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaMaApplication.class, args);
	}

}
