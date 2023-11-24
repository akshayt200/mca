import java.util.*;
import java.lang.*;

class Q8_Arrays
{
	public static void main(String args[])
	{
		int amu_array1[] = {13, 27, 89, 54, 36}; 

		int amu_array2[] = {67, 91, 35, 85, 209}; 
  
    		System.out.println("List Representation = " + Arrays.asList(amu_array1));			//1

		System.out.println("Binary Search = " + Arrays.binarySearch(amu_array1, 27));		//2

		System.out.println("Compare = " + Arrays.compare(amu_array1, amu_array2));		//3

		System.out.println("Compare Unsigned = " + Arrays.compareUnsigned(amu_array1, amu_array2));	//4
	
		System.out.println("Stream = " + Arrays.stream(amu_array1));			//5
		
		System.out.println("Split Iterator = " + Arrays.spliterator(amu_array1));			//6
		
		System.out.println("Equality = " + Arrays.equals(amu_array1, amu_array2));		//7

		System.out.println("Hashcode = " + Arrays.hashCode(amu_array1));			//8

		System.out.println("Mismatch = " + Arrays.mismatch(amu_array1, amu_array2));		//9
		
		System.out.println("List Representation = " + Arrays.toString(amu_array2));			//10
		
	}
}