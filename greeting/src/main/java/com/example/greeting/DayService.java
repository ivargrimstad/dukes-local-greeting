package com.example.greeting;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("day")
@RegisterRestClient
@RegisterClientHeaders
@Dependent
public interface DayService {

    @GET
    String day();
}
