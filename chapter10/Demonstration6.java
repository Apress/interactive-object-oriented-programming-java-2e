package java2e.chapter10;


class Demonstration6 {
	static int c;

	static void divide(int a, int b) {
		try {
			b--;
			c = a / b;
			// some code
		} catch (ArithmeticException ex) {
			//Log it now
			System.out.println("a= " + a + " b= " + b);//a=100,b=0
			System.out.println("Message: " + ex.getMessage());
			// Now rethrow it
			throw ex;// rethrowing the exception
		} 
	}

	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Rethrowing an exception.***");
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
