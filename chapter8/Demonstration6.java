package java2e.chapter8;

interface MyInterface {
	// The traditional interface method
	void traditionalInteraceMethod();

	// The default interface method
	default void defaultInteraceMethod() {
		System.out.println("Default interface method in MyInterface is called.");
	}

	// The static interface method(Java 8 onwards)
	static void staticMethod() {
		System.out.println("Static interface method in MyInterface is called.");
	}
}

class ClassDemo8 implements MyInterface {
	@Override
	public void traditionalInteraceMethod() {
		System.out.println("Overriding the traditionalInteraceMethod() in ClassDemo8");
	}

	@Override
	public void defaultInteraceMethod() {
		System.out.println("Overriding the defaultInteraceMethod() in ClassDemo8");
	}

	// @Override //Will cause Error
	public static void staticMethod() {
		System.out.println("This is the static method of the implementing class(ClassDemo8).");
		System.out.println("You cannot override the static method in MyInterface.");
	}

}

class Demonstration6 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Exploring static methods in an interface.***\n");
		System.out.println("Calling static interface method.");
		MyInterface.staticMethod();
		MyInterface inter = new ClassDemo8();
		System.out.println("\nCalling the default interface method from implementing class.");
		inter.defaultInteraceMethod();
		System.out.println("\nCalling the traditional interface method from implementing class.");
		inter.traditionalInteraceMethod();
		System.out.println("\nCalling the static method from implementing class.");
		ClassDemo8.staticMethod();
		// Compile-time error: The static method of interface MyInterface can only be
		// accesed as MyInterface.staticMethod();
		//The following will cause error:
		// inter.staticMethod();//error
	}
}
