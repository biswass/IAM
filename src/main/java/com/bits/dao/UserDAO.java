package com.bits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {// implements IFooDAO{
   
}