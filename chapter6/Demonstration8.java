package java2e.chapter6;

interface AnnotationDemo {
	/**
	 * @deprecated Please use the newMethod() instead of the oldMethod.
	 */
	@Deprecated
	void oldMethod();
	void newMethod();
}

class MyClass8 implements AnnotationDemo {

	@Override
	public void oldMethod() {
		System.out.println("The oldMethod() is in action.");
	}

	@Override
	public void newMethod() {
		System.out.println("The recommendation is to use this updated method-newMethod().");
	}
}

class Demonstration8 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-8.Annotation Demo***\n");
		MyClass8 myClass8Object=new MyClass8();
		myClass8Object.oldMethod();
		myClass8Object.newMethod();
	}
}
