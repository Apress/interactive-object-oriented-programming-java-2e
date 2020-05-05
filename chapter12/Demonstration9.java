package java2e.chapter12;

import java.util.List;
import java.util.ArrayList;

class Demonstration9 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-9.Examine the type erasures.***");
		List<Integer> myIntList = new ArrayList<Integer>();
		myIntList.add(10);
		myIntList.add(20);
		//myIntList.add("Invalid");//error
		
		int firstNumber=myIntList.get(0);
		System.out.println("First number is :"+ firstNumber);
		int secondNumber=myIntList.get(1);
		System.out.println("Second number is :"+ secondNumber);
		
		List<String> myStrList = new ArrayList<String>();
		myStrList.add("Hello");
		myStrList.add(" world !");		
		//myStrList.add(30);//error
		
		String firstString=myStrList.get(0);
		System.out.println("First String is :"+ firstString);
		String secondString=myStrList.get(1);
		System.out.println("Second String is :"+ secondString);
	}
}
