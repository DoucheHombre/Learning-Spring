package com.stay.positive.SpProj1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stay.positive.bean.Banana;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// The use of AnnotationConfigApplicationContext and Configuration class -
		// AppConfig.class, tells Spring
		// that I am using annotations in my code for Dependency Injection and Object
		// Creation.
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Fruits apple = context.getBean(Apple.class);
		Fruits banana = context.getBean(Banana.class);
		apple.eatingwhichFruit();
		banana.eatingwhichFruit();
	}

}
