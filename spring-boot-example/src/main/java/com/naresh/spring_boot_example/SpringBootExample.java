package com.naresh.spring_boot_example;
import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;   
@SpringBootApplication  
@RestController
public class SpringBootExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootExample.class, args);  
		
	}
	 @RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World Example";
}
}