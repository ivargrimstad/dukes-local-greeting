package com.example.day;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;
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
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
