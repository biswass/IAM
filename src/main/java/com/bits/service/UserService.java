package com.bits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.dao.UserDAO;
import com.bits.model.User;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	
    public void createUser(User user) {
        userDAO.save(user);
    }
    
}
