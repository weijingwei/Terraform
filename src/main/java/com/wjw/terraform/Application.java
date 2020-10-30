package com.wjw.terraform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.wjw.terraform.*")
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// start application
		SpringApplication.run(Application.class, args);
	}
}
