import java.util.*;
import java.lang.*;

class XYZ
{
	int x = 30;
}

class Q5_DS_Cloning
{
	public static void main(String args[])
	{
		XYZ a = new XYZ();

		System.out.println("Shallow copying object");
		XYZ b = a;

		System.out.println("The value of x in a Object : " + a.x);
		System.out.println("The value of x in b Object : " + b.x);

		b.x = 6;

		System.out.println("After chaning the value of x in b Object : " + a.x);
		System.out.println("The value of x in a Object : " + a.x);
		System.out.println("The value of x in b Object : " + b.x);

		System.out.println("Deep copying object");
		XYZ c = new XYZ();

		c.x = a.x;
		
		System.out.println("The value of x in c Object : " + c.x);
		System.out.println("The value of x in a Object : " + a.x);

		c.x = 8;

		System.out.println("After chaning the value of x in c Object : " + a.x);
		System.out.println("The value of x in c Object : " + c.x);
		System.out.println("The value of x in a Object : " + a.x);
		
		
	}
}