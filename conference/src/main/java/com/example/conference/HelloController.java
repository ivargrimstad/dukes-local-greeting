package com.example.conference;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/conference")
@Singleton
public class HelloController {
@Inject
@RestClient
private LocationService locationService;

    @GET
    public String sayHello() {
        return "Microservice talk " + locationService.location();
    }
}
