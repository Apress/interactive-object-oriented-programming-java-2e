package java2e.chapter15;

import java.util.Random;

//BasicCar class
abstract class BasicCar implements Cloneable {
	public String modelName;
	public int basePrice, onRoadPrice;

	public String getModelname() {
		return modelName;
	}

	public void setModelname(String modelname) {
		this.modelName = modelname;
	}

	public static int setAdditionalPrice() {
		int price = 0;
		Random r = new Random();
		// We will get an integer value in the range 0(inclusive) to 100000(exclusive)
		int p = r.nextInt(100000);
		price = p;
		return price;
	}

	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar) super.clone();
	}
}

//Nano class
class Nano extends BasicCar {
	public Nano(String m) {
		modelName = m;
		// Basic price for Nano
		basePrice = 200000;
	}

	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (Nano) super.clone();	
	}
}

//Ford class
class Ford extends BasicCar {
	public Ford(String m) {
		modelName = m;
		// Basic price for Ford.
		basePrice = 500000;
	}

	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (Ford) super.clone();
	}
}

class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("***Prototype Pattern Demo***\n");
		BasicCar nano = new Nano("Nano XT");		
		BasicCar ford = new Ford("Ford Figo");
		BasicCar nanoClone,fordClone;
		// Making a copy of a Nano object
		nanoClone= nano.clone();
		System.out.println("Nano's base price is: Rs."+nanoClone.basePrice);
		//Making the change on the copied object.
		// Price will be more than 200000
		nanoClone.onRoadPrice = nanoClone.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("In India, the final price of a " + nanoClone.modelName + " is Rs." + nanoClone.onRoadPrice);

		// Making a copy of a Ford object
		fordClone = ford.clone();
		System.out.println("Ford's base price is: Rs."+fordClone.basePrice);
		//Making the change on the copied object.
		// Price will be more than 500000		
		fordClone.onRoadPrice = fordClone.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("In India, the final price of a " + fordClone.modelName + " is Rs." + fordClone.onRoadPrice);
	}
}
