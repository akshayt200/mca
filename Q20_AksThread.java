import java.util.*;
import java.lang.*;

class Sync_Keyword
{
	void AksInfo(int n)
	{ 
        	for(int i=1;i<=5;i++)
		{  
            		try
			{  
                		System.out.println(i*n);  
            		}
			catch(Exception e)
			{
                		System.out.println(e);
            		}  
        	} 
	} 
}


class AksThread1 extends Thread
{
	Sync_Keyword s;

	AksThread1(Sync_Keyword s)
	{
		this.s = s;
	}

	public void run()
	{
		//System.out.println("In Thread 1");
		s.AksInfo(5);
	}
}

class AksThread2 extends Thread
{
	Sync_Keyword s;

	AksThread2(Sync_Keyword s)
	{
		this.s = s;
	}

	public void run()
	{
		//System.out.println("In Thread 2");
		s.AksInfo(100);
	}
}

class Q20_AksThread
{
	public static void main(String args[])
	{
		Sync_Keyword s = new Sync_Keyword();
		AksThread1 a1 = new AksThread1(s);
		AksThread2 a2 = new AksThread2(s);
		a1.start();
		a2.start();
	}
}