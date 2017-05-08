package empSubsystem;

public class FullTimeFaculty extends Employees {
	
	private double salary;

	// CONSTRUCTORS
	public FullTimeFaculty() {
		super();
		salary = 0;
	}
	
	public FullTimeFaculty(long id, String fn, String ln, String c, int y, double s)
	{
		super(id, fn, ln, c, y);
		salary = s;
	}

	// toString Method
	@Override
	public String toString() {
		return employeeID + "\t" + firstName + "\t" + lastName + "\t" + city + "\t" + year + "\t" + salary;
	}
	
	// equals Method
	public boolean equals(Object o)
	{
		if(o == null || this == null ||this.getClass() != o.getClass())
			return false;
		else{
			FullTimeFaculty x = (FullTimeFaculty) o;
			return (this.employeeID == x.employeeID && this.firstName == x.firstName && this.lastName == x.lastName && this.city == x.city 
					&& this.year == x.year && this.salary == x.salary);
		}
	}

	// GETTERS AND SETTERS
	public double getFTSalary() {
		return salary;
	}

	public void setFTSalary(double salary) {
		this.salary = salary;
	}
	
	
}
