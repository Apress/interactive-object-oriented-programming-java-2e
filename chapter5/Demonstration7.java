package java2e.chapter5;

class ParentClass7 {
	public int showMe(int i) {
		System.out.println("I am in Parent class.");
		return i;
	}
}

class ChildClass7 extends ParentClass {
	public int showMe(int i) {
		System.out.println("In Child.showMe(int i)");
		System.out.println("I am overriding the parent method and adding 5 to the argument.");
		return i + 5;// Must return an int
	}

	public void showMe() {
		System.out.println("In Child.showMe().I am overloaded here.");
	}
}

class Demonstration7 {

	public static void main(String[] args) {
		System.out.println("*** Demonstration-7.Overloading with Overriding Demo***\n");
		ChildClass7 childOb = new ChildClass7();
		int value = childOb.showMe(5);
		System.out.println("The value returned is : " + value);// 5+5=10
		childOb.showMe();
	}
}
