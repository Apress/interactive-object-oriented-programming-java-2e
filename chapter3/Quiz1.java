package java2e.chapter3;

class Test1 {
	int a;
	// Initialization block-1
	{
		System.out.println("Initialization block-1 is executed.");
		a = 1;
	}

	// Constructor
	Test1() {
		System.out.println("Constructor is executed.");
		a = 2;
	}

	// Initialization block-2
	{
		System.out.println("Initialization block-2 is executed.");
		a = 3;
	}
}

class Quiz1 {
	public static void main(String[] args) {
		System.out.println("***Quiz1.Execution order of Initialization block and Constructor***");
		System.out.println("The new Test1().a=" + new Test1().a);
	}
}
