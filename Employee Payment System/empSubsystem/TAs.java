package empSubsystem;

public class TAs extends Employees{
	
	private String classification;
	private int numClasses;
	private int totalHours;
	
	// CONSTRUCTORS
	public TAs()
	{
		super();
		classification = "N/A";
		numClasses = 0;
		totalHours = 0;
	}
	
	public TAs(long id, String fn, String ln, String c, int y, String cl, int nc, int th)
	{
		super(id, fn, ln, c, y);
		classification = cl;
		numClasses = nc;
		totalHours = th;
	}

	// toString Method
	@Override
	public String toString()
	{
		return "TAs [classification=" + classification + ", numClasses=" + numClasses + ", totalHours=" + totalHours
				+ ", employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + ", year=" + year + "]";
	}
	
	// equals Method
	public boolean equals(Object o)
	{
		if(o == null || this == null ||this.getClass() != o.getClass())
			return false;
		else{
			TAs x = (TAs) o;
			return (this.employeeID == x.employeeID && this.firstName == x.firstName && this.lastName == x.lastName && this.city == x.city && this.year == x.year
					&& this.classification == x.classification && this.numClasses == x.numClasses && this.totalHours == x.totalHours);
		}
	}

	// GETTERS AND SETTERS
	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getNumClasses() {
		return numClasses;
	}

	public void setNumClasses(int numClasses) {
		this.numClasses = numClasses;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	
	

}
