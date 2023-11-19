package com.bits.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tenant_id")
	private Tenant tenant;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_service_id")
	private BusinessService businessService;

	private boolean autoscale;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public BusinessService getBusinessService() {
		return businessService;
	}
	public void setBusinessService(BusinessService service) {
		this.businessService = service;
	}
	public boolean isAutoscale() {
		return autoscale;
	}
	public void setAutoscale(boolean autoscale) {
		this.autoscale = autoscale;
	}
	
}
