package empSubsystem;

public class PartTimeFaculty extends Employees{
	
	private double hourlyRate;
	private int numHours;
	private int numStudents;
	
	// CONSTRUCTORS
	public PartTimeFaculty()
	{
		super();
		hourlyRate = 0;
		numHours = 0;
		numStudents = 0;
	}
	
	public PartTimeFaculty(long id, String fn, String ln, String c, int y, double hr, int nh, int ns)
	{
		super(id, fn, ln, c, y);
		hourlyRate = hr;
		numHours = nh;
		numStudents = ns;
	}

	// toString Method
	@Override
	public String toString() {
		return "PartTimeFaculty [hourlyRate=" + hourlyRate + ", numHours=" + numHours + ", numStudents=" + numStudents
				+ ", employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + ", year=" + year + "]";
	}
	
	// equals Method
	public boolean equals(Object o)
	{
		if(o == null || this == null ||this.getClass() != o.getClass())
			return false;
		else{
			PartTimeFaculty x = (PartTimeFaculty) o;
			return (this.employeeID == x.employeeID && this.firstName == x.firstName && this.lastName == x.lastName && this.city == x.city && this.year == x.year && 
					this.hourlyRate == x.hourlyRate && this.numHours == x.numHours && this.numStudents == x.numStudents);
		}
	}
	
	// GETTERS AND SETTERS
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumHours() {
		return numHours;
	}

	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	
	

}
