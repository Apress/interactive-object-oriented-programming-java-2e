package java2e.chapter6;

abstract class AbstractClass {	
	protected int myInt = 25;
	public abstract void showMe();
	public void completeMethod1() {
		System.out.println("I am from completeMethod1 in MyAbstractClass and I am complete.");
	}
	public void completeMethod2() {
		System.out.println("I'm the initial version of completeMethod2() in MyAbstractClass.I am complete.");
	}
}

class ConcreteClass extends AbstractClass {
	@Override
	public void showMe() {
		System.out.println("ConcreteClass-showMe().I'm complete.");
		System.out.println("The value of myInt is:" + myInt);
	}
	@Override
	// It wants to override completeMethod1() in MyAbstractClass
	public void completeMethod1() {
		System.out.println("ConcreteClass-completeMethod1().");
	}
}

class Demonstration2 {
	public static void main(String Args[]) {
		System.out.println("***Demonstration-2.Abstract classes can have concrete methods and fields.***\n");
		ConcreteClass concreteOb = new ConcreteClass();
		concreteOb.showMe();
		// It will show that completeMethod1 is redefined in ConcreteClass.
		concreteOb.completeMethod1();
		// It will show the details of completeMethod2 defined in AbstractClass.
		concreteOb.completeMethod2();

		System.out.println("\n**Invoking methods through parent class reference now.**");
		AbstractClass abstractRef = new ConcreteClass();
		abstractRef.showMe();
		abstractRef.completeMethod1();
		abstractRef.completeMethod2();
	}
}
