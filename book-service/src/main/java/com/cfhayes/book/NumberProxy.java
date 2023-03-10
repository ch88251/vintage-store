package com.cfhayes.book;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "isbn.proxy")
@Path("/api/v1/isbn")
public interface NumberProxy {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  IsbnThirteen generateIsbnNumbers();
}
