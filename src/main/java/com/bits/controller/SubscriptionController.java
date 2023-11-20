package com.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.BusinessService;
import com.bits.model.Subscription;
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
    void createSubscription(@RequestBody Subscription subscription) {
    	Tenant dbTenant = tenantService.getTenantById(subscription.getTenant().getId());
    	BusinessService dbBusinessService = businessServiceService.getBusinessServiceById(subscription.getBusinessService().getId());
        subscriptionService.subscribe(dbTenant, dbBusinessService, subscription.isAutoscale());
    }
    
    @RequestMapping(value="/subscription",method=RequestMethod.PUT)
    void unsubscribe(@RequestBody Subscription subscription) {
    	Tenant dbTenant = tenantService.getTenantById(subscription.getTenant().getId());
    	BusinessService dbBusinessService = businessServiceService.getBusinessServiceById(subscription.getBusinessService().getId());
        subscriptionService.updateAutoscaling(dbTenant, dbBusinessService, subscription.isAutoscale());
    }
}
