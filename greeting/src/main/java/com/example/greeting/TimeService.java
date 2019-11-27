package com.example.greeting;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalTime;

@Path("time")
@RegisterRestClient
@RegisterClientHeaders
@Dependent
public interface TimeService {

    @GET
    @Fallback(fallbackMethod = "now")
    String time();

    default String now() {
        return "??:??";
    }
}
