package java2e.chapter10;

class TestClassException extends Throwable {
	String str;

	TestClassException(String str) {
		this.str = str;
	}

	public String getMessage() {
		return str;
	}
}

class DemoClass7 {
	// Incorrect.It will raise compilation error
	 //void raiseException() {
	void raiseException() throws TestClassException,ArrayIndexOutOfBoundsException {
		throw new TestClassException("A TestClassException is raised");
	}
}

class Demonstration7 {
	public static void main(String[] args) {

		// public static void main(String[] args) throws TestClassException {
		System.out.println("***Demonstration-7.The use of throws keyword***\n");
		DemoClass7 demo = new DemoClass7();
		// demo.raiseException();//If you use this line without try-catch, add the
		// exception in throws list

		try {
			demo.raiseException();
		} catch (TestClassException e) {
			System.out.println(e.getMessage());// A TestClassException is raised
			System.out.println("Here is the stacktrace:");
			e.printStackTrace();
		}

	}

}
