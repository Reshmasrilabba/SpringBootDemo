package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TrainDao;
import com.example.demo.model.Train;

@RestController
public class TrainController {
	
	@Autowired
	TrainDao dao;
	/*
	 * postmapping--create any resource
	 * getMapping--featch any resource
	 * putmapping-update any resource
	 * deletemapping--deleteany resource
	 * 5432
	 * Train  ---json
	 * json--java object
	 * 
	 * {
	 * " trainNumber" : 1234,
	 * "trainName":abc exp,
	 * "trainSourceStation":delhi
	 * "trainDestinationStation":ssd,
	 * "trainPrice":4343
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
	
	//localhost:8080/createTrain
	@PostMapping(path="/createTrain")
	public Train createTrain(@RequestBody Train train)
	{
		return dao.addTrain(train);
	}

	@GetMapping(path = "/getAllTrain")
	public List<Train> getAllTrain()
	{
	return 	dao.getAllTrain();
	}
	@GetMapping(path = "/getTrainById/{tno}")
	public Optional<Train> getTrainByNumber(@PathVariable int tno) {
		
		return dao.getTrainByNumber(tno);
	}
	@GetMapping(path="/deleteTrain/{tno}")
	public int deleteTrain(@PathVariable int tno) {
		return dao.deleteTrain(tno);
		
	}
	@GetMapping(path="/updateTrain/{tno}")
	public int updateTrain(@PathVariable int tno) {
		return dao.updateTrain(tno);
	
	}
	@GetMapping(path = "/getTrainByName")
	public Train getTrainByName() {
		
		return dao.getTrainByName("abc exp");
	}
	
	
	
	
	
	
	
	
}
