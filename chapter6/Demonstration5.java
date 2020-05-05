package java2e.chapter6;

interface MyInterface5A {
	void show5A();
}

interface MyInterface5B {
	void show5B();
}

class MyClass5 implements MyInterface5A, MyInterface5B {
	@Override
	public void show5A() {
		System.out.println("Inside MyClass5,show5A() is completed.");
	}

	@Override
	public void show5B() {
		System.out.println("Inside MyClass5,show5B() is completed.");
	}
}

class Demonstration5 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-5.Implementation of multiple interfaces.***\n");
		MyClass5 myClassOb = new MyClass5();
		myClassOb.show5A();
		myClassOb.show5B();
	}
}
