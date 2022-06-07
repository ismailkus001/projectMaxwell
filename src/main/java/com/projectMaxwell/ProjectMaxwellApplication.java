package com.projectMaxwell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan
@PropertySource(value = {"classpath:application.properties"})
public class ProjectMaxwellApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMaxwellApplication.class, args);
	}

}
