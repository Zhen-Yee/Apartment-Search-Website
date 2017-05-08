package empSubsystem;

public class Staff extends Employees {
	
	private double salary;
	private String code;
	
	// CONSTRUCTORS
	public Staff()
	{
		super();
		salary = 0;
		code = "N/A";
	}
	
	public Staff(long id, String fn, String ln, String c, int y, double s, String cd)
	{
		super(id, fn, ln, c, y);
		salary = s;
		code = cd;
	}

	// toString Method
	@Override
	public String toString()
	{
		return employeeID + "\t" + firstName + "\t" + lastName + "\t" + city + "\t" + year + "\t" + salary + "\t" + code;
	}

	// equals Method
	public boolean equals(Object o)
	{
		if(o == null || this == null ||this.getClass() != o.getClass())
			return false;
		else{
			Staff x = (Staff) o;
			return (this.employeeID == x.employeeID && this.firstName == x.firstName && this.lastName == x.lastName && this.city == x.city
					&& this.year == x.year && this.salary == x.salary && this.code == x.code);
		}
	}

	// GETTERS AND SETTERS
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
