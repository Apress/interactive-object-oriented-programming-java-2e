package java2e.chapter5;

//Without using covariant return type

class ParentCov {
	int i;

	int getMultipliedNumber(int x) {
		System.out.println("Inside Parent.");
		this.i = x;
		return i * 10;
	}
}

class ChildCov extends ParentCov {
	int getMultipliedNumber(int x) {
		// error:Return type is incompatible
		//double getMultipliedNumber(int x ){
		System.out.println("Inside Child.");
		this.i = x;
		return i * 50;
	}

}

public class Demonstration15 {
	public static void main(String args[]) {
		System.out.println("***Demonstration-15.Covariant return type is NOT used here***\n");
		System.out.println("***Only primitive(int) datetype is used in this example.***");
		ParentCov pOb = new ParentCov();
		int result = pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result=" + result);

		pOb = new ChildCov();
		result = pOb.getMultipliedNumber(10);
		System.out.println("Multiplied result=" + result);
	}
}
