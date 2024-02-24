package miscellaneous;

public class AboutMe {

	private String name;
	private String school;
	private int age;

	public AboutMe(String name, String school, int age) {
		this.name = name;
		this.school = school;
		this.age = age;
	}

	public String myName() {
		return (name);
	}

	public String mySchool() {
		return (school);
		//hey
	}

	public int myAge() {
		return (age);
	}

	public static void main(String[] args) {

		AboutMe me = new AboutMe("{name}", "{school}", 0);

		System.out.println(
				"Hi, my name is " + me.myName() + ", I attend " + me.mySchool() + " and I am " + me.myAge() + " years old.");
	}
}
