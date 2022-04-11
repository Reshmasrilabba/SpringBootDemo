package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserDao implements UserService{
	@Autowired
	UserRepository repo;
	@Override
	public User addUser(User user) {
		return repo.save(user);
		
	}

	@Override
	public void removeUser(int userId) {
		repo.deleteById(userId);
		
	}

}
