package com.hatim.basics.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.hatim.basics.springboot.controller.CustomConfiguration;


@SpringBootApplication
@ComponentScan(basePackages="com.hatim.basics.springboot") 	
public class BasicsSpringBootConsolePropertiesApplication {
	
	@Autowired 
	private CustomConfiguration cc;
	
	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootConsolePropertiesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		
		for( String str : cc.names ) {
			System.out.println(str);
		}
		
		System.out.println(cc.multiLine);
		
		return null;
	}
	
}
