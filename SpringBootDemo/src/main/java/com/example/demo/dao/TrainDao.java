package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepository;
import com.example.demo.service.TrainService;

@Service
public class TrainDao implements  TrainService{
	@Autowired
	TrainRepository repos;
	@Override
	public Train addTrain(Train train) {
		// TODO Auto-generated method stub
		return  repos.save(train);
	}

	@Override
	public List<Train> getAllTrain() {
	List<Train> listOfTrain=	repos.findAll();
		return listOfTrain;
	}

	@Override
	public Train getTrainByName(String trainName) {
		Train train1 = repos.getTrainByName(trainName);
		return train1;
		
	}

	@Override
	public Optional<Train> getTrainByNumber(int trainNumber) {
		
		return repos.findById(trainNumber);
	}

	@Override
	public int updateTrain(int trainNumber) {
//		double price=60;
//	int trainobj=repos.updateTrainById(price,trainNumber);
		
		Train train=repos.getById(trainNumber);
		train.setTrainPrice(500);
		Train trainobj=repos.save(train);
		if(trainobj==null) {
			return 0;
		}
		else
			return 1;
	}

	@Override
	public int deleteTrain(int trainNumber) {
		repos.deleteById(trainNumber);
		return 0;
	}

}
