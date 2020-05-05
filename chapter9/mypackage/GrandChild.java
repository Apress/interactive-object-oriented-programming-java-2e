package java2e.chapter9.mypackage;
//Not supported in Java
/*
* class GrandChild extends Child1,Child2// Error: Not supported in Java {
* public void show() { System.out.println("I am in Grandchild"); } }
*/
public class GrandChild {
	Child1 ch1 ;
	Child2 ch2 ;
	public GrandChild() {
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