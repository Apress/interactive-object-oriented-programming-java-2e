package java2e.chapter10;

//incorrect:Compile-time error.
//“No exception of type TestClass can be thrown;an exception type must be a subclass of Throwable.”
//class TestClass{
//correct
class TestClass extends Throwable{
	// some code
}

class Quiz2 {
	void raiseException() {
		System.out.println("I love to throw an exception");

		try {
			throw new TestClass();
		} catch (TestClass e) {
			//some code
		}
	}
}
