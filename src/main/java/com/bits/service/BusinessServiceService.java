package com.bits.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bits.dao.BusinessServiceDAO;
import com.bits.model.BusinessService;

@Service
public class BusinessServiceService {
	
	@Autowired
	BusinessServiceDAO businessServiceDAO;
	
	@PersistenceContext
	private EntityManager em;
    
    public List<BusinessService> getAllServices() {
    	return em.createQuery("select s from BusinessService s", BusinessService.class).getResultList();
    }
    
    @SuppressWarnings("deprecation")
	public BusinessService getBusinessServiceById(long businessServiceId) {
    	return businessServiceDAO.getById(businessServiceId);
    }
    
}
