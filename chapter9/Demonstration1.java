package java2e.chapter9;

//importing the following for updated demonstration
import java2e.chapter9.mypackage.GrandChild;

//Placing this class into a separate package called 'mypackage' for updated demonstration
/*
 class Parent {
	public void show() {
		System.out.println("I am in Parent");
	}
}
*/
//Placing this class into a separate package called 'mypackage' for updated demonstration
/*
 class Child1 extends Parent {
	@Override
	public void show() {
		System.out.println("I am in Child1");
	}
}
*/
//Placing this class into a separate package called 'mypackage' for updated demonstration
/*
 class Child2 extends Parent {
 	@Override
	public void show() {
		System.out.println("I am in Child2");
	}
}
*/

//Not supported in Java

 /* 
  // Error: Not supported in Java
 class GrandChild extends Child1,Child2 {
 	public void show() { System.out.println("I am in Grandchild"); }
  }
  */
 /* Making this class public and placing it  into mypackage
class GrandChild {
	Child1 ch1 ;
	Child2 ch2 ;
	GrandChild() {
		ch1 = new Child1();
		ch2 = new Child2();
	}

	public void showFromChild1() {
		ch1.show();
	}

	public void showFromChild2() {
		ch2.show();
	}
}
*/

class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.The concept of aggregation/composition to handle the diamond Problem***\n");
		//Child1 child1=new Child1();//Error: not visible to client for updated demonstration(i.e. when you put non-public Child1.java inside mypackage)
		//Child2 child1=new Child2();//Error: not visible to client for updated demonstration(i.e. when you put non-public Child2.java inside mypackage)
		GrandChild gChild = new GrandChild();
		gChild.showFromChild1();
		gChild.showFromChild2();
	}
}
