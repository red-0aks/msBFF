package com.wom.msbbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BBFApplication extends SpringBootServletInitializer {

//	@PostConstruct
//	public void init() {
//		log.info("Spring boot application running in {} timezone: {}", timeZone, new Date());
//	}

	public static void main(String[] args) {
		SpringApplication.run(BBFApplication.class);
	}




	
}
