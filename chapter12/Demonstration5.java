package java2e.chapter12;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	static int basicVehicleCount;
	// Construct some basic structure of an individual vehicle
	public void constructBody() {
		basicVehicleCount++;
		System.out.println("One basic structure is formed.No of basic structure ="+ basicVehicleCount);
	}
}

class Bus extends Vehicle {
	static int busCount;

	@Override
	public void constructBody() {
		//super.constructBody();
		busCount++;
		System.out.println("Bus completed.It can move on road now. The bus count=" + busCount);
	}
}

class Rocket extends Vehicle {
	static int rocketCount;

	@Override
	public void constructBody() {
		//super.constructBody();
		rocketCount++;
		System.out.println("Rocket constructed.It can move into space now. The rocket count=" + rocketCount);
	}
}

class Demonstration5 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-5.Use of Wildcard types in generic programming.***");
		//One Vehicle object
		Vehicle vehicle1=new Vehicle();
		// Three Bus objects
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		// Two Rocket objects
		Rocket rocket1 = new Rocket();
		Rocket rocket2 = new Rocket();

		// List of anytype of vehicles.Vehicle type or its subtypes can be added.
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		// Adding one vehicle,one bus and one rocket in the list
		vehicles.add(vehicle1);
		vehicles.add(bus1);//ok
		vehicles.add(rocket1);//ok
		constructAllVehicles(vehicles);// ok

		// List of specific vehicles(buses) only
		ArrayList<Bus> buses = new ArrayList<Bus>();
		// Adding three buses in the list
		buses.add(bus1);
		//error: cannot add a rocket to a bus list
		// buses.add(rocket1);
		buses.add(bus2);
		buses.add(bus3);
		// error if you do not use wildcard in the method
		constructAllVehicles(buses);

		// List of specific vehicles(rockets) only
		ArrayList<Rocket> rockets = new ArrayList<Rocket>();
		// Adding two rockets in the list
		rockets.add(rocket1);
		rockets.add(rocket2);
		// error if you do not use wildcard in the method
		constructAllVehicles(rockets);
	}

// Construct all vehicles in the list
	// public static void constructBody(List<Vehicle> vehicleList) {
	public static void constructAllVehicles(List<? extends Vehicle> vehicleList) {
		System.out.println("\nHere is the vehicle list for you : ");
		vehicleList.forEach((vehicle) -> vehicle.constructBody());
	}
}


