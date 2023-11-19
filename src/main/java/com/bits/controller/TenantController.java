package com.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.Tenant;
import com.bits.service.TenantService;
@RestController
public class TenantController {
	@Autowired
	TenantService tenantService;

    @RequestMapping(value="/tenant",method=RequestMethod.POST)
    void createTenant(@RequestBody Tenant tenant) {
        tenantService.createTenant(tenant);
    }
}
