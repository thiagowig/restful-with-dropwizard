package br.com.zaul.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public class ClientResource {
	
	@GET
	@Path("/{clientId}")
	@Produces(value = MediaType.TEXT_PLAIN)
	public String getClient(@PathParam("clientId") String clientId) {
		return "Client number: " + clientId;
	}
}
