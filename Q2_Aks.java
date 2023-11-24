import java.util.*;
import java.lang.*;

class Animal
{
	void run()
	{
		System.out.println("Animal is Running");
	}
}

class Dog extends Animal
{
	void run()
	{
		System.out.println("Dog is Running");
	}
}

class Q2_Aks
{
	public static void main(String args[])
	{
		Animal a = new Animal();
		a.run();
		
		Dog d = new Dog();
		d.run();

		Animal an = new Dog();
		an.run();
	}
}