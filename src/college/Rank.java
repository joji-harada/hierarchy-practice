package college;

public enum Rank {
		FRESHMAN("FRESHMAN"),
		SOPHOMORE("SOPHOMORE"),
		JUNIOR("JUNIOR"),
		SENIOR("SENIOR");
	
	String rank;
	
	private Rank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return this.rank;
	}
}
