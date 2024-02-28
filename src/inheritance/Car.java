package inheritance;

public class Car {
	private int yearOfMake;
	private String engineNumber;
	private String type;
	public Car(String string) {
		System.out.println(string);
	}
	public int getYearOfMake() {
		return yearOfMake;
		
	}
	public void setYearOfMake(int year) {
		yearOfMake = year;
	}
	
	public String getengineNumber() {
		return engineNumber;
	}
	public void setengineNumber(String engineNum) {
		engineNumber = engineNum;
	}
	public String getType() {
		return type;
		
	}
	public void setType(String carType) {
		type = carType;
	}
	public String maintainance() {
		return " Car under maintenance";
   
	}
	

}
