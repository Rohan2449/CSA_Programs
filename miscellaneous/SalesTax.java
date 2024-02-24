package miscellaneous;

import java.util.Scanner;

public class SalesTax {
 public static void main(String[] args) 
 {
	 double sale;
	 double stateTax;
	 double countyTax;
	 double totalTax;
	 double totalCost;
	 System.out.print("What is the purchase amount?");
	  Scanner reader = new Scanner(System.in); 
		sale = reader.nextDouble();
		stateTax = sale * 0.02;
		countyTax = sale * 0.04;
		totalTax = countyTax + stateTax;
		totalCost = sale + totalTax;
	 System.out.println(sale);
	 System.out.println(stateTax);
	 System.out.println(countyTax);
	 System.out.println(totalTax);
	 System.out.println(totalCost);
 }
}