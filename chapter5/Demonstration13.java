package java2e.chapter5;

class ParentOverloadedClass {
	public void showMe() {
		System.out.println("I am in Parent class");
	}

	public void showMe(int x) {
		System.out.println("Overloaded method in Parent.Here x= " + x);
	}
}

class ChildOverridingClass extends ParentOverloadedClass {
	public void showMe() {
		System.out.println("Overriding method in Child class.");
	}
}

class Demonstration13 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-13.Method Overriding with overloading Demo***\n");
		ChildOverridingClass childObject = new ChildOverridingClass();
		childObject.showMe();//Will call the overriding method from derived class.
		childObject.showMe(25);//Will call the overloaded method from parent class.
	}
}
