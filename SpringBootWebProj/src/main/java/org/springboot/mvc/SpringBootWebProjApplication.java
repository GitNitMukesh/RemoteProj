package org.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackages="org.springboot.mvc.controller")
public class SpringBootWebProjApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebProjApplication.class, args);
	}
	private void sysout() {
		System.out.println("hii");

	}
	
	
	
}
