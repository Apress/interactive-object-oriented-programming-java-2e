package java2e.chapter10;

import java.util.Random;

public class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4.Incorrect way of writing code inside the finally block***");
		try {
			System.out.println("I am inside the try block.");	
		}
		finally {
			System.out.println("I am at the beginning of finally block.");	
			int a = 5;
			Random randomGenerator = new Random();
			// Will generate 0 to 2.
			int b = randomGenerator.nextInt(3);//Can produce 0
			System.out.println("Current value of b is : " + b);
			int c = a / b;
			System.out.println("c=" + c);
			System.out.println("I am at the end of finally block");	
		}

	}

}
