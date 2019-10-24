package college;

public class Person {
	String name;
	int age;
	
	//constructors
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(Person other) { //copy constructor
		name = other.name;
		age = other.age;
	}
	
	//access methods below
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//set methods below
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age == p.age;
		}
		return false;
	}
	
	//toString method
	public String toString() {
		return "Name: \t" + name + "\n" + "Age: \t" + age + "\n";
	}
	
	//print status method
		public void printStatus() {
			System.out.print("Person class");
		}
}