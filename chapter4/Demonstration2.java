package java2e.chapter4;

class A {
	private int a;
}

class B extends A {
}

class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Private members are also inherited***");
		B obB = new B();
		A obA = new A();
		
		/*
		  // This is a proof that a is also inherited. See the error message.
		 System.out.println(obB.a);// Error:The field A.a is not visible
		 System.out.println(obB.b);// Error: b cannot be resolved or is not a field
		 
		 System.out.println(obA.a);// Error:The field A.a is not visible
		 System.out.println(obA.b);// Error: b cannot be resolved or is not a field
		 */
		 	 
	}
}
