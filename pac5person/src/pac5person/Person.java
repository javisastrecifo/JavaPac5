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

	// ----------------------------------------------------------------- CONSTRUCTORS

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.height = 175;
		this.weight = 65;
		this.city = "Barcelona";
		this.kids = 0;
		this.isWorking = true;
		this.occupation = "";
	}

	public Person(String name, int age, boolean isWorking, String city, int kids) {
		this.name = name;
		this.age = age;
		this.height = 175;
		this.weight = 65;
		this.city = city;
		this.kids = kids;
		this.isWorking = isWorking;
		this.occupation = "";
	}

	// ----------------------------------------------------------------- MÈTODES

	public void printPerson() {
		if (this.isWorking) {
			System.out.print(this.name + ": " + this.age + " years old, height and weight of " + this.height
					+  " and " + this.weight + ". Lives in the city of " + this.city + ". He/she has " + this.kids
					+ " kids and is currently working as a " + this.occupation);
		} else {
			System.out.print(this.name + ": " + this.age + " years old, height and weight of " + this.height
					+ " and " + this.weight + ". Lives in the city of " + this.city + ". He/she has " + this.kids
					+ " kids and is currently unemployed.");
		}
	}
	
	public void printHealth () {
		System.out.println ("Name: " + this.name);
		System.out.println ("Age: " + this.age);
		System.out.println ("Height: " + this.height);
		System.out.println ("Weight: " + this.weight);
		System.out.println ("Is working? " + this.isWorking);
		System.out.println ("Number of kids: " + this.kids);
		if ((this.isMalnourished()) || (this.isObese())) {
			System.out.print("The body mass is " + this.bodyMassIndex() + " and he/she is not healthy.");
			this.correctWeight();
		} else {
			System.out.print("The body mass is " + this.bodyMassIndex() + " and he/she is healthy.");
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

	public double bodyMassIndex() {
		double bodyMass = this.weight / Math.pow((this.height)/100, 2);
		return bodyMass;
	}

	// ----------------------------------------------------------------- 5 MÈTODES EXTRA

	// ----------------------------------------------------------------- familia numerosa
	public boolean isLargeFamily() {
		if (this.kids > 2) {
			return true;
		} else {
			return false;
		}
	}

	// ----------------------------------------------------------------- població vulnerable
	public boolean isVulnerable() {
		if ((this.isWorking == false) && (this.kids > 0)) {
			return true;
		} else {
			return false;
		}
	}

	// ----------------------------------------------------------------- població malnutrida
	public boolean isMalnourished() {
		if (this.bodyMassIndex() < 18) {
			return true;
		} else {
			return false;
		}
	}

	// ----------------------------------------------------------------- població obesa
	public boolean isObese() {
		if (this.bodyMassIndex() > 25) {
			return true;
		} else {
			return false;
		}
	}
	
	// ----------------------------------------------------------------- engreixar 1 Kg
	public void getFat () {
		this.weight += 1;
	}

	// ----------------------------------------------------------------- aprimar 1 Kg
	public void getThin () {
		this.weight -= 1;
	}
	
	// ----------------------------------------------------------------- corregir alimentació
	public void correctWeight () {
		
		int kilos = 0;
		double initialData = this.weight;
		
		while (this.isObese()) {
			this.getFat();
			kilos++;
		}
		
		while (this.isMalnourished()) {
			this.getThin();
			kilos--;
		}
		
		if (kilos > 0) {
			System.out.print(this.name + " has to gain " + kilos + "kilograms to have the proper body mass!");			
		} else {
			System.out.print(this.name + " has to loose " + kilos + "kilograms to have the proper body mass!");			
		}

		this.weight = initialData;
		
	}
		
	// ----------------------------------------------------------------- SETTERS & GETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
