package java2e.chapter12;
import java.util.ArrayList;
import java.util.List;

public class Demonstration3 {

	public static void main(String[] args) {
		System.out.println(
				"***Demonstration-3.A bad practise.Using a lagacy ArrayList and encountering a run-time error.***");
		// BAD practise.Following line of code is using a legacy ArrayList
		List myList = new ArrayList();
		myList.add(10);
		myList.add(20);
		myList.add("Invalid");// No compile time error when you use legacy ArrayList
		// Printing the contents of the ArrayList
		System.out.println("Here is the contents of the ArrayList:");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		// Picking last element in the ArrayList
		int lastElement = (int) myList.get(myList.size() - 1);
		System.out.println("Adding 1 to last element and printing");
		System.out.println(++lastElement);// Run-time error
	}
}
