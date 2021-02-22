package com.xantrix.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	public CorsConfig() {
		super();
	}
	
	@Override
	 public void addCorsMappings(CorsRegistry registry) {
		registry
				.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("PUT", "DELETE", "GET", "POST")
				.allowedHeaders("*")
				.exposedHeaders("header1", "header2")
				.allowCredentials(false)
				.maxAge(3600);
	}

	@Bean(name = "corsConfigurer")
	public WebMvcConfigurer getCorsConfigurer() {
		CorsConfig filterCorsConfig = new CorsConfig();

		return filterCorsConfig;
	}

	

}
