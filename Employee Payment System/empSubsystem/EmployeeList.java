package empSubsystem;

import java.util.ArrayList;

public class EmployeeList<T> {
	
	private Node<T> head;
	
	// Inner Node Class
	class Node<T>
	{
		private T x;
		private Node<T> next;
		
		// Constructors
		public Node()
		{
			x = null;
			next = null;
		}
		
		public Node(T y, Node<T> n)
		{
			x = y;
			next = n;
		}
	}
	
	
	// Constructor head/empty list
	public EmployeeList()
	{
		head = null;
	}
	
	// adds a new node to the start of the list
	public void addToStart(T x)
	{
		head = new Node<T>(x, head);
	}
	
	// finds Part time Faculty Salary
	public double findPTSalary()
	{
		double salary = 0;
		double baseSal;

		if(head == null) // returns 0 if the list is empty
			return salary;
		Node<T> t = head; // node which points to the head of the list
		
		// goes through list and calculates salary based on hours, rate, and number of students
		while(t != null){
			
			baseSal = ((PartTimeFaculty) t.x).getHourlyRate() * ((PartTimeFaculty) t.x).getNumHours();
			
			if(((PartTimeFaculty) t.x).getNumStudents() <= 60 && ((PartTimeFaculty) t.x).getNumStudents() >= 40)
				salary = baseSal + 500;
			else if(((PartTimeFaculty) t.x).getNumStudents() > 60)
				salary = baseSal + 1000;
			else
				salary = baseSal;
			t = t.next;
		}
		return salary;
	}
	
	// find TAs salary
	public double findTASalary()
	{
		// hourly rate of TAs
		double salary = 0;
		double ugrate = 18.25;
		double gdrate = 1.2 * 18.25;
		
		if(head == null)	 // returns 0 if the list is empty
			return salary;
		
		Node<T> t = head; 	// node which points to the head of the list
		
		// calculates TAs salary based on their classification and hourly rate
		while(t != null){
			String student = ((TAs) t.x).getClassification();
			if(student.equals("UGrad")){
				salary = salary + ((TAs) t.x).getTotalHours() * ugrate;
			}
			else if(student.equals("Grad")){
				salary = salary + ((TAs) t.x).getTotalHours() * gdrate;
			}
			else
				salary = salary;
			t = t.next;
		}
		return salary;
		
	}
	
	// finds the highest Full time faculty salary in list
	public double findHighestFTSalary()
	{
		FullTimeFaculty highest = null;
		if(head == null)	// returns 0 if the list is empty
			return 0;
		
		if(head.next == null){	// prints the salary if the node only has one node
			System.out.println(head.x);
			return ((FullTimeFaculty) head.x).getFTSalary();
		}
		
		Node<T> t = head;
		Node<T> t2 = head.next;
		
		// compares nodes to get their salary where t is always the node with the highest salary
		while(t != null && t2 != null){
			if(((FullTimeFaculty) t.x).getFTSalary() > ((FullTimeFaculty) t2.x).getFTSalary()){
				highest = (FullTimeFaculty) t.x;	// stores full time faculty into variable 'highest'
				t2 = t2.next;
			}
			else if(((FullTimeFaculty) t.x).getFTSalary() < ((FullTimeFaculty) t2.x).getFTSalary()){
				highest = (FullTimeFaculty) t2.x;
				t = t2;
				t2 = t2.next;
			}
			else{
				highest = (FullTimeFaculty) t2.x;
				t2 = t2.next;
			}
		}
		t2 = null;
		t = head;
		
		// verifies if any other node has the same highest salary
		while(t != null){
			if(((FullTimeFaculty) t.x).getFTSalary() == highest.getFTSalary()){
				System.out.println(t.x);
			}
			t = t.next;
		}
		return highest.getFTSalary();
		
	}
	
	// finds the highest Full time faculty salary in list
	public double findLowestFTSalary()
	{
		FullTimeFaculty lowest = null;
		if(head == null)
			return 0;
		
		if(head.next == null){	 // prints node when there is only one node
			System.out.println(head.x);
			return ((FullTimeFaculty) head.x).getFTSalary();
		}
		Node<T> t = head;
		Node<T> t2 = head.next;
		
		// compares nodes to get their salary where t is always the node with the lowest salary
		while(t != null && t2 != null){
			if(((FullTimeFaculty) t.x).getFTSalary() < ((FullTimeFaculty) t2.x).getFTSalary()){
				lowest = (FullTimeFaculty) t.x;
				t2 = t2.next;
			}
			else if(((FullTimeFaculty) t.x).getFTSalary() > ((FullTimeFaculty) t2.x).getFTSalary()){
				lowest = (FullTimeFaculty) t2.x;
				t = t2;
				t2 = t2.next;
			}
			else{
				lowest = (FullTimeFaculty) t2.x;
				t2 = t2.next;
			}
		}
		t2 = null;
		t = head;
		
		// checks if their is multiple employee with the lowest salary
		while(t != null){
			if(((FullTimeFaculty) t.x).getFTSalary() == lowest.getFTSalary()){
				System.out.println(t.x);
			}
			t = t.next;
		}
		return lowest.getFTSalary();
	}
	
	// gets size of the linked list
	public int size()
	{
		if(head == null)
			return 0;
		
		Node<T> t = head;
		int counter = 0;
		while(t != null){
			counter++;
			t = t.next;
		}
		return counter;
	}
	
	// gets code of a staff member at a specific node
	public String getCode(int x)
	{
		if(head == null) // returns null if list is empty
			return null;
		
		if(x > this.size()) // returns null if node is greater than number of nodes
			return null;
		
		int counter = 0;
		Node<T> t = head;
		while(counter < x){
			t = t.next;
			counter++;
		}
		String code = ((Staff) t.x).getCode();
		t = null;
		return code;
	}
	
	// sets the performance code of a Staff at x position
	public void setCode(int x, String code)
	{
		if(head == null)	// if head is null return
			return;
		if(x > this.size()) // if position is larger than size of list return
			return;
		
		int counter = 0;
		Node<T> t = head; 	// node pointing to start of list
		while(counter < x){ // loops until it reaches position
			t = t.next;
			counter++;
		}
		((Staff) t.x).setCode(code); // sets code
	}
	
	// gets staff salary at x position in list
	public double getStaffSalary(int x)
	{
		if(head == null) 	// if head is null return
			return 0;
		if(x > this.size())	// if position is larger than size of list return
			return 0;
		
		int counter = 0;
		Node<T> t = head;	// node pointing to start of list
		while(counter < x){	// loops until it reaches position
			t = t.next;
			counter++;
		}
		return ((Staff) t.x).getSalary(); // returns salary of that staff
	}
	
	public void setStaffSalary(int x, double sal)
	{
		if(head == null)
			return;
		if(x > this.size())
			return;
		
		int counter = 0;
		Node<T> t = head;
		while(counter < x){
			t = t.next;
			counter++;
		}
		((Staff) t.x).setSalary(sal);
	}
	
	public Staff staffAt(int x)
	{
		if(head == null)
			return null;
		if(x > this.size())
			return null;
		
		int counter = 0;
		Node<T> t = head;
		while(counter < x){
			t = t.next;
			counter++;
		}
		return ((Staff)t.x);
	}
}
