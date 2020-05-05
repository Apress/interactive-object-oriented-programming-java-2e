package java2e.chapter6;

interface MyInterface {
	void implementMe();
}

class MyClass implements MyInterface {
	public void implementMe() {
		System.out.println("MyClass is implementing the interface method implementMe().");
	}
}

class Demonstration3 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-3.Exploring Interfaces.***\n");
		MyClass myClassOb = new MyClass();
		myClassOb.implementMe();
	}
}
