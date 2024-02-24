package miscellaneous;

import java.util.Scanner;

public class Mario {
	
	public static void main(String[] args) {
		
	
	Scanner reader = new Scanner(System.in);
	int height = 0;
	
	//input from user
	while(height  <= 0  || height > 23) {
		System.out.println("Enter the height for the pyramid: ");
	 height = reader.nextInt();
	}
	
	//build the pyramid
	for(int i = 0; i < height; i++) {
		String leftSide = "";
		String rightSide = "";

		for(i =0; i < height; i++) {
			leftSide += " ";
		}
			for( i =0; i  < height; i ++) {
		
			rightSide += "#";
			System.out.print(leftSide.substring(0,height - i) + rightSide + "  ");
			System.out.println(rightSide);

		}
	}
}
}