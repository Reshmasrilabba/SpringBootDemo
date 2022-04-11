package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
//	@Query("select u.userName from Admin a INNER JOIN User u ON u.userId = a.userId where a.adminId=?1")
//	public String getAdminName(int adminId); 
//	@Query("select u.userPassword from Admin a INNER JOIN User u ON u.userId = a.userId where a.adminId=?1")
//	public String getAdminPassword(int adminId); 

}
