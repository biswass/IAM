package com.bits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.dao.SubscriptionDAO;
import com.bits.model.BusinessService;
import com.bits.model.Subscription;
import com.bits.model.Tenant;

@Service
public class SubscriptionService {
	
	@Autowired
	SubscriptionDAO subscriptionDAO;
	
    public void subscribe(Tenant tenant, BusinessService businessService) {
    	Subscription subscription = new Subscription();
    	subscription.setBusinessService(businessService);
    	subscription.setTenant(tenant);
        subscriptionDAO.save(subscription);
    }
    
    /*public void unsubscribe() {
    	subscriptionDAO.deleteById(id);
    }*/
    
}
