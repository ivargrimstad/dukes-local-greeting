package com.example.location;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/location")
@Singleton
public class HelloController {

    @Inject
    @ConfigProperty(name = "place", defaultValue = "You'll need to look out the window")
    String place;

    @GET
    @RolesAllowed("protected")
    public String sayHello() {
        return place;
    }
}
