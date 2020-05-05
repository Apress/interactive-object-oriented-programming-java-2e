package java2e.chapter10;

class DemoClass {
	void thowingException() {
		System.out.println("I always throw a NullPointerException");
		throw new NullPointerException("Forcefully throwing a NullPointerException");
		System.out.println("I'll never print this line");
	}
}

class Demonstration5 {

	public static void main(String[] args) {
		System.out.println("***Demonstration5.The use of 'throw' keyword***\n");
		DemoClass demo = new DemoClass();
		try {
			demo.thowingException();
		} catch (Exception e) {
			System.out.println(e.getMessage());// Forcefully throwing a NullPointerException
			e.printStackTrace();
		}
	}
}
