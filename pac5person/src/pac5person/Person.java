package pac5person;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private String city;
	private int kids;
	private boolean isWorking;
	private String occupation;

	public Person(String name, int age, boolean isWorking) {
		this.name = name;
		this.age = age;
		this.city = "Barcelona";
		this.kids = 0;
		this.isWorking = isWorking;
		this.occupation = "";
	}

	public void printPerson() {
		if (this.isWorking) {
			System.out.print(this.name + ": " + this.age + " years old, height and weight of " + this.height
					+ this.weight + ". Lives in the city of " + this.city + ". He/she has " + this.kids
					+ " kids and is currently working as a " + this.occupation);
		} else {
			System.out.print(this.name + ": " + this.age + " years old, height and weight of " + this.height
					+ this.weight + ". Lives in the city of " + this.city + ". He/she has " + this.kids
					+ " kids and is currently unemployed.");
		}
	}

	public void becomeOlder() {
		this.age += 1;
	}

	public boolean isAdult() {
		if (this.age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public double bodyMassIndex () {
		double bodyMass = this.weight/Math.pow(this.height, 2);		
		return bodyMass;
	}
	
	
}
