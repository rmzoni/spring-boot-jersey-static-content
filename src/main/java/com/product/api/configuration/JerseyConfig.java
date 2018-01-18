package com.product.api.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.glassfish.jersey.servlet.ServletProperties;

/**
 * Jersey configuration for using JAX-RS with spring boot
 * @author rmzoni
 *
 */
@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
	
	/**
	 * Construct and register the API endpoints
	 */
	public JerseyConfig() {
		packages("com.product.api.endpoint");
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
	}

}
