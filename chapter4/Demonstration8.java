package java2e.chapter4;

class Demo8A {
	public Demo8A(int x) {
		System.out.print(x);
	}
}

class Demo8B extends Demo8A {
	public Demo8B(int a, int b) {
		//Incorrect coding
		 //int c = a + b;//Line-12
		//super(c); //error//Line-13
		// Correct coding
		super(a + b); // Line-15
	}
}

class Demonstration8 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-8.Correct use of Super keyword***\n");
		Demo8B sb = new Demo8B(10, 15);
	}
}
