package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@SpringBootApplication
public class TouadiNesserineSpringProjectApplication implements CommandLineRunner , WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TouadiNesserineSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	//render CSS and images (path changes so we have to fetch in the right place)
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
	        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");

	    }

}
