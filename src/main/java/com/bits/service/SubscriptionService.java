package com.bits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bits.dao.SubscriptionDAO;
import com.bits.model.BusinessService;
import com.bits.model.Subscription;
import com.bits.model.Tenant;

@Service
public class SubscriptionService {
	
	@Autowired
	SubscriptionDAO subscriptionDAO;
	
    public void subscribe(Tenant tenant, BusinessService businessService, boolean autoscale) {
    	Subscription subscription = new Subscription();
    	subscription.setBusinessService(businessService);
    	subscription.setTenant(tenant);
    	subscription.setAutoscale(autoscale);
        subscriptionDAO.save(subscription);
    }
    
    @Transactional
    public void updateAutoscaling(Tenant tenant, BusinessService businessService, Boolean autoscale) {
    	subscriptionDAO.updateAutoscaling(tenant,businessService,autoscale);
    }
    
}
