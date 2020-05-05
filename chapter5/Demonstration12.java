package java2e.chapter5;

class Vehicle12 {
	public static void showMe() {
		System.out.println("Vehicle.showMe()-inside the parent class.");
	}

	public void showInstanceMethod() {
		System.out.println("Vehicle.showInstanceMethod()");
	}
}

class Bus12 extends Vehicle12 {
	public static void showMe() { // hides Vehicle.showMe()
		System.out.println("Bus.showMe()-inside the child class.");
	}

	public void showInstanceMethod() {// overrides
		System.out.println("Bus.showInstanceMethod()");
	}
}

public class Demonstration12 {

	public static void main(String[] args) {

		System.out.println("***Demonstration-12. Method hiding vs method overriding***\n");
		Vehicle12.showMe();// Vehicle.showMe()-inside the parent class.
		Vehicle12 vehicle = new Bus12();
		// Warning:The following method should be accessed in a static way.
		vehicle.showMe();// Vehicle.showMe()-inside the parent class.
		vehicle.showInstanceMethod();// Bus.showInstanceMethod()

		System.out.println("----------");
		Bus12.showMe();// Bus.showMe()-inside the child class.
		// Warning:The following method should be accessed in a static way.
		Bus12 bus = new Bus12();
		bus.showMe();// Bus.showMe()-inside the child class.
		bus.showInstanceMethod();// Bus.showInstanceMethod()
	}
}
