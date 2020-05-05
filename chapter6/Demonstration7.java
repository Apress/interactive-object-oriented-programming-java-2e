package java2e.chapter6;

interface Interface7A {
	void showInterface7AMethod();
}

interface Interface7B {
	void showInterface7BMethod();
}

//Interface extending another interfaces
interface Interface7C extends Interface7A, Interface7B {
	void showInterface7CMethod();
}

class MyClass7 implements Interface7C {
	// Now MyClass7 needs to implement methods from Interface1,Interface2 and
	// Interface3
	@Override
	public void showInterface7AMethod() {
		System.out.println("MyClass7 has implemented the showInterface7AMethod() method.");

	}

	@Override
	public void showInterface7BMethod() {
		System.out.println("The showInterface7BMethod() method is implemented by MyClass7.");
	}

	@Override
	public void showInterface7CMethod() {
		System.out.println("MyClass7 has completed the showInterface7CMethod() method.");

	}
}

/*
 * class AnotherClass {
 * 
 * }
 * 
 * //Correct syntax:
 /class MyClass7B extends AnotherClass implements Interface7A, Interface7B {

 * //Incorrect syntax :
 //class MyClass7B implements Interface7A, Interface7B extends AnotherClass{

 * @Override public void showInterface7BMethod() { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void showInterface7AMethod() { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * }
 */

class Demonstration7 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-7.Interface  can extend other interfaces\n");

		// Creating a MyClass7 object
		MyClass7 myClassOb = new MyClass7();

		Interface7A inter7A = myClassOb;
		inter7A.showInterface7AMethod();

		Interface7B inter7B = myClassOb;
		inter7B.showInterface7BMethod();

		Interface7C inter7C = myClassOb;
		inter7C.showInterface7CMethod();

		// Calling directly through myClassOb.
		System.out.println("\n**Now invoking the methods directly through a MyClass object.**\n");
		myClassOb.showInterface7AMethod();
		myClassOb.showInterface7BMethod();
		myClassOb.showInterface7CMethod();
	}

}
