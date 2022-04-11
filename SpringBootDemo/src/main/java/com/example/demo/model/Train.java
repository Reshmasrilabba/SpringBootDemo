package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Train_Table")
public class Train {
	@Id
	private int trainNumber;
	private String trainName;
	private String trainSourceStation;
	private String trainDestinationStation;
	private double trainPrice;
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSourceStation() {
		return trainSourceStation;
	}
	public void setTrainSourceStation(String trainSourceStation) {
		this.trainSourceStation = trainSourceStation;
	}
	public String getTrainDestinationStation() {
		return trainDestinationStation;
	}
	public void setTrainDestinationStation(String trainDestinationStation) {
		this.trainDestinationStation = trainDestinationStation;
	}
	public double getTrainPrice() {
		return trainPrice;
	}
	public void setTrainPrice(double trainPrice) {
		this.trainPrice = trainPrice;
	}
	
	
	
	
	

}
