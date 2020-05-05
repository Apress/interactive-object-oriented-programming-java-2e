package java2e.chapter5;

class Class5 {
	public void myMethod(int... a) {
		System.out.println("Inside myMethod(int... a)");
	}

	public void myMethod(int a, int b) {
		System.out.println("Inside myMethod(int a, int b)");
	}

	/*
	  public void myMethod(boolean... b) {
	 System.out.println("Inside myMethod(boolean... a)"); 
	 }
	 */
	 
}
class Demonstration5 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-5.Testing Method overloading.***");
		Class5 ob5 = new Class5();
		ob5.myMethod(1);
		ob5.myMethod(1, 2);
		ob5.myMethod();
	}
}
