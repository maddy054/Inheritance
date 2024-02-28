package swift;
import inheritance.Car;
public class Swift extends Car{
	private int seats;
	private int airBags;
	private String model;
	private String colour;
	public Swift() {
		super("Swift constructor");
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
	

}
