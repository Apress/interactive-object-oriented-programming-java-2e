package java2e.chapter12;

//A generic class
//T is a type parameter.It will be replaced by the real type when you initialize the actual object.
class MyGenericClass<T> {
	// A generic method
	// The following method's return type is T.It also accepts a T type argument.
	public T show(T value) {
		return value;
	}
}

public class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.A generic program example***");
		// Creating a MyGenericClass<Integer> type object.		
		MyGenericClass<Integer> myGenericClassIntOb = new MyGenericClass<Integer>();
		System.out.println("The method show returns the integer value : " + myGenericClassIntOb.show(100));
		// Creating a MyGenericClass<String> type object.
		MyGenericClass<String> myGenericClassStringOb = new MyGenericClass<String>();
		System.out.println("The method show returns the string value : "
				+ myGenericClassStringOb.show("A generic method is called."));
		// Creating a MyGenericClass<Double> type object.
		MyGenericClass<Double> myGenericClassDoubleOb = new MyGenericClass<Double>();
		System.out.println("The method show returns the double value : " + myGenericClassDoubleOb.show(100.5));
		//Type checking
		//myGenericClassIntOb.show(125.7);//Error
		//System.out.println(myGenericClassIntOb.show(new Integer(100)));//Also ok but no additional benefit
		//Primitive types are NOT allowed here.It must be a reference type.
		//MyGenericClass<int> myGenericClassIntOb2 = new MyGenericClass<int>();
	}
}
