package com.xantrix.webapp;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching
@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		  ConfigurableApplicationContext appContext = SpringApplication.run(Application.class, args);
	
		  List<String> beanList = Arrays.asList(appContext.getBeanDefinitionNames());
		  beanList.forEach( (bean) -> { 
			 log.info("[CREATED BEAN] -> {}", bean);
			   
			  return;
		  });
		  
		  log.info("[NUMBER OF BEANS IN CONTEXT] -> {}", appContext.getBeanDefinitionCount());
		  log.info("[ACTIVE PROFILE] -> {}", Arrays.asList(appContext.getEnvironment().getActiveProfiles()));
		  
		  log.info("=================================================================================================================================================================================================");
		  log.info("[RestController] -> {}", Arrays.asList(appContext.getBeanNamesForAnnotation(RestController.class)));
		  log.info("[Services] -> {}", Arrays.asList(appContext.getBeanNamesForAnnotation(Service.class)));
		  log.info("[Repositories] -> {}", Arrays.asList(appContext.getBeanNamesForAnnotation(Repository.class)));
		  log.info("=================================================================================================================================================================================================");
		  
		  log.info("[APPLICATION]  -> started");
	}
 
	@Override
	public void run(String... args) throws Exception {
		log.info("run - START - COMMAND-LINE-ARGS={}", Arrays.asList(args));
	}
}
