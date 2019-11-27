package com.example.greeting;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    @Inject
    @RestClient
    private ConferenceService conferenceService;

    @Inject
    @RestClient
    private TimeService timeService;

    @Inject
    @RestClient
    private DayService dayService;

    @GET
    @Counted
    public String sayHello() {
        return "You have " + conferenceService.conference() + " " + dayService.day() + " at " + timeService.time();
    }
}
