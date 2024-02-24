package miscellaneous;

import java.util.Scanner;
public class EmailGenerator {
	

	private static String domain = "mytusd.org"; 

	//returns the first name + the initial of the last name in all lower case
		public static String makeUsername(String firstName, String lastName) {
		  return   firstName.toLowerCase().substring(0) +lastName.toLowerCase().substring(0,1);
	}
	
		
		
	//returns a random ID number between the values 10,000,000 and 99,999,999
	public static int makeIdNumber() {
		return   ((int)(Math.random()* 90_000_000)+10_000_000);			
	}
	
	//combines the username and the ID number and the domain to create an email address
	public static String makeEmail(String userName, int IdNumber, String domain ) {
		return userName+ IdNumber +"@"+ domain;
	}
	
public static void main(String[] args) {
	System.out.println("Enter your full name: ");

	Scanner reader = new Scanner (System.in);
	
	//stores the input from the user as String variables
	String firstName = reader.next();
	String lastName = reader.next();
	
	//stores the result of the makeUsername and makeIdNumber methods as variables
	String userName = makeUsername(firstName, lastName);
	int IdNumber = makeIdNumber(); 

	
	System.out.println("Your ID number is: " + IdNumber);
	
	//calls the makeEmail method and prints it out for the user
	//divided the IdNumber by 10,000 in order to truncate it to 4 digits. 
	System.out.println("Your email address is: " + makeEmail(userName,IdNumber%10000, domain ));
	}	
}

