package com.stay.positive.SpProj1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.stay.positive.bean.Banana;

@Configuration
@ComponentScan(basePackages = "com.stay.positive.SpProj1")
public class AppConfig {
	@Bean
	public Banana getBanana() {
		return new Banana();
	}
}
