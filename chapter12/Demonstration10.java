package java2e.chapter12;

//class MyGenericClass<T>  is defined in Demonstration2
class Demonstration10 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-10.Case study with raw types.***");
		// Creating a MyGenericClass<Double> type object.
		MyGenericClass<Double> doubleOb = new MyGenericClass<Double>();
		double d1 = doubleOb.show(100.5);
		System.out.println("The method show returns the double value : " + d1);
		
		// Creating a raw type of MyGenericClass<T>
		MyGenericClass rawOb = new MyGenericClass();
		
		// To support backward compatibility, you can assign a parameterized type to a  raw type
		//rawOb = doubleOb;// Ok
		// But if you assign a raw type to a parameterized type, there is a warning message.
		doubleOb = rawOb;// Warning message
		double d2 = (double) rawOb.show(200.5);// type casting is required
		System.out.println("The value in d2 is: " + d2);
		// No compile-time error but it'll cause runtime error
		//int i3 = (int) rawOb.show(200.5);
		//System.out.println("The value in i3 is: " + i3);	
		/*
		//JDK7 onwards:You can use a short syntax(diamond operator)
		MyGenericClass<Double> doubleOb2 = new MyGenericClass<>();
		doubleOb=doubleOb2;//No warning message
		*/
	}
}
