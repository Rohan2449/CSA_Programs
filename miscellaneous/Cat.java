package miscellaneous;

public class Cat {

	
		private int numEars;
		private int weight;
		private String color;
		private String name;
		
		//constructor. invoked when keyword 'new is used
		public Cat( int weight, String color, String name) {
			
			this.numEars =2;
			this.weight = weight;
			this.color = color;
			this.name = name;
		}
		public Cat( int numEars, int weight, String color, String name) {
			
			this.numEars =numEars;
			this.weight = weight;
			this.color = color;
			this.name = name;
		}

		//methods
		
		public String speak() {
			return("Meow! My name is " + name + " I have " + numEars +" ears");
		}
		
		 
		
		public static void main(String[] args) {
		Cat myCat = new Cat(45, "black", "George");
		System.out.println(myCat.speak());
			
		Cat otherCat = new Cat(22, "orange", "Eman");
		System.out.println(otherCat.speak());
		
		Cat oneEar = new Cat(1 ,21, "grey", "Reaon");
		System.out.println(oneEar.speak());
		}
}
