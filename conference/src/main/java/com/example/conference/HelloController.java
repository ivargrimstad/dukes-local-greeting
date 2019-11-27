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
@Path("/conference")
@Singleton
public class HelloController {

    @Inject
    private LocationService locationService;

    @GET
    public String sayHello() {
        return "Jakarta EE Tech Talk " + locationService.location();
    }
}
