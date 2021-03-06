package com.example.day;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 */
@Path("/day")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        return LocalDate.of(2020, Month.OCTOBER, 14).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
