package java2e.chapter8;

class Parent4 {
	static void staticMethod() {
		System.out.println("I am a static method in Parent4.");
	}

	void nonStaticMethod() {
		System.out.println("A non-static method in Parent4.");
	}
}

class Child4 extends Parent4 {
	static void staticMethod() {
		System.out.println("Inside Child4 class,I am hiding the parent class static method.");
	}

	void nonStaticMethod() {
		System.out.println("Overriding a non-static method in Parent4.");
	}
}

class Demonstration4 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-4.Derived class method hides the static method of the parent class***\n");
		Child4.staticMethod();// Hides the parent class method
		// Checking dynamic method dispatch
		Parent4 parent = new Child4();
		Parent4.staticMethod();//Invokes parent class method
		System.out.println("xxx-Doing a bad practise.Invoking a static method on instance.-xxx");
		parent.staticMethod();//Bad practise:Invokes parent class method
		parent.nonStaticMethod();// Invokes child class method

		/* Bad practise:
		 Following code can also invoke the child class static method.But you'll receive the 
		 warning message saying:
		 "staticMethod() from the type Child4 should be accessed in a static way"*/
		//new Child4().staticMethod();
	}
}
