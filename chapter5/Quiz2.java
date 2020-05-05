package java2e.chapter5;

class ParentClassQ2 {
	public void showMe() {
		System.out.println("I am in Parent class.");
	}
}

class ChildClassQ2 extends ParentClassQ2 {
	// Error
	/*
	 * public int showMe() { System.out.println("I am in Child class."); return 5; }
	 */

	// It will work
	public int showMe(int i) {
		System.out.println("I am in Child class.");
		return i;
	}
}

public class Quiz2 {

	public static void main(String[] args) {
		System.out.println("*** Method overriding demonstration.Quiz2.***");
		ChildClassQ2 childOb = new ChildClassQ2();
		childOb.showMe();// I am in Parent class.
		childOb.showMe(5);// I am in Child class.
	}
}
