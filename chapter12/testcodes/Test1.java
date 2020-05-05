package chapter12.testcodes;

import java.util.ArrayList;
import java.util.List;

class Vehicle1Test {
	@Override
	public String toString() {
		return "Vehicle1Test type.";
	}
}

class Sub1VehicleTest extends Vehicle1Test {
	@Override
	public String toString() {
		return "Sub1VehicleTest type.";
	}
}

class Test1 {
	public static void main(String[] args) {
		System.out.println("***A sample test.An use of List<?>***");
		Vehicle1Test vehicle1 = new Vehicle1Test();
		Vehicle1Test vehicle2 = new Sub1VehicleTest();
		List<Object> vehicles = new ArrayList<Object>();
		vehicles.add(vehicle1);// ok
		vehicles.add(vehicle2);// ok		
		printElements(vehicles);// ok.An example of use List<?> in a method argument
	}
/*
	public static void addElementsVersion1(List<?> mylist) {
		//mylist.add(new Vehicle1Test());// error
		// mylist.add(new Sub1VehicleTest());// error
		mylist.add(null);// ok		
	}

	public static void addElementsVersion2(List<Object> mylist) {
		mylist.add(new Vehicle1Test());// ok
		mylist.add(new Sub1VehicleTest());// ok
		mylist.add(null);// ok
	}
*/
	public static void printElements(List<?> mylist) {
		mylist.forEach(element -> System.out.println(element));
	}
}
