package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@RestController
public class UserController {
	@Autowired
	UserDao dao;
	@PostMapping(path="/createUser")
	public User addUser(@RequestBody User user) {
		return dao.addUser(user);
		
	}
	@DeleteMapping(path="/deleteUser/{userId}")
	public void removeUser(@PathVariable int userId) {
		dao.removeUser(userId);
		
	}
	

}
