package com.bits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.model.Subscription;

@Repository
public interface SubscriptionDAO extends JpaRepository<Subscription, Long> {
   
}