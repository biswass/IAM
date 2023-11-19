package com.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.BusinessService;
import com.bits.model.Tenant;
import com.bits.service.BusinessServiceService;
import com.bits.service.SubscriptionService;
import com.bits.service.TenantService;
@RestController
public class SubscriptionController {
	
	@Autowired
	SubscriptionService subscriptionService;
	
	@Autowired
	TenantService tenantService;
	
	@Autowired
	BusinessServiceService businessServiceService;

    @RequestMapping(value="/subscription",method=RequestMethod.POST)
    void createSubscription(@RequestBody Tenant tenant, BusinessService businessService) {
    	Tenant dbTenant = tenantService.getTenantById(tenant.getId());
    	BusinessService dbBusinessService = businessServiceService.getBusinessServiceById(businessService.getId());
        subscriptionService.subscribe(dbTenant, dbBusinessService);
    }
    /*@RequestMapping(value="/subscription",method=RequestMethod.PUT)
    String updateSubscription() {
        return subscriptionService.updateSubscription();
    }*/
}
