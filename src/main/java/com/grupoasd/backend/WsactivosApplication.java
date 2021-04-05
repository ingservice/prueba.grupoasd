package com.grupoasd.backend;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WsactivosApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WsactivosApplication.class, args);
	}
	
	@PostConstruct
    public void init(){
      TimeZone.setDefault(TimeZone.getTimeZone("UTC-5"));
    }

}
