package java2e.chapter12;

class MyNonGenericClass {
	public int showInteger(int i) {
		return i;
	}

	public String showString(String s1) {
		return s1;
	}

	/*
	 * public double showDouble(double d) { return d; }
	 */
}

class Demonstration1 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-1.A non-generic program example***");
		MyNonGenericClass nonGenericOb = new MyNonGenericClass();
		System.out.println("showInteger returns : " + nonGenericOb.showInteger(25));
		System.out.println("showString returns : " + nonGenericOb.showString("A non-generic method is called."));
		//System.out.println("showDouble returns : " + nonGenericOb.showDouble(100.5));
	}
}
