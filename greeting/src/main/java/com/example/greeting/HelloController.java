package com.example.greeting;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Metered;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    @Inject
    @RestClient
    ConferenceService conferenceService;

    @Inject
    @RestClient
    TimeService timeService;

    @Inject
    @RestClient
    DayService dayService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Counted
    //@Metered(name = "foo")
    public String sayHello() {
        return "You have a " + conferenceService.conference() + " " + dayService.day() + " at " + timeService.time();
    }
}
