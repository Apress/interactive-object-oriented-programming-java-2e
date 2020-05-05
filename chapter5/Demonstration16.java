package java2e.chapter5;
//Using covariant return types in this demonstration

class ParentCov2 {
	int i;

	ParentCov2 getMultipliedNumber(int x, int y) {
		System.out.println("Inside Parent class.");
		this.i = x * y;
		return this;
	}
}

class ChildCov2 extends ParentCov2 {
	// No compilation error this time
	ChildCov2 getMultipliedNumber(int x, int y) {
		System.out.println("Inside derived class.");
		this.i = x * y * 25;
		return this;
	}
}

public class Demonstration16 {
	public static void main(String args[]) {
		System.out.println("***Demonstration-16.Testing the behavior of the covariant return type***");
		ParentCov2 pOb = new ParentCov2();
		System.out.println("Multiplied result is: " + pOb.getMultipliedNumber(10, 2).i);
		pOb = new ChildCov2();
		System.out.println("Now the multiplied result is:" + pOb.getMultipliedNumber(10, 2).i);
	}
}
