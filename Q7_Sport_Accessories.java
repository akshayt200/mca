import java.util.*;
import java.lang.*;

class Q7_Sport_Accessories
{	
	int Accessory_Id;
	String Description;
	int Quantity;
	int Rate;
	String Used_In_Game;

	Q7_Sport_Accessories(int p1, String p2, int p3, int p4, String p5)
	{
		Accessory_Id = p1;
		Description = p2;
		Quantity = p3;
		Rate = p4;
		Used_In_Game = p5;
	}

	void displayinformation()
	{
		System.out.println("\n");
		System.out.println("Accessory_Id = " + Accessory_Id);
		System.out.println("Description = " + Description);
		System.out.println("Quantity = " + Quantity);
		System.out.println("Rate = " + Rate);
		System.out.println("Used_In_Game = " + Used_In_Game);
		System.out.println("\n");
	}

	public static void main(String args[])
	{
		Q7_Sport_Accessories Q[] = new Q7_Sport_Accessories[5];

		Q[0] = new Q7_Sport_Accessories(1, "Ball", 5, 35, "Cricket");
		Q[1] = new Q7_Sport_Accessories(2, "Hat", 12, 20, "Cricket");
		Q[2] = new Q7_Sport_Accessories(3, "Bat", 2, 2750, "Cricket");
		Q[3] = new Q7_Sport_Accessories(4, "Stumps", 6, 250, "Cricket");
		Q[4] = new Q7_Sport_Accessories(5, "Pads", 4, 800, "Cricket");

		for(int i=0;i<5;i++)
		{
			Q[i].displayinformation();
		}
		
	}
}