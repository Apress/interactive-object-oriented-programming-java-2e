package java2e.chapter5;

class Addition {
	int sum(int x, int y) {
		return x + y;
	}

	double sum(double x, double y) {
		return x + y;
	}

	String sum(String s1, String s2) {
		return s1.concat(s2);
	}
	//Error:Duplicate method sum(int,int) in type Addition
	/*double sum(int x, int y) {
		return x + y;
	}*/
}

class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Method overloading example***");
		Addition additionOb = new Addition();
		int sumOfIntergers = additionOb.sum(10, 20);
		System.out.println("10 + 20 is :" + sumOfIntergers);
		double sumOfDoubles = additionOb.sum(10.5, 20.7);
		System.out.println("10.5 + 20.7 is :" + sumOfDoubles);
		String sumOfStrings = additionOb.sum("Smith", "Turner");
		System.out.println("'Smith'+ 'Turner' is :" + sumOfStrings);
	}
}
