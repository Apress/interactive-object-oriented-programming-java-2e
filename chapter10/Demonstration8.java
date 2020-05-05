package java2e.chapter10;

//The class derives from RuntimeException
class TestClass8Exception extends RuntimeException {
	String str;

	TestClass8Exception(String str) {
		this.str = str;
	}

	public String getMessage() {
		return str;
	}
}

class DemoClass8 {
	// This time it will NOT raise compilation error
	void raiseException() {
	throw new TestClass8Exception("A TestClass8Exception is raised");
	}
}

class Demonstration8 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-8.The use of  an unchecked exception***\n");
		DemoClass8 demo = new DemoClass8();
		try {
			demo.raiseException();
		} catch (TestClass8Exception e) {
			System.out.println(e.getMessage());// A TestClassException is raised
			System.out.println("Here is the stacktrace:");
			e.printStackTrace();
		}
	}
}

