package java2e.chapter5;

class Vehicle {
	public void showMe() {
		System.out.println("Inside Vehicle.showMe()");
	}
}

class Bus extends Vehicle {
	public void showMe() {
		System.out.println("Inside Bus.showMe()");
	}

	public void busSpecificMethod() {
		System.out.println("Inside Bus.busSpecificMethod()");
	}
}

class Demonstration8 {

	public static void main(String[] args) {
		System.out.println("***Demonstartion 8.Experimenting runtime polymorphism.***\n");
		//Parent class reference is pointing to a child object
		Vehicle obVehicle = new Bus();// ok
		//Bus obBus = new Vehicle();//Compilation Error
		
		obVehicle.showMe();//Output: Inside Bus.showMe()
		
		// obVehicle.busSpecificMethod();//Error
		//((Bus) obVehicle).busSpecificMethod();// Ok
		
		//Downcasting
		//Bus obBus = (Bus) new Vehicle();//No compilation error but run-time error		
	}
}
