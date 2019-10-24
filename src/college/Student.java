package college;

public class Student extends Person {
	private double gpa;
	private Rank rank; //enumerated data
	private Major major; //enumerated data
	
	//constructor
	public Student(String name, int age, Rank rank, Major major, double gpa) {
		super(name, age);
		this.rank = rank;
		this.major = major;
		this.gpa = gpa;
	}
	
	public Student(Person person, Rank rank, Major major, double gpa) {
		this(person.name, person.age, rank, major, gpa);
	}
	
	//access methods below
	public Rank getClassRank() {
		return rank;
	}
	
	public Major getMajor() {
		return major;
	}
	
	public double getGpa() {
		return gpa;
	}

	//set methods below
	public void setClassRank(Rank classRank) {
		this.rank = classRank;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	//equals method
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				
				return 	super.getName().equals(s.getName()) && //name
						super.getAge() == s.getAge() && //age
						rank.equals(s.rank) && //rank
						major.equals(s.major) && //major
						gpa == s.gpa; //gpa
			}
		}
		return false;
	}
	
	//method to figure out probation status
	public boolean isOnProbation() {
		if (gpa < 2.0) {
			return true;
		}
		return false;
	}
	
	//method to calculate deans list
	public boolean isOnDeansList() {
		if (gpa >= 3.6) {
			return true;
		}
		return false;
	}
	
	
	//to string method
	public String toString() {
		String deansList;
		String probation;
		//logic to calculate deans list status 
		if(this.isOnDeansList() == false) {
			deansList = "No";
		} else {
			deansList = "Yes";
		}
		//logic to calculate probation status
		if(this.isOnProbation() == false) {
			probation = "No";
		} else {
			probation = "Yes";
		}
		
		//return statement
		return super.toString() + "Rank: \t" + rank + "\n" +
				"Major: \t" + major + "\n" +
				"GPA: \t" + gpa + "\n" +
				"Deans List: \t" + deansList + "\n" +
				"Probation: \t" + probation + "\n";
	}
	
	//print status method
	public void printStatus() {
		System.out.print("Student class");
	}
	
}




