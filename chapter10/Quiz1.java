package java2e.chapter10;

import java.util.Random;

public class Quiz1 {

	public static void main(String[] args) {
		System.out.println("***Quiz1.It is about how to place the catch clauses in the program.***");
		int a = 5;
		Random randomGenerator = new Random();
		// Will generate 0 to 2.
		int b = randomGenerator.nextInt(3);
		System.out.println("Current value of b is : " + b);
		int c = 0;
		try {
			// Case-1:Here b=0,it will raise ArithmeticException
			c = a / b;
			System.out.println("c=" + c);			
		} 
		/*//Incorrect placement of following catch clause
		catch (Exception ex) {
			System.out.println("Caught the Exception :" + ex.getMessage());
			ex.printStackTrace();
		}*/
		//Java 7 onwards, you can write multiple catch clauses like the following
		catch (ArithmeticException ex) {
			System.out.println("Caught either ArithmeticException :" + ex.getMessage());
			ex.printStackTrace();
		}//Correct placement of the catch clause				
		/*catch (Exception ex) {
			System.out.println("Caught the Exception :" + ex.getMessage());
			ex.printStackTrace();
		}*/finally {
			System.out.println("I am finally here");
		}
	}

}
