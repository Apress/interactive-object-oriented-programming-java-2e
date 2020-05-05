package java2e.chapter4;

class ParentClass {
	public void showParentMethod() {
		System.out.println("I am a Parent Class method.");
	}
}

class ChildClass extends ParentClass {
}

class Demonstration1 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Testing Inheritance.***");
		// Creating a ChildClass object
		ChildClass child1 = new ChildClass();
		// Invoking showParentMethod() through ChildClass object
		child1.showParentMethod();
	}
}
