package com.example.time;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 */
@Path("/time")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        return LocalTime.of(16, 20).format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
