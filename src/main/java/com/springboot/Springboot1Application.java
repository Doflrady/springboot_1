package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



//@ComponentScan("com.springboot.controller")

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
}
