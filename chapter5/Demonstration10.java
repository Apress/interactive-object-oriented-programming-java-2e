package java2e.chapter5;
import java.util.Random;

class Vehicle10 {
	public void showMe() {
		System.out.println("Inside Vehicle.showMe()");
	}
}

class Bus10 extends Vehicle10 {
	public void showMe() {
		System.out.println("Inside Bus.showMe()");
	}
}

class Taxi10 extends Vehicle10 {
	public void showMe() {
		System.out.println("Inside Taxi.showMe()");
	}
}

class Demonstration10 {

	public static void main(String[] args) {
		System.out.println("***Demonstration 10.A case study with runtime polymorphism ***\n");
		Vehicle10 obVehicle;
		int count = 0;
		Random random = new Random();
		// Considering 5 choices
		while (count < 5) {
			int tick = random.nextInt(10);//0 to 9
			//System.out.println("tick="+tick);
			if (tick % 2 == 0) {
				obVehicle = new Bus10();

			} else {
				obVehicle = new Taxi10();
			}
			obVehicle.showMe();// Output will be determined at runtime
			count++;
		}
	}

}
