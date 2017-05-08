package empSubsystem;

public class Employees implements Ordered{

		protected long employeeID;
		protected String firstName;
		protected String lastName;
		protected String city;
		protected int year;
		

		// Constructors
		public Employees()
		{
			employeeID = 0;
			firstName = "No name";
			lastName = "No name";
			city = "N/A";
			year = 0;
		}
		
		public Employees(long id, String fn, String ln, String c, int y)
		{
			employeeID = id;
			firstName = fn;
			lastName = ln;
			city = c;
			year = y;
		}
		
		// toString Method
		public String toString() {
			return "Employees [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", city=" + city + ", year=" + year + "]";
		}
		
		// Equals Method
		public boolean equals(Object o)
		{
			if(o == null || this == null ||this.getClass() != o.getClass())
				return false;
			else{
				Employees x = (Employees) o;
				return (this.employeeID == x.employeeID && this.firstName == x.firstName && this.lastName == x.lastName && this.city == x.city && this.year == x.year);
			}
		}

		// Implemented interface methods
		public boolean precedes(Object o) {
			if(o == null || this == null ||this.getClass() != o.getClass())
				return false;
			else{
				Employees x = (Employees) o;
				return (this.year < x.year);
			}
		}

		public boolean follows(Object o) {
			if(o == null || this == null ||this.getClass() != o.getClass())
				return false;
			else{
				Employees x = (Employees) o;
				return (this.getYear() > x.getYear());
			}
		}
		
		// GETTERS AND SETTERS
		public long getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(long employeeID) {
			this.employeeID = employeeID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		
		

}
