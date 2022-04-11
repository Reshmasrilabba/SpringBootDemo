//package com.example.demo.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.model.Product;
//
//
//@Repository
//public interface ProductRepository  extends  JpaRepository<Product, Integer>{
////	 @Modifying
////	 @Query("update Train t set.trainPrice:param1 where t.trainNumber:param2")
////	 public int updateTrainById(double param1,int param2);
//	 
//	
//	@Query("SELECT p.productPrice FROM Product p WHERE p.productName=:param1")
//	public double getPriceByName(String param1);
//
//}
