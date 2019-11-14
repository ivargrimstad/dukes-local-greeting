package com.example.conference;

import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Traced
@Path("/hello")
@Singleton
public class HelloController {

    @Inject
    private LocationService locationService;

    @GET
    public String sayHello() {
        return "Devoxx " + locationService.location();
    }
}
