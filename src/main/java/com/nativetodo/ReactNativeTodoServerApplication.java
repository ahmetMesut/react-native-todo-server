package com.nativetodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nativetodo")
@EntityScan("com.nativetodo.model")
public class ReactNativeTodoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactNativeTodoServerApplication.class, args);
	}
}
