package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AdminDao;
import com.example.demo.model.Admin;

@RestController
public class AdminController {
	@Autowired
	AdminDao dao;
	@PostMapping("/createAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return dao.addAdmin(admin);
	}
	@DeleteMapping("/deleteAdmin")
	public void deleteAdmin(int adminId) {
		dao.deleteAdmin(adminId);
		
	}
	@GetMapping("/getAdminName/{adminId}")
	public String getAdminName(int adminId) {
		return dao.getAdminName(adminId);
		
	}
	@GetMapping("/getAdminPassword/{adminId}")
	public String getAdminPassword(int adminId) {
		return dao.getAdminPassword(adminId);
		
	}
	



}
