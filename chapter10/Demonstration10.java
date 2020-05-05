package java2e.chapter10;

class SumGreaterThan100Exception extends Exception {
	SumGreaterThan100Exception() {
		System.out.println("Greater than 100.");
	}
	SumGreaterThan100Exception(String msg) {
		super(msg);
	}	
}

interface DemoInterface {
	int sum(int x, int y) throws SumGreaterThan100Exception;
}

class Demo10Class implements DemoInterface {
	public int sum(int x, int y) throws SumGreaterThan100Exception {
		int sumofIntegers = x + y;

		if (sumofIntegers <= 100) {
			System.out.println(" Here first number="+ x + " and second Number="+y);
			return sumofIntegers;
		} else {
			System.out.println(" Now first number="+ x + " and second Number="+y);
			throw new SumGreaterThan100Exception("Sum is greater than 100.");
			//throw new SumGreaterThan100Exception();		
		}
	}
}

class Demonstration10 {
	public static void main(String args[]) {
		System.out.println("***Demonstration-10.Creating a custom exception***\n");
		Demo10Class demo = new Demo10Class();
		try {
			int result = demo.sum(10, 50);// ok
			System.out.println("Sum of 10 and 50 is : " + result);
			// Now the sum is greater than 100, so, it will raise the  custom exception.
			result = demo.sum(50, 70);
			System.out.println("Sum of 50 and 70 is :  " + result);

		} catch (SumGreaterThan100Exception e) {
			System.out.println("Caught the custom exception : " + e);
			e.printStackTrace();
		}
	}
}
