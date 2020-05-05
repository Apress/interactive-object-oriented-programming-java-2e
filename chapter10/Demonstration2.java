package java2e.chapter10;

public class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring Exceptions-Demonstration1 is modified.***");
		int a = 100, b = 2, result;
		b -= 2;// b beomes 0
		try {
			result = a / b;
			System.out.println(" So, the result of a/b is : " + result);
		} catch (Exception ex) {
			System.out.println("Encountered an exception " + ex.getMessage());
			System.out.print("Here is the stack trace:");
			ex.printStackTrace();			
		} finally {
			System.out.println("I am in finally.You cannot skip me!");
		}
	}
}
