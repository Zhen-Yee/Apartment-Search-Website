package empSubsystem;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class PaymentSubsytem {

	public static void main(String[] args) {
		
		try{
			//addTARecords();
			//findTermSalary();
			//findHighest_and_Lowest_FT_Salary();
			increase_Staff_Salary();
			
			FullTimeFaculty hi = new FullTimeFaculty(12, "Z", "Y,", "M", 2017, 20199);
			Employees hi2 = new Employees(12, "Z", "Y,", "M", 2016);
			System.out.println(hi.precedes(hi2));
		}
		catch (FileNotFoundException e){
			System.out.println("Something went wrong with opening file.");
		}

	}
	
	public static void addFTRecords() throws FileNotFoundException		// adds record to the FULL TIME FACULTY text file
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are now adding records to Full Time Faculty File.");
		
		FileInputStream fileIn = new FileInputStream("Full-Time-Faculty.txt");
		
		Scanner sc = new Scanner(fileIn);
		
		// create array list for full time faculty members
		ArrayList<FullTimeFaculty> FTFaculty = new ArrayList<FullTimeFaculty>();
		
		// creates and adds full time faculty members to array list from input file
		while(sc.hasNextLine())
		{
			FTFaculty.add(new FullTimeFaculty(sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble()));
		}
		
		// appends to file
		FileOutputStream fileOut = new FileOutputStream("Full-Time-Faculty.txt", true);
		PrintWriter pw = new PrintWriter(fileOut);
		
		long id;
		String fn;
		String ln;
		String city;
		int year;
		double salary;
		boolean adding = true;
		
		// loops to ask user to enter new record to enter
		while(adding){
			System.out.println("Please enter Employee ID: ");
			id = kb.nextLong();
			while(containsFTId(FTFaculty, id)){
				System.out.println("This Employee ID already exists. Please enter another Employee ID: ");
				id = kb.nextLong();
			}
			System.out.println("Please enter First Name: ");
			fn = kb.next();
			System.out.println("Please enter Family Name: ");
			ln = kb.next();
			System.out.println("Please enter City of Residence: ");
			city = kb.next();
			System.out.println("Please enter Hire Year: ");
			year = kb.nextInt();
			System.out.println("Please enter Salary: ");
			salary = kb.nextDouble();
			
			// creates new faculty member with user input
			FTFaculty.add(new FullTimeFaculty(id, fn, ln, city, year, salary));
			
			// prints record to file
			pw.println();
			pw.print(id + "\t" + fn + "\t" + ln + "\t" + city + "\t" + year + "\t" + salary);
			
			// asks user if they wish to continue adding
			System.out.println("Enter -1 to stop adding or any character to continue adding.");
			String ans = kb.next();
			if(ans.equals("-1"))
				adding = false;
			
		}
		sc.close();
		pw.close();
			
	}
	
	public static void addPTRecords() throws FileNotFoundException		// adds record to the PART TIME FACULTY text file
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are now adding records to Part Time Faculty File.");
		
		FileInputStream fileIn = new FileInputStream("Part-Time-Faculty.txt");
		
		Scanner sc = new Scanner(fileIn);
		
		// create array list for part time faculty members
		ArrayList<PartTimeFaculty> PTFaculty = new ArrayList<PartTimeFaculty>();
		
		// creates and adds part time faculty members to array list from input file
		while(sc.hasNextLine())
		{
			PTFaculty.add(new PartTimeFaculty(sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt()));
		}
		
		// appends to file
		FileOutputStream fileOut = new FileOutputStream("Part-Time-Faculty.txt", true);
		PrintWriter pw = new PrintWriter(fileOut);
		
		long id;
		String fn;
		String ln;
		String city;
		int year;
		double rate;
		int hours;
		int numStudents;
		boolean adding = true;
		
		// loops to ask user to enter new record to enter
		while(adding){
			System.out.println("Please enter Employee ID: ");
			id = kb.nextLong();
			while(containsPTId(PTFaculty, id)){
				System.out.println("This Employee ID already exists. Please enter another Employee ID: ");
				id = kb.nextLong();
			}
			System.out.println("Please enter First Name: ");
			fn = kb.next();
			System.out.println("Please enter Family Name: ");
			ln = kb.next();
			System.out.println("Please enter City of Residence: ");
			city = kb.next();
			System.out.println("Please enter Hire Year: ");
			year = kb.nextInt();
			System.out.println("Please enter Hourly Rate: ");
			rate = kb.nextDouble();
			System.out.println("Please enter Number of Hours of Current Term: ");
			hours = sc.nextInt();
			System.out.println("Please enter Number of Student in Class: ");
			numStudents = sc.nextInt();
			// creates new faculty member with user input
			PTFaculty.add(new PartTimeFaculty(id, fn, ln, city, year, rate, hours, numStudents));
			
			// prints record to file
			pw.println();
			pw.print(id + "\t" + fn + "\t" + ln + "\t" + city + "\t" + year + "\t" + rate + "\t" + hours + "\t" + numStudents);
			
			// asks user if they wish to continue adding
			System.out.println("Enter -1 to stop adding or any character to continue adding.");
			String ans = kb.next();
			if(ans.equals("-1"))
				adding = false;
			
		}
		sc.close();
		pw.close();
			
	}
	
	
	public static void addTARecords() throws FileNotFoundException		// adds record to text file for TAs
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are now adding records to TAs File.");
		
		FileInputStream fileIn = new FileInputStream("TAs.txt");
		
		Scanner sc = new Scanner(fileIn);
		
		// create array list for TAs
		ArrayList<TAs> TA = new ArrayList<TAs>();
		
		// creates and adds TAs to array list from input file
		while(sc.hasNextLine())
		{
			long id = sc.nextLong();
			String fn = sc.next();
			String ln = sc.next();
			String city = sc.next();
			int year = sc.nextInt();
			String cl = sc.next();
			
			if(cl.equals("Alum")) // goes to next iteration if it is a Alum
				continue;
			int numClass = sc.nextInt();
			int numHours = sc.nextInt();
			TA.add(new TAs(id, fn, ln, city, year, cl, numClass, numHours));
		}
		
		// appends to file
		FileOutputStream fileOut = new FileOutputStream("TAs.txt", true);
		PrintWriter pw = new PrintWriter(fileOut);
		
		long id;
		String fn;
		String ln;
		String city;
		int year;
		String cl;
		int numClass;
		int numHours;
		boolean adding = true;
		
		// loops to ask user to enter new record to enter
		while(adding){
			System.out.println("Please enter Employee ID: ");
			id = kb.nextLong();
			while(containsTAId(TA, id)){
				System.out.println("This Employee ID already exists. Please enter another Employee ID: ");
				id = kb.nextLong();
			}
			System.out.println("Please enter First Name: ");
			fn = kb.next();
			System.out.println("Please enter Family Name: ");
			ln = kb.next();
			System.out.println("Please enter City of Residence: ");
			city = kb.next();
			System.out.println("Please enter Hire Year: ");
			year = kb.nextInt();
			System.out.println("Please enter Classification (Grad or UGrad): ");
			cl = kb.next();
			System.out.println("Please enter Current Number of Classes: ");
			numClass = kb.nextInt();
			System.out.println("Please enter Total Number of Working Hours: ");
			numHours = kb.nextInt();
			
			// creates new faculty member with user input
			TA.add(new TAs(id, fn, ln, city, year, cl, numClass, numHours));
			
			// prints record to file
			pw.println();
			pw.print(id + "\t" + fn + "\t" + ln + "\t" + city + "\t" + year + "\t" + cl + "\t" + numClass + "\t" + numHours);
			
			// asks user if they wish to continue adding
			System.out.println("Enter -1 to stop adding or any character to continue adding.");
			String ans = kb.next();
			if(ans.equals("-1"))
				adding = false;
			
		}
		// closes files
		sc.close();
		pw.close();
			
	}
	
	public static void findTermSalary() throws FileNotFoundException		// finds the combine salary of employees in the Part Time Faculty text file																			
	{																		// with the TAs in the TAs text file
		
		// creates new linked list of Part Time Faculty
		EmployeeList<PartTimeFaculty> pt = new EmployeeList<PartTimeFaculty>();
		
		// opens stream to take input from Part Time Faculty text file
		Scanner sc = new Scanner(new FileInputStream("Part-Time-Faculty.txt"));
		
		// while loops to add part time faculty member into linked list from file
		while(sc.hasNextLine()){
			pt.addToStart(new PartTimeFaculty(sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt()));
		}
		
		// call find method to find combined salary of PT faculty
		double allPartTimeSal = pt.findPTSalary();
		sc.close(); // closes file
		
		// creates new linked list of TAs and opens new stream to take input from TAs text file 
		EmployeeList<TAs> ta = new EmployeeList<TAs>();
		sc = new Scanner(new FileInputStream("TAs.txt"));
		
		while(sc.hasNextLine()) // while loops and checks if TA is a Alum
		{
			long id = sc.nextLong();
			String fn = sc.next();
			String ln = sc.next();
			String city = sc.next();
			int year = sc.nextInt();
			String cl = sc.next();
			if(cl.equals("Alum")){ // goes to next iteration if it is a Alum
				int na = sc.nextInt();
				int nb = sc.nextInt();
				continue;
			}
			int numClass = sc.nextInt();
			int numHours = sc.nextInt();
			ta.addToStart(new TAs(id, fn, ln, city, year, cl, numClass, numHours)); // adds TA to linked list
		}
		
		// call method to find combined salary of TAs this term
		double TATermSalary = ta.findTASalary();
		sc.close(); // closes file
		
		// prints the total combine salary
		System.out.println("The total combined salary of TAs and part-time faculty is " + (TATermSalary + allPartTimeSal));
	}
	
	public static void findHighest_and_Lowest_FT_Salary() throws FileNotFoundException
	{
		// creates stream to take input from Full Time Faculty text file
		Scanner sc = new Scanner(new FileInputStream("Full-Time-Faculty.txt"));
		
		// creates new FullTimeFaculty linked list
		EmployeeList<FullTimeFaculty> ft = new EmployeeList<FullTimeFaculty>();
		
		// loops while the text has a line to create object and add to linked list
		while(sc.hasNextLine()){
			ft.addToStart(new FullTimeFaculty(sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble()));
		}
		
		sc.close();
		
		// calls method to find highest and lowest salary
		System.out.print("The employee with the highest salary: ");
		ft.findHighestFTSalary();
		System.out.print("The employee with the lowest salary: ");
		ft.findLowestFTSalary();
	}
	
	public static void increase_Staff_Salary() throws FileNotFoundException
	{
		Scanner sc = new Scanner(new FileInputStream("Staff.txt"));
		EmployeeList<Staff> staff = new EmployeeList<Staff>();
		while(sc.hasNextLine()){
			staff.addToStart(new Staff(sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next()));
		}
		sc.close();
		Scanner sb = new Scanner(new FileInputStream("Staff.txt"));
		PrintWriter pw = new PrintWriter(new FileOutputStream("Staff.txt"));
		String reset = "E";
		String code = null;
		for(int i = 0; i < staff.size(); i++){
			code = staff.getCode(i);
			switch(code){
			case "A":
				staff.setStaffSalary(i, (staff.getStaffSalary(i) * 1.08));
				staff.setCode(i, reset);
				break;
			case "B":
				staff.setStaffSalary(i, (staff.getStaffSalary(i) * 1.06));
				staff.setCode(i, reset);
				break;
			case "C":
				staff.setStaffSalary(i, (staff.getStaffSalary(i) * 1.03));
				staff.setCode(i, reset);
				break;
			case "D":
				staff.setStaffSalary(i, (staff.getStaffSalary(i) * 1.01));
				staff.setCode(i, reset);
				break;
			case "E":
				break;
			}
			pw.println(staff.staffAt(i));
		}
		pw.close();
		sb.close();
		
	}
	
	// checks if Array list contains Employee ID entered by user for FULL TIME FACULTY MEMBERS
	public static boolean containsFTId(List<FullTimeFaculty> list, long id) 
	{
	    for (FullTimeFaculty object : list) 
	    {
	        if (object.getEmployeeID() == id) 
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	// checks if Array list contains Employee ID entered by user for PART TIME FACULTY MEMBERS
	public static boolean containsPTId(List<PartTimeFaculty> list, long id) 
	{
		 for (PartTimeFaculty object : list) 
		 {
		      if (object.getEmployeeID() == id) 
		      {
		         return true;
		      }
		 }
	     return false;
	}
		
	// checks if Array list contains Employee ID entered by user for TAs
	public static boolean containsTAId(List<TAs> list, long id) 
	{
		for (TAs object : list) 
		{
		     if (object.getEmployeeID() == id) 
			 {
			    return true;
			 }
		}
		return false;
	}
	

}
