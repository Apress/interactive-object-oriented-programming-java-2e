package java2e.chapter12;

import java.util.List;

//Erroneous code segment-2
//class CustomException<T> extends Throwable{  }

//Erroneous code segment-3
class OverloadRestriction {
//public void printMe(List<Integer> intList) {{//Some code  }
//public void printMe(List<String> strList) {{//Some code  }    
}

//Erroneous code segment-4
class MyDevice<T> {
	//private static T operatingSystem;// 4.1 Compile-time error
	// 4.2 Compile-time error
	/*
	 * public static T getOperatingSystem() { // some code }
	 */
}

//Erroneous code segment-5
class GenericClass<T> {
	T genericObject;

	GenericClass() {
		// 5.Compile-time error
		// genericObject = new T();
	}
}

class Restrictions {

	public static void main(String[] args) {
		System.out.println("***Special Demonstration - Important Restrictions in Generic Programming.***");
		// Erroneous code segment-1
		// MyGenericClass<int> myGenericClassIntOb2 = new MyGenericClass<int>();

	}

}
