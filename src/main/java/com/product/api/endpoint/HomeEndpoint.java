package com.product.api.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Consumes("application/json")
@Produces("application/json")
@Path("/home")
public class HomeEndpoint {
	
	
	@GET
	@Path(value="/detail")
	public String getProducts() {
		return "home";
	}
	
}
