package com.example.demo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.model.User;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
@Service
public class AdminDao implements AdminService{
	@Autowired
	AdminRepository rep;
	@Override
	public Admin addAdmin(Admin admin) {
		return rep.save(admin);
	}

	@Override
	public void deleteAdmin(int adminId) {
		rep.deleteById(adminId);
		
	}

	@Override
	public String getAdminName(int adminId) {
		Admin a=rep.getById(adminId);
		User u= a.getUser();
		return u.getUserName();
		
	}

	@Override
	public String getAdminPassword(int adminId) {
		Admin a=rep.getById(adminId);
		User u= a.getUser();
		return u.getUserPassword();
	}

}
