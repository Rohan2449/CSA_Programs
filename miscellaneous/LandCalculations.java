package miscellaneous;

import java.util.Scanner;

public class LandCalculations {
 public static void main(String[] args) 
 {
	 int squareFeet;
	 double acres;
	 System.out.print("How many square feet of land do you own?");
	  Scanner reader = new Scanner(System.in); 
		squareFeet = reader.nextInt();
	
	 acres = squareFeet / 43560;
	 System.out.print("You have " + acres + " acres of land");
	 

 }
}