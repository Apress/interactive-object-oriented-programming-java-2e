package java2e.chapter14;

@FunctionalInterface
interface MyFunctionalInterface {	
	int addNumbers(int firstNumber, int secondNumber);
	//error:You cannot declare multiple methods in a functional interface.
	//int addNumbers2(int firstNumber, int secondNumber);	
}
//Usual implementation of an interface method
class Implementor implements MyFunctionalInterface{
	public int addNumbers(int firstNumber, int secondNumber) {
		System.out.println("Implementing the interface method 'addNumbers' inside the Implementor class.");
		System.out.println("Sum of "+ firstNumber + " and " +secondNumber + " is : ");
		return firstNumber+ secondNumber;
	}
}

class LambdaExpressionDemo {
	public static void main(String[] args) {
		System.out.println("***Demonstration 2. Lambda expression.***\n");
		//Common way to use an interface method.
		MyFunctionalInterface impl1= new Implementor();
		System.out.println(impl1.addNumbers(1, 2));		
		
		// Using lambda expression with a return statement.
		System.out.println("Using Lambda expression with a return statement.");
		MyFunctionalInterface impl3 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println("Sum of 50 and 100 is :");
		System.out.print(impl3.addNumbers(50,100));
		
	}
}
