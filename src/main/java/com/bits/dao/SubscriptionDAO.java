package com.bits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bits.model.BusinessService;
import com.bits.model.Subscription;
import com.bits.model.Tenant;

@Repository
public interface SubscriptionDAO extends JpaRepository<Subscription, Long> {
	
	@Modifying
	@Query("update Subscription s set s.autoscale = :autoscale where s.tenant = :tenant and s.businessService = :businessService")
	void updateAutoscaling(@Param(value = "tenant") Tenant tenant, @Param(value = "businessService") BusinessService businessService, @Param(value = "autoscale") Boolean autoscale);
   
}