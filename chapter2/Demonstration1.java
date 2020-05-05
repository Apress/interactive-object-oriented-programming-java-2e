package java2e.chapter2;

class ClassEx1 {
	// Field initialization is optional.
	// Here myInt is initialized with the value 25.
	public int myInt = 25;
	// In the following case, it will beinitialized with default value 0.
	// public int myInt;
}

class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.A class demo with 2 objects ***");
		ClassEx1 obA = new ClassEx1();
		ClassEx1 obB = new ClassEx1();
		System.out.println("obA.myInt = " + obA.myInt);
		System.out.println("obB.myInt = " + obB.myInt);
		/*ClassEx1 obA = new ClassEx1();
		obA.myInt=25;
		System.out.println("obA.myInt = " + obA.myInt);*/
	}
}
