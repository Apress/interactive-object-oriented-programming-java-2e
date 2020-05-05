package java2e.chapter6;

//Note: Both of the interfaces have the same method name "show()".
interface MyInterface6A {
	void show();
}

interface MyInterface6B {
	void show();
}

class MyClass6 implements MyInterface6A, MyInterface6B {
	@Override
	public void show() {
		System.out.println("MyClass6 is completing the show() method.");
	}
}

class Demonstration6 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Exploring multiple interfaces\n");
		// All the following ways of callings are fine.

		// Approach-1
		MyClass6 myClassOb = new MyClass6();
		System.out.print("Approach-1:");
		myClassOb.show();

		// Approach-2
		System.out.print("Approach-2:");
		MyInterface6A inter6A = myClassOb;
		inter6A.show();

		// Approach-3
		System.out.print("Approach-3:");
		MyInterface6B inter6B = myClassOb;
		inter6B.show();

		// Approach-4
		System.out.print("Approach-4:");
		((MyInterface6A) myClassOb).show();

		// Approach-5
		System.out.print("Approach-5:");
		((MyInterface6B) myClassOb).show();
	}
}
