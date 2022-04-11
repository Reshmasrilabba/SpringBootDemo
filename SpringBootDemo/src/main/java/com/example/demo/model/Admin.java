package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.model.User;

@Entity
@Table(name="Admin_Table")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int adminId;
	@OneToOne(cascade = CascadeType.ALL)
	private User User;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	
	

}
