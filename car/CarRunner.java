package car;

import java.util.Scanner;

public class CarRunner {
	public static void main(String[] args) {
		System.out.println("Enter the year Model: ");

		Scanner reader =  new Scanner(System.in);
		int yearModel = reader.nextInt();
		System.out.println("Enter the make: ");

		String make = reader.next();
		
		int speed = 0;
		
		Car car1 = new Car(yearModel,  make,  speed);
		
		for(int i =0; i <5; i++) {
		car1.accelerateCar();
		System.out.println(car1.getYearModel() +" "+ car1.getMake() + ", Car Speed : " + car1.getSpeed());

				}
		
		
		for(int b =0; b <5; b++) {
			car1.brakeCar();
			System.out.println(car1.getYearModel() +" "+ car1.getMake() + ", Car Speed : " + car1.getSpeed());
					}
	}

}
