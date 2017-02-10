package com.backend.collaborationback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

	}

}
