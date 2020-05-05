package java2e.chapter10;

//A custom exception
class InvalidIntegerInputException extends Exception {	
	 InvalidIntegerInputException(String msg,Throwable causeEx) {
		super(msg, causeEx);
	}	
}

class Demonstration12 {
	static int c;

	static void divide(int a, int b) throws  InvalidIntegerInputException{
		try {
			b--;
			c = a / b;
			// some code
		} catch (ArithmeticException ex) {
			//Log it now
			System.out.println("a= " + a + " b= " + b);//a=100,b=0
			System.out.println("Message: " + ex.getMessage());
			// Now rethrow it
			throw new InvalidIntegerInputException(" The divisor becomes zero", ex);
		} 
	}

	public static void main(String[] args) {
		System.out.println("***Demonstration-12.Rethrowing an exception which is wrapped in a custom exception.***");
		System.out.println("Actually, we are modifying the demonstration-6.");
		int a = 100, b = 1;
		try {
		divide(a,b);
		}
		catch (Exception ex) {
			System.out.println("Recaught the exception inside main() method.");
			System.out.println("a= " + a + " b= " + b);//a=100,b=1
			System.out.println("Here is the stackTrace :");
			ex.printStackTrace();
		}
	}
}
