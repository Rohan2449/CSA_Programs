package miscellaneous;

public class Dog {

	private String name;
	private int age;
	private int weight;
	
	public Dog(String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
				
		this.weight = weight;
	}
	public String speak() {
		return("woof");
	}
	public static void main(String[] args) {
		Dog myDog = new Dog("Bondy", 7, 23);
		System.out.println(myDog.speak());
	}

}
