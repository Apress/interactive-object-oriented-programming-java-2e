package java2e.chapter6;

interface Interface10 {
	// Traditional interface method without a body.
	void traditionalInterfaceMethod();

	// Java 8 onwards:
	// A default method in the interface.
	// It can have a body.
	default void defaultMethod() {
		System.out.println("It is a default implementation in the interface- Interface10.");
	}
}

class MyClass10 implements Interface10 {
	@Override
	public void traditionalInterfaceMethod() {
		System.out.println("MyClass10 is implementing the interface method-traditionalInterfaceMethod()");
	}

	/*
	@Override
	public void defaultMethod() {
		System.out.println("MyClass10 is overriding the default interface method.");
	}
	*/

}

class Demonstration10 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-10.Use of default methods in Java***\n");
		Interface10 interfaceOb = new MyClass10();
		interfaceOb.traditionalInterfaceMethod();
		interfaceOb.defaultMethod();
	}
}
