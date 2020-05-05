package java2e.chapter6;

interface DefaultInterface11A {
	void show();

	default void myDefaultMethod() {
		System.out.println("Default implementation for interface3 is called.");
	}
}

interface DefaultInterface11B {
	void show();

	default void myDefaultMethod() {
		System.out.println("Default implementation for interface4 is called.");
	}
}

class Class11 implements DefaultInterface11A, DefaultInterface11B {
	
	public void show() {
		System.out.println("Class11 is implementing the Interface method-show().");
	}

	@Override
	public void myDefaultMethod() {
		System.out.println("Class11 needs to implement this method.");
		// Modified for Q&A 6.23
		// Calling default method of DefaultInterface11A
		//DefaultInterface11A.super.myDefaultMethod();
		// Calling default method of DefaultInterface11B
		//DefaultInterface11B.super.myDefaultMethod();
	}
	
}

class Demonstration11 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-11.Avoiding diamond problem when default methods are involved***\n");
		System.out.println("Using DefaultInterface11A reference:");
		DefaultInterface11A interfaceOb11A = new Class11();
		interfaceOb11A.show();
		interfaceOb11A.myDefaultMethod();

		System.out.println("----------------------");
		System.out.println("Using DefaultInterface11B reference:");
		DefaultInterface11B interfaceOb11B = new Class11();
		interfaceOb11B.show();
		interfaceOb11B.myDefaultMethod();
	}
}
