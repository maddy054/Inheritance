package inheritancetest;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import inheritance.Car;
import swift.Swift;
import scross.Scross;
import xuv.Xuv;
//import abstractClass.BirdAbstract;
import abstractClass.ParrotMod;
//import abstractClass.Bird;
import abstractClass.Duck;


public class InheritanceTester {
	static Logger logger = Logger.getLogger("myLogger");
	public static void main(String[] args) {
		
		try(Scanner carScanner = new Scanner(System.in);){
		
		int select = 1;
		do {
		
		logger.log(Level.INFO,"Select any one");
		 select = carScanner.nextInt();
		switch(select) {
		
		case 2:
		Swift carSwift = new Swift();
		carSwift.setSeats(8);
		carSwift.setAirBags(2);
		carSwift.setColour("White");
		carSwift.setModel("abcd");
		
		int swiftSeats = carSwift.getSeats();
		logger.log(Level.INFO,"Number of seats in swift car is "+swiftSeats);
		
		int swiftAirBags = carSwift.getAirBags();
		logger.log(Level.INFO,"Number of air bags in swift car is "+swiftAirBags);	
		
		String swiftColour = carSwift.getColour();
		logger.log(Level.INFO,"colour of the swift car is "+swiftColour);
		
		String swiftModel = carSwift.getModel();
		logger.log(Level.INFO,swiftModel);
		
		Scross carScross = new Scross();
		carScross.setSeats(6);
		carScross.setAirBags(2);
		carScross.setColour("Red");
		carScross.setModel("Sigma");
		
		carScross.setYearOfMake(2012);
		carScross.setType("delta");
		carScross.setengineNumber("scros engine");
		
		int scrossSeats = carScross.getSeats();
		logger.log(Level.INFO,"Number of seats in scross car car is "+scrossSeats);
		
		int scrossAirBags = carScross.getAirBags();
		logger.log(Level.INFO,"Number of air bags in scross car is "+scrossAirBags);
		
		String scrossColour = carScross.getColour();
		logger.log(Level.INFO,"colour of the scross car is "+scrossColour);
		
		String scrossModel = carScross.getModel();
		logger.log(Level.INFO,"Model of scross car is "+scrossModel);
		
		int scrossYearOfMaking = carScross.getYearOfMake();
		logger.log(Level.INFO,"Year of making of scross car is "+scrossYearOfMaking);
		
		String scrossType = carScross.getType();
		logger.log(Level.INFO,"Type of scross car is "+scrossType);

		String scrossEngineNumber = carScross.getColour();
		logger.log(Level.INFO,"Engine number for scross car is "+scrossEngineNumber);
	   break;
	   
		case 4:
		Swift carSwift1 = new Swift();
		Scross carScros = new Scross();
        Xuv carXuv = new Xuv();		
        getYear(carScros);
        getYear(carSwift1);   
        getYear(carXuv);
        break;
        
		case 6:
		Swift carSwift2 = new Swift();
        getSwiftYear(carSwift2);
        break;
        
		case 7:
        Car swiftCar = new Swift();
        Car scrossCar = new Scross();
        Car myCar = new Car("car object");
        Swift carSwift3 = new Swift();
        // getSwiftYear(swiftCar);
        Scross carScros1 = new Scross();
		logger.log(Level.INFO,"Maintainance of different cars ");
		logger.log(Level.INFO,carScros1.maintainance());
		logger.log(Level.INFO,scrossCar.maintainance());
		logger.log(Level.INFO,myCar.maintainance());
		logger.log(Level.INFO,carSwift3.maintainance());
		break;
		
		case 8:
		logger.log(Level.INFO,"New object is created with default constructor of xuv with calling the super class constructor ");
		Xuv newXuv = new Xuv();
	   // Xuv myXuv = new Xuv("creating xuv object");
		break;
		
		case 9:
		
		ParrotMod myAbstract = new ParrotMod();
		myAbstract.fly();
		myAbstract.speak();
		
		Duck myDuck = new Duck();
		myDuck.fly();
		myDuck.speak();									
		
		break;
		}
		}while(select != 0);
		}
	}
	public static void getYear(Car carObj) {
		logger.log(Level.INFO,"year of making "+carObj.getYearOfMake());
		if(carObj instanceof Swift) {
			logger.log(Level.INFO,"HATCH");
		}
		if(carObj instanceof Xuv) {
			logger.log(Level.INFO,"SUV");
		}
		if(carObj instanceof Scross) {
			logger.log(Level.INFO,"SEDAN");
		}
		
	}
	
	public static void getSwiftYear(Swift swiftObj) {
		logger.log(Level.INFO,"Year of making of swift car "+swiftObj.getYearOfMake());
	}
	

}
