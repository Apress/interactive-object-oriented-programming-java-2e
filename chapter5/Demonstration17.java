package java2e.chapter5;

class Demo17 {
	int x;

	private Demo17() {
		System.out.println("Called the private constructor.");
		System.out.println("Setting the default the value x=10.");
		this.x=10;//A default value
		System.out.println("\tExit-private non-parameterized constructor.");	
	}
	public Demo17(int x) {
		this();
		System.out.println("Updating the default value of x.");
		this.x=x;
		System.out.println("\tExit-parameterised constructor.");		
	}
}

final class Demo17Final {
	// some code..
}

class Child17 extends Demo17 {
	int y;

	public Child17(int x, int y) {
		super(x);
		this.y = y;
	}
}
//Error:The type Child2 cannot cannot subclass the final class Demo17Final
//class Child2 extends Demo17Final { }

class Demonstration17 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-17.A comparison study:Using a final class vs using a private constructor***");
		Demo17 parent = new Demo17(15);
		System.out.println("\tThe parent.x=" + parent.x);
		Child17 child = new Child17(2, 3);
		System.out.println("\tThe child.x=" + child.x);
		System.out.println("\tThe child.y=" + child.y);
	}
}
