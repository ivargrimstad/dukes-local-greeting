/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.greeting;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
@Readiness
@ApplicationScoped
public class DukeReady implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("successful-check")
                .up()
                .withData("Duke", "Ready!")
                .withData("Location", "Sandusky")
                .build();
    }
}
