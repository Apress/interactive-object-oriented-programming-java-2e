package java2e.chapter5;

class Demonstration4 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-4.Testing overloaded main() methods.***");
		System.out.println("Inside standard main-main(String[] args).");
		//main("hello");
		//main(5,"hello");
	}

	public static void main(String arg1) {
		System.out.println("Overloaded main() with one string parameter is called.");
	}

	public static void main(int arg1, String arg2) {
		System.out.println("Overloaded main() with one integer and one string parameter is called.");
	}
}
