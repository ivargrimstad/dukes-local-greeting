package com.example.demo;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.annotation.security.RolesAllowed;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;

/**
 *
 */
@Path("/location")
@Singleton
public class HelloController {

    @Inject
    @ConfigProperty(name = "place", defaultValue = "somewhere ")
    String place;

    @GET
    @RolesAllowed("protected")
    public String sayHello() {
        return "at " + place;
    }

}
