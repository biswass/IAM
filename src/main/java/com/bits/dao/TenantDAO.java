package com.bits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.model.Tenant;

@Repository
public interface TenantDAO extends JpaRepository<Tenant, Long> {
   
}