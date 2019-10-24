package college;

public enum Major
{	
	PHYSICS("PHYSICS"),
	ASTRONOMY("ASTRONOMY"),
	COMPUTERSCIENCE("COMPUTERSCIENCE"),
	ENGINEERING("ENGINEERING");
	
	String major;
	
	private Major(String major) {
		this.major = major;
	}
	
	public String toString() {
		return this.major;
	}
}