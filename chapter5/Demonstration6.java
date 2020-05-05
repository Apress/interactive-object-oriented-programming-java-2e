package java2e.chapter5;

class ParentClass {
	// Overridden method
	public void showMe() {
		System.out.println("Inside ParentClass.showMe()");
	}

	public void doNotChangeMe() {
		System.out.println("Inside ParentClass.doNotChangeMe().");
	}
}

class ChildClass extends ParentClass {
	// Overriding method
	public void showMe() {
		System.out.println("Inside ChildClass.showMe().");
	}
	/*
	//Error: Cannot reduce the visibility of the inherited method from ParentClass
	protected void showMe() {
		System.out.println("Inside ChildClass.showMe().");
	}
	*/
}

class Demonstration6 {
	public static void main(String[] args) {
		System.out.println("*** Demonstration-6.Method overriding demonstration.***");
		ChildClass childOb = new ChildClass();
		childOb.doNotChangeMe();
		childOb.showMe();//Will display the overridden method
	}
}
