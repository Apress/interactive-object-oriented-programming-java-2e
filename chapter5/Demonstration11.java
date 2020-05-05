package java2e.chapter5;

class FinalDemo {
	// Must be initialized inside a constructor
	final double PI;
	double area;

	FinalDemo() {
		PI = 3.14;
	}

	FinalDemo(int radius) {
		// Invoking the no-argument constructor to initialize the final variable
		this();
		this.area = this.PI * radius * radius;
	}
}

class Demonstration11 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-11. Testing the behavior of final keyword.***\n");
		FinalDemo fdemo = new FinalDemo(10);
		System.out.println("Area of a circle with radious 10 unit is " + fdemo.area + " square unit.");
	}
}
