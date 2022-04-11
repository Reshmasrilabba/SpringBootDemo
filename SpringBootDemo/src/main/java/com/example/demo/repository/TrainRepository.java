package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Train;

@Repository
public interface TrainRepository  extends  JpaRepository<Train, Integer>{
//	 @Modifying
//	 @Query("update Train t set.trainPrice:param1 where t.trainNumber:param2")
//	 public int updateTrainById(double param1,int param2);
//	 
	
	@Query("SELECT u FROM Train u WHERE u.trainName=:param1")
	public Train getTrainByName(String param1);

}
