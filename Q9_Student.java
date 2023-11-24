import java.util.*;
import java.lang.*;

class Q9_Student
{
	String name;
	int roll;
	String sclass;
	int m1, m2, m3, m4, m5, m6;				// marks are out of 100
	float percent;

	Q9_Student(String p1, int p2, String p3, int p4, int p5, int p6, int p7, int p8, int p9)
	{
		name = p1;
		roll = p2;
		sclass = p3;
		m1 = p4;
		m2 = p5;
		m3 = p6;
		m4 = p7;
		m5 = p8;
		m6 = p9;

		float total = per(m1, m2, m3, m4, m5, m6);
		percent = (total / 600) * 100;
	}

	float per(int p1, int p2, int p3, int p4, int p5, int p6)
	{
		int tm = p1+p2+p3+p4+p5+p6;
		return tm;
	}
	
	void displayInfo()
	{
		System.out.println("Name = " + name);
		System.out.println("Roll = " + roll);
		System.out.println("Class = " + sclass);
		System.out.println("Percentage = " + percent);

	}

	
	public static void main(String args[])
	{
		Q9_Student s[] = new Q9_Student[5];
		
		s[0] = new Q9_Student("Amu", 13, "MCA", 70, 80, 90, 93, 95, 99);
		s[1] = new Q9_Student("Avinash", 41, "MBA", 45, 90, 67, 72, 59, 83);
		s[2] = new Q9_Student("Ashwini", 15, "MBA", 59, 44, 84, 94, 85, 84);
		s[3] = new Q9_Student("Anoop", 89, "MCA", 85, 64, 74, 53, 96, 76);
		s[4] = new Q9_Student("Amruta", 54, "MBA", 46, 57, 86, 68, 86, 45);

		for(int i=0;i<5;i++)
		{
			s[i].displayInfo();
		}

	}
}