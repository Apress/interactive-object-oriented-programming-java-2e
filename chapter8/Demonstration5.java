package java2e.chapter8;

class StaticDemo5 {
	static void showMe() {
		System.out.println("Inside showMe().");
	}
	static void showMe(String s) {
		System.out.println("Hi ," + s +".You are inside showMe(String s) now.");
	}
	static void showMe(int i) {
		System.out.println("Inside showMe(int i),you have supplied the argument " + i +".");
	}
}

class Demonstration5 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-5.Static methods can be overloaded***\n");
		StaticDemo5.showMe();
		StaticDemo5.showMe("John");
		StaticDemo5.showMe(25);
	}

}
