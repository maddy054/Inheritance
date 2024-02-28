package scross;

import inheritance.Car;

public class Scross extends Car {
	private int seats;
	private int airBags;
	private String model;
	private String colour;
	
	public Scross() {
		super("Scross constructor");
	}
	public void setSeats(int numberOfSeats) {
		seats = numberOfSeats;
	}
	public int getSeats() {
		return seats;
	}
	public void setAirBags(int numberOfAirBag) {
		airBags = numberOfAirBag;
	}
	public int getAirBags() {
		return airBags; 
	}
	public void setModel(String carModel) {
		model = carModel;
	}
	public String getModel() {
		return model;
	}
	public void setColour(String carColour) {
		colour = carColour;
	}
	public String getColour() {
		return colour;
	}
	public String maintainance() {
		return "Maruti SCross under maintenance";
	}
	

}
