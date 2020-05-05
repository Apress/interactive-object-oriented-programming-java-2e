package java2e.chapter3;

class Sample4 {
	int a, b, c;
	// Initialization block-1
	{
		System.out.println("Initialization block-1 is executed.Setting a=1.");
		a = 1;
	}
	// Initialization block-2
	{
		System.out.println("Initialization block-2 is executed.Setting b=2;");
		b = 2;
	}

	// Constructor
	Sample4() {
		System.out.println("User-defined parameterless constructor is executed.Setting c=3.");
		c = 3;
	}
	
	// Initialization block-3
	//{
	//	System.out.println("Initialization block-3 is executed.");		
	//}
}

class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4.Use of instance Initialization blocks.***\n");
		Sample4 sample4Object = new Sample4();
		System.out.println("The sample4Object.a=" + sample4Object.a);// 1
		System.out.println("The sample4Object.b=" + sample4Object.b);// 2
		System.out.println("The sample4Object.c=" + sample4Object.c);// 3
	}

}
