package java2e.chapter2;

//Constructor overloading example
class ClassEx4 {
	int i;

	ClassEx4() {
		this.i = 5;
		//Also valid
		//System.out.println("*** Alternative use of 'this' keyword ***");
        //this(5);

	}

	ClassEx4(int i) {
		this.i = i;
	}
}

class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4. A simple class with 2  different constructors ***");
		System.out.println("*** It is also an example of constructor overloading ***");
		ClassEx4 obA = new ClassEx4();
		ClassEx4 obB = new ClassEx4(75);
		System.out.println("obA.i =" + obA.i);
		System.out.println("obB.i =" + obB.i);
	}
}
