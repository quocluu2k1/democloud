package com.example.democloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemocloudApplication {
	
	@GetMapping("/")
    	public String demoString1(){
        	return "Hello world!!!";
    	}

	public static void main(String[] args) {
		SpringApplication.run(DemocloudApplication.class, args);
	}

}
