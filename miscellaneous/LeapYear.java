package miscellaneous;
import java.util.Scanner;

public class LeapYear {

	//methods
	public static boolean isLeapYear(int year) {
	if ((year % 100 == 0) && (year % 400 == 0) && (year >= 4)) {
	return true;}
	
	else if (year % 100 == 0) {
	return false;
	}
	
	else if (year % 4 == 0) {
	return true;
	}
	
	else {
	return false;
		}
	}
	public static void main(String[] args) {
	System.out.println("Year:");
	Scanner reader = new Scanner (System.in);
	int year = reader.nextInt();
	System.out.println(isLeapYear(year));
}
	}
