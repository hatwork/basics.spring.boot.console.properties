package com.hatim.basics.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class CustomConfiguration {

	@Value("#{vsplit.valueToList('${name}')}")
	public List<String> names;

	@Value("${multiLine}")
	public String multiLine;

}
