package java2e.chapter4;

class Parent7 {
	public void showMe() {
		System.out.println("At present,I am inside the parent method.");
	}
}

class Child7 extends Parent7 {
	public void showMe() {
		System.out.println("I am inside the child method.");
		//System.out.println("Invoking the parent method now.");
		//super.showMe();
	}
}

public class Demonstration7 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-7.Testing the use of super keyword.***");
		Child7 obChild = new Child7();
		obChild.showMe();		
		//Parent7 obParent = new Parent7();
		//obParent.showMe();//Now Parent class method will be invoked.
		//obParent=new Child7();
		//obParent.showMe();//Now Child class method will be invoked.
	}
}
