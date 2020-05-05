package java2e.chapter12;
//class MyGenericClass<T>  is defined in Demonstration2

//Compile-time error
//class SubClass<V> extends MyGenericClass<T> { 
//The following declaration is fine
class SubClass<T> extends MyGenericClass<T> { 
	//Some code	
}

	/*
//For modified program
class SubClass<T,V> extends MyGenericClass<T> { 
	//Subclass specific method
	public V subMethod(V value) {
		return value;
	}	
}
*/

class Demonstration11 {

	public static void main(String[] args) {
		//System.out.println("***Demonstration-11.Inheritance in Generic Programming.***");
		System.out.println("***Demonstration-11 Modified.Inheritance in Generic Programming.***");
		SubClass<Integer>  subInt = new SubClass<Integer>();
		System.out.println("The method show returns the interger value : " + subInt.show(200));
		//For modified program
		//SubClass<Integer, String>  subInt = new SubClass<Integer,String>();
		//System.out.println("The method show returns the interger value : " + subInt.show(200));
		//System.out.println("The subMethod returns : " + subInt.subMethod("It is ok!"));
	}
}
