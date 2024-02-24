package miscellaneous;

import java.util.Scanner;

public class Place {
 public static void main(String[] args) 
 {
	 String city;
	 System.out.print("What is your favorite city?");
	  Scanner reader = new Scanner(System.in); 
		city = reader.nextLine();
		System.out.println(city.length());
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());

 }
}