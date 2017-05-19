package com.spring.boot.mvc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.spring.*"})
@RestController
public class RunAppMain {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Yesubabu";
	}

	public static void main(String[] args) {
		SpringApplication.run(RunAppMain.class, args);

	}

}
