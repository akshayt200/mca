import java.util.*;
import java.lang.*;

class Q19_AmuThread extends Thread
{
	public void run()
	{
		int num, sum = 0, i;

		try
		{
			for(num = 1; num <= 1000; num++) 
			{
        			for (int j = 1; j <= num - 1; j++) 
				{   
            				if (num % j == 0) 
					{
                				sum = sum + j;
            				}
        			}
        			if (sum == num) 
				{
					Thread.sleep(5000);
            				System.out.println(num);
        			}
        			sum = 0;  
			}                            
    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		Q19_AmuThread a = new Q19_AmuThread();
		a.start();
		
	}
}