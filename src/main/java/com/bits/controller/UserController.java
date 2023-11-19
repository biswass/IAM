package com.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.User;
import com.bits.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userService;

    @RequestMapping(value="/user",method=RequestMethod.POST)
    void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
