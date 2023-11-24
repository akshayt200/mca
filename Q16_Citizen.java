import java.util.*;

class Age_Exception extends Exception 
{
    	public Age_Exception(String message) 
	{
        	super(message);
    	}
}

public class Q16_Citizen 
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		Scanner sc = new Scanner(System.in);
            
           		System.out.print("Enter the Citizen's Name = ");
            		String name = sc.nextLine();
            
            		System.out.print("Enter the Citizen's age = ");
            		int age = sc.nextInt();
            
            		if (age < 60) 
			{
                		throw new Age_Exception("Age_Exception : Age > 60 for being a Senior Citizen.");
            		}
            
            		System.out.println("Name =  " + name);
            		System.out.println("Age = " + age);
        	} 
		catch (Age_Exception e) 
		{
            		System.err.println(e.getMessage());
        	} 	
    	}
}
