package com.bits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.dao.TenantDAO;
import com.bits.dao.UserDAO;
import com.bits.model.Tenant;
import com.bits.model.User;

@Service
public class TenantService {
	
	@Autowired
	TenantDAO tenantDAO;
	
	@Autowired
	UserDAO userDAO;
	
    public void createTenant(Tenant tenant) {
    	// create the tenant admin
    	User user = new User();
    	user.setEmail(tenant.getEmail());
    	userDAO.save(user);
    	tenantDAO.save(tenant);
    }
    
    @SuppressWarnings("deprecation")
	public Tenant getTenantById(long tenantId) {
    	return tenantDAO.getById(tenantId);
    }
    
}
