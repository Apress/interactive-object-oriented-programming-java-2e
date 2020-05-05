package java2e.chapter10;

import java.util.Random;

public class Demonstration11 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-11.Incorrect use of try-catch block***\n");
		int a = 10;
		Random randomGenerator = new Random();
		// Will generate 0 to 2.
		int b = randomGenerator.nextInt(3);
		System.out.println("b=" + b);
		int c = 0;
		try {
			c = a / b;
			System.out.println("c=" + c);
		} catch (ArithmeticException ex) {
			// printing c=7, after catching the exception
			System.out.println("c=" + 7);
		}
	}
}
