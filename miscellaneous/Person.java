package miscellaneous;

public class Person {

	private String name;
	private int age;
	private int weight;
	public Person(String x, int age, int weight) {
		name = x;
		this.age = age;
		this.weight = weight;
	}	

	public String meSpeak() {
		int len = name.length();
		return ("Hey " + name);
		
	}

	
	public String friendSpeak() {	
		return("Hey " + name);
	}

	public static void main(String[] args) {
	 Person me = new Person("Rohan", 17, 135);
	 System.out.println(me.meSpeak());
	 
	 Person friend = new Person("Bankai", 16, 133);
	 System.out.println(friend.friendSpeak());
	 
	
	}
}
