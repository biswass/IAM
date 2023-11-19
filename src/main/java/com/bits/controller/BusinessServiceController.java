package com.bits.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.BusinessService;
import com.bits.service.BusinessServiceService;


@RestController
public class BusinessServiceController {
	
	@Autowired
	BusinessServiceService serviceService;
	
	@RequestMapping(value="/service",method=RequestMethod.GET)
    List<BusinessService> getServices() {
        return serviceService.getAllServices();
    }

}
