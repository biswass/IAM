package com.bits.service;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthService {

    public String healthCheck() {
        return "Service is healthy!";
    }

}
