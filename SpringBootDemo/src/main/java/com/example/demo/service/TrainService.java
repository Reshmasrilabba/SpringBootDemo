package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Train;

public interface TrainService {
	
	
	public Train addTrain(Train train);
	public List<Train> getAllTrain();
	public Train getTrainByName(String trainName);
	public Optional<Train> getTrainByNumber(int trainNumber);
	public int updateTrain(int trainNumber);
	public int deleteTrain(int trainNumber);
	

}
