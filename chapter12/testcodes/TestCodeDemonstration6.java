package chapter12.testcodes;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	// Construct some basic structure of an individual vehicle
	public void constructBody() {
		System.out.println("One basic structure is formed.");
	}
}

class Bus extends Vehicle {
	static int busCount;

	@Override
	public void constructBody() {
		busCount++;
		System.out.println("Bus completed.It can move on road now. The bus count=" + busCount);
	}
}

class Rocket extends Vehicle {
	static int rocketCount;

	@Override
	public void constructBody() {
		rocketCount++;
		System.out.println("Rocket constructed.It can move into space now. The rocket count=" + rocketCount);
	}
}

public class TestCodeDemonstration6 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Use of lower bound wildcard types in generic programming.***");
		// Two Vehicle objects
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		// Two Bus objects
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		// Two Rocket objects
		Rocket rocket1 = new Rocket();
		Rocket rocket2 = new Rocket();

		// List of vehicles
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		// Adding two vehicles in the list
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		// Adding two buses in the list
		vehicles.add(bus1);
		vehicles.add(bus2);
		constructAllVehicles(vehicles);// ok

		// List of rockets
		ArrayList<Rocket> rockets = new ArrayList<Rocket>();
		// Adding two rockets in the list
		rockets.add(rocket1);
		rockets.add(rocket2);
		//constructAllVehicles(rockets);// Error: Not applicable for ArrayList<Rocket> when you use the lower bound
										// wildcard
	}

	// Construct all vehicles in the list //The use of a lowerbound wildcard
	public static void constructAllVehicles(List<? super Bus> vehicleList) {
	  System.out.println("\nHere is the vehicle list for you : ");
	  //Compile-time error:Add cast to vehicle
	  //vehicleList.forEach((vehicle) -> vehicle.constructBody());
	  /*
		//Runtime error:Vehicle cannot be cast to Bus
	     vehicleList.forEach((vehicle) -> ((Bus) vehicle).constructBody());
	  */
	 vehicleList.forEach((bus) -> ((Vehicle) bus).constructBody());//Ok 
	  }
	 
	//The use of an unbounded wildcard
		 // public static void constructAllVehicles(List<?> vehicleList) {
			//System.out.println("\nHere is the vehicle list for you : ");			
			//vehicleList.forEach((anyVehicle) -> ((Vehicle) anyVehicle).constructBody());//Ok
		//}
}
