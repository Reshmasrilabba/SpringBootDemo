package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
	public User addUser(User user);
	public void removeUser(int userId);

}
