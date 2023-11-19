package com.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.HealthService;


@RestController
public class HealthController {
	
	@Autowired
	HealthService healthService;

    @RequestMapping(value="/health",method=RequestMethod.GET)
    String healthCheck() {
        return healthService.healthCheck();
    }

}
