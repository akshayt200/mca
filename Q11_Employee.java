import java.util.*;
import java.lang.*;

class Q11_Employee
{
	String name;
	String designation;
	int salary;
	static int no_objects = 0; 

	Q11_Employee()
	{
		name = null;
		designation = null;
		salary = 0;
	}

	Q11_Employee(String p1, String p2, int p3)
	{
		++no_objects;
		System.out.println("Object Created = " + no_objects);
		
		
		this.name = p1;
		this.designation = p2;
		this.salary = p3;
	}

	void displayinformation()
	{
		System.out.println("Name = " + name);
		System.out.println("Designation = " + designation);
		System.out.println("Salary = " + salary);
	}

	public static void main(String args[])
	{
		Q11_Employee e1 = new Q11_Employee("Amod", "Module Lead", 34000);
		Q11_Employee e2 = new Q11_Employee("Kunal", "Functional Testing", 28000);

		e1.displayinformation();
		e2.displayinformation();
		
	}
}
