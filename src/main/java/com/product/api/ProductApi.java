package com.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Startup the prospect service spring boot application. This class is
 * responsible to load some prospect to a H2 database.
 * 
 * @author rafael.manzoni
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ProductApi {
	
	/**
	 * Log4J --> Interface
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProductApi.class);
	
	/**
	 * Init a Spring Boot Application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("ProductApi - main - init");
		new SpringApplicationBuilder(ProductApi.class).run(args);

	}

}
