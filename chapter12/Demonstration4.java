package java2e.chapter12;

import java.util.ArrayList;
import java.util.List;

public class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4.Use Generics to promote type-safety and avoid runtime error***");
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		// Compile time error when you use ArrayList<Integer>
		//myList.add("Invalid");		
		//Printing the contents of the ArrayList
		System.out.println("Here is the contents of the ArrayList:");
			for (int i = 0; i < myList.size(); i++) {			
			System.out.println(myList.get(i));
		}
			/*
			 * for (int myInt : myList) { System.out.println(myInt); }
			 * System.out.print("Printing the elements using lambda expression:\n"); 
			 //Or, use the enhanced for loop with lambda expression 
			 myList.forEach((myInt) -> System.out.println(myInt));
			 */
			//Picking last element in the ArrayList
			//No casting is required now
		  int lastElement=myList.get( myList.size()-1);
		  System.out.println("Adding 1 to last element and printing");
		  System.out.println(++lastElement);//No run-time error
			
	}

}
