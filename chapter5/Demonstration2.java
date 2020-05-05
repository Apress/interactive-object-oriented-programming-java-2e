package java2e.chapter5;

class ConstructorOverloadEx {
	ConstructorOverloadEx() {
		System.out.println("Constructor cannot accept any argument.");
	}

	ConstructorOverloadEx(int a) {
		System.out.println("Constructor can accept one integer argument: " + a);
	}

	ConstructorOverloadEx(int a, double b) {
		System.out.println("Constructor can accept one integer argument: " + a + " and one double argument: " + b);
	}
}

public class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Constructor Overloading.***");
		ConstructorOverloadEx ob1 = new ConstructorOverloadEx();
		ConstructorOverloadEx ob2 = new ConstructorOverloadEx(2);
		ConstructorOverloadEx ob3 = new ConstructorOverloadEx(2, 3.7);
	}
}
