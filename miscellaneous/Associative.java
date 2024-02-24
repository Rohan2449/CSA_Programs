package miscellaneous;

import java.util.Scanner;

public class Associative {	
	private int x;
	private int y;
	private int z;

				
	public Associative(int x, int y, int z  ) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int firstTwo() {
		return((x+y) * z);
	}
	
	public int lastTwo() {
		return(x + (y * z));
	}

	
	public static void main(String[] args) {
		int x;
		int y;
		int z;

		System.out.println("Provide a value for x: ");
		Scanner reader_x = new Scanner(System.in); 
		x = reader_x.nextInt();

		System.out.println("Provide a value for y: ");
		Scanner reader_y = new Scanner(System.in); 
		y = reader_y.nextInt();
		
		System.out.println("Provide a value for z: ");
		Scanner reader_z = new Scanner(System.in); 
		z = reader_z.nextInt();
		
		Associative nums = new Associative(x,y,z);
		
		System.out.println("Grouping the first 2 terms results in: " + nums.firstTwo());
		System.out.println("Grouping the last 2 terms results in: " + nums.lastTwo());
		
		
	}

}
