package com.java.CoreJavaInterviewPrep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.java")
public class CoreJavaInterviewPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreJavaInterviewPrepApplication.class, args);
	}

}
