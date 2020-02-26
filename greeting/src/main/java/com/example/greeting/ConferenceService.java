package com.example.greeting;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient
@RegisterClientHeaders
@Path("/conference")
@Dependent
public interface ConferenceService {

    @GET
    @Timeout(500)
    @Fallback(fallbackMethod = "sayIt")
    String conference();

    default String sayIt() {
        return "Dude, look out the window!";
    }
}
