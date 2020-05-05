package java2e.chapter12;

//A generic class 
//T is a type parameter.It will be replaced by the real  type when you initialize the actual object. 
class GenericDemo7Class<T extends Number> {
	//class GenericDemo7Class<T> {
	T firstNumber, secondNumber;

	GenericDemo7Class(T firstNumber, T secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	// Always returning a double value
	public double displaySum() {
		//using the library method doubleValue()
		return firstNumber.doubleValue() + secondNumber.doubleValue();		
	}
}

class Demonstration7 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-7.A typical use of bounded type parameter.***\n");
		GenericDemo7Class<Double> doubleOb = new GenericDemo7Class<Double>(2.5, 5.7);
		System.out.println("2.5+5.7=" + doubleOb.displaySum());

		GenericDemo7Class<Integer> intOb = new GenericDemo7Class<Integer>(2, 7);
		System.out.println("2+7=" + intOb.displaySum());

		//GenericDemo7Class<String> stringOb=new GenericDemo7Class<String>("hello","world!");
		// Bound mismatch error if you use class GenericDemo7Class<T extends Number>
		//System.out.println( "2+7=" +stringOb.displaySum());
	}
	}
