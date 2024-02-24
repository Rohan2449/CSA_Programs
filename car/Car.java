package car;

import java.util.Scanner;

public class Car {
	

		private int yearModel;
		private String make;
		private int speed = 0;
		
	public  Car( int yearModel, String make, int speed) {
		this.yearModel = yearModel ;
		this.make = make;
	}
	public int accelerateCar(){
		return speed += 5;
	}
	public int brakeCar() {
		return speed -= 5;
	}
	
	
	public int getYearModel() {
		return yearModel;
	}
	public String getMake() {
		return make;
	}
	public int getSpeed() {
		return speed;
	}
	
}


	

	


