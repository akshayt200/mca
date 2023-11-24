import java.util.*;

class Demo 
{
	void show()
	{
		// Print statement
		System.out.println("i am in base class");
	}
}

class Q6_Type2 
{
	static Demo d = new Demo() 
	{
		void show()
		{
			super.show();

			System.out.println("i am in Q6Type2 class");
		}
	};

	public static void main(String[] args)
	{
		d.show();
	}
}
