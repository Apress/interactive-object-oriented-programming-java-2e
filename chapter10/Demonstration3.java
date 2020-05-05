package java2e.chapter10;

import java.util.Random;

public class Demonstration3 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-3.Handling multiple Exceptions***");
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
			int[] arr = new int[2];
			arr[0] = 0;
			arr[1] = c + 1;
			if (b % 2 == 0) {
				// Case-2: (b is not zero here) it will raise ArrayIndexOutOfBoundsException
				arr[2] = c + 2;
			} else {
				Object myObject = null;
				// case-3: It raise NullPointerException
				int hashcode = myObject.hashCode();
			}
		} catch (ArithmeticException ex) {
			System.out.println("Caught the ArithmeticException :" + ex.getMessage());
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Caught the ArrayIndexOutOfBoundsException :" + ex.getMessage());
			ex.printStackTrace();
		} 
		/*//Java 7 onwards, you can write multiple catch clauses like the following
		catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Caught either ArithmeticException or ArrayIndexOutOfBoundsException :" + ex.getMessage());
			ex.printStackTrace();
		} */				
		catch (Exception ex) {
			System.out.println("Caught the Exception :" + ex.getMessage());
			ex.printStackTrace();
		}finally {
			System.out.println("I am finally here");
		}
	}
}
