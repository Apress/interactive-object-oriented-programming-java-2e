package java2e.chapter14;
interface MyInterface{
	void commonInterfaceMethod();
	default void defaultInterfaceMethod1() {
		System.out.println("**Default non-static method1()**");
		//Doing the common task using the private interface method
		privateInterfaceMethod();
	}
	default void defaultInterfaceMethod2() {
		System.out.println("**Default non-static method2()**");
		//Doing the common task using the private interface method
		privateInterfaceMethod();
	}
	private void privateInterfaceMethod()	{
		System.out.println("**Private non-static method in MyInterface**");
		System.out.println("**I can do the common tasks of multiple default methods.**");
	}
	/* 
	//For "Points to Remember " section
	
	private static void privateStaticInterfaceMethod2() {
		System.out.println("**Private static method2 in MyInterface**");
		//Compile-time error
		//privateInterfaceMethod();
		//NO Compile-time error
		publicStaticInterfaceMethod();		
		}
	public static void publicStaticInterfaceMethod() {
		System.out.println("**Public static method in MyInterface**");
     		System.out.println("**Invoking the private static method in MyInterface now.**");                
	}
	*/

	
}

class MyInterfaceImplementor implements MyInterface{
	@Override
	public void commonInterfaceMethod() {
		System.out.println("**Implementing the commonInterfaceMethod().**");		
	}	
}
class PrivateInterfaceMethodFromJava9 {
	public static void main(String[] args) {
		System.out.println("***Demonstration 3.Private Interface Method From Java 9.***\n");
		MyInterface interOb=new MyInterfaceImplementor();
		interOb.commonInterfaceMethod();
		interOb.defaultInterfaceMethod1();
		interOb.defaultInterfaceMethod2();
		
		//For "Points to Remember " section
		//MyInterface.publicStaticInterfaceMethod();
	}
}
