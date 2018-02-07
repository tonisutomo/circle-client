package com.circle.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "client" path)
 */
@Path("client")
public class ClientService {

	private RestClient client = new RestClient();
	
    @GET
    @Path("/circle/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Circle produceJSON( @PathParam("name") String name ) {
    		Circle circle = client.getJsonCircle(name);
        return circle;
    }	
    
    
}
