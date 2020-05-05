package java2e.chapter3;

class Demonstration7 {

	public static void main(String[] args) {
		System.out.println("***Demonstration7.Exploring Wrapper classes.***\n");
		int myInt1 = 1;
		// Coverting primitive int to Integer object
		Integer intOb = new Integer(myInt1);
		// Converting back from Integer Object to primitive int
		int myInt2 = intOb.intValue();
		System.out.println("The myInt2=" + myInt2);
		
		long myLong1 = 1234567890123L;
		// Coverting primitive long to Long object
		Long longOb = new Long(myLong1);
		// Converting back from Long Object to primitive long
		long myLong2 = longOb.longValue();
		System.out.println("The long2=" + myLong2);

		// Coverting primitive int to String object
		String myString1 = Integer.toString(myInt1);
		System.out.println("The myString=" + myString1);

		String myString2 = "5.7";
		// Converting a String object to primitive type
		Double doubleOb = Double.valueOf(myString2);
		double myDouble = doubleOb.doubleValue();
		System.out.println("The myDouble=" + myDouble);
		
		//Converting numeric String to primitive int
		int myInt3=Integer.parseInt("125");
		System.out.println("The myInt3=" + myInt3);
		//Following line of code will cause runtime error (NumberFormatException)
		//because you cannot convert "Hello" to an int
		//int myInt4=Integer.parseInt("Hello");
		//System.out.println("The myInt4=" + myInt4);			
	}
}
