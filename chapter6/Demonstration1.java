package java2e.chapter6;

abstract class MyAbstractClass {
	public abstract void showMe();
}

class MyConcreteClass extends MyAbstractClass {
	@Override
	public void showMe() {
		System.out.println("MyConcreteClass.showMe()");
		System.out.println("I am supplying the method body for showMe()");
	}
}

class Demonstration1 {
	public static void main(String Args[]) {
		System.out.println("***Demonstration-1.Abstract class example.***\n");
		// Error:Cannot instantiate the type MyAbstractClass
		//MyAbstractClass abstractOb=new MyAbstractClass();
		MyConcreteClass concreteOb = new MyConcreteClass();
		concreteOb.showMe();
	}
}
