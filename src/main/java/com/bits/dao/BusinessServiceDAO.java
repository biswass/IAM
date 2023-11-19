package com.bits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.model.BusinessService;

@Repository
public interface BusinessServiceDAO extends JpaRepository<BusinessService, Long> {
   
}