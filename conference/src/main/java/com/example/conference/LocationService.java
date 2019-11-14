package com.example.conference;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/location")
@RegisterRestClient
@RegisterClientHeaders
@Dependent
public interface LocationService {

    @GET
    String location();
}
