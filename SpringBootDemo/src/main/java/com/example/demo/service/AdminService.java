package com.example.demo.service;

import com.example.demo.model.Admin;

public interface AdminService {
	public Admin addAdmin(Admin admin);
	public void deleteAdmin(int adminId);
	public String getAdminName(int adminId);
	public String getAdminPassword(int adminId);

}
