package college;

public class Employee extends Person {
	private String officeLocation;
	private double salary;
	private double yearsEmployed;
	
	//constructor methods
	public Employee(String name, int age, String office, double salary, double years) {
		super(name, age);
		this.officeLocation = office;
		this.salary = salary;
		this.yearsEmployed = years;
	}
	
	public Employee(Person person, String office, double salary, double years) { //utilizes Person copy construct
		this(person.name, person.age, office, salary, years);
	}
	
	public Employee(Employee other) { //copy constructor
		super(other.name, other.age);
		this.officeLocation = other.officeLocation;
		this.salary = other.salary;
		this.yearsEmployed = other.yearsEmployed;
	}
	
	//access methods below
	public String getOfficeLocation() {
		return officeLocation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getYearsEmployed() {
		return yearsEmployed;
	}
	
	//set methods below
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setYearsEmployed(double yearsEmployed) {
		this.yearsEmployed = yearsEmployed;
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			return officeLocation.equals(e.officeLocation) &&
					salary == e.salary &&
					yearsEmployed == e.yearsEmployed;
		}
		return false;
	}
	
	//method that returns biweekly pay
	public double payments () {
		double monthly;
		monthly = salary / 24;
		return monthly;
	}
	
	//toString override method
	public String toString() {
		return super.toString() + "Office: " + officeLocation + "\n" +
				"Annual: " + salary + "\n" +
				"Years: \t" + yearsEmployed + "\n" +
				"Monthly:" + payments() + "\n";
	}
	
	//print status method
	public void printStatus() {
		System.out.print("Employee Class");
	}
}