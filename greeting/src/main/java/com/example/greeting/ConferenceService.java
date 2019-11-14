package com.example.greeting;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
@RegisterRestClient
@RegisterClientHeaders
@Dependent
public interface ConferenceService {

    @Timeout(500)
    @Fallback(fallbackMethod = "home")
    @GET
    String conference();

    default String home() {
        return "Home";
    }
}
