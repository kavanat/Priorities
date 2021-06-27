package com.tatsum.Priority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class PriorityApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(PriorityApplication.class, args);
	}

}
