import java.util.*;
import java.lang.*;

class Q18_AksThread extends Thread
{
	public void run()
	{
		int count; 

		try
		{
			for (int i = 1; i <= 500; i++) 
			{
      				count = 0;  

				for (int j = 2; j <= i / 2; j++) 
				{
        				if (i % j == 0) 
					{
          					count++;  // Increment if 'i' is divisible by 'j'
          					break;  // Exit loop if a divisor is found
        				}
				}

      				if (count == 0) 
				{
					Thread.sleep(3000);
        				System.out.println(i);  // Output the prime number
      				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		Q18_AksThread a = new Q18_AksThread();
		a.start();
		
	}
}