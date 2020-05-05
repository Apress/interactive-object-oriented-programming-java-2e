package java2e.chapter10;

import java.util.Random;

class OuterQuiz3Exception extends Exception {
	String str = null;

	OuterQuiz3Exception(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}

}

class InnerQuiz3Exception extends OuterQuiz3Exception {
	InnerQuiz3Exception(String str) {
		super(str);
	}

	public String toString() {
		return str;
	}

}

class Quiz3Class {
	// InnerQuiz3Exception is not needed to include in the throws list because it is
	// a subclass of OuterQuiz3Exception
	void raiseException() throws OuterQuiz3Exception { // throws clause is necessary now
		OuterQuiz3Exception outer = new OuterQuiz3Exception("An OuterQuiz3Exception is raised.");
		InnerQuiz3Exception inner = new InnerQuiz3Exception("An InnerQuiz3Exception is raised.");
		Random randomGenerator = new Random();
		// Will generate 0 to 1.
		int b = randomGenerator.nextInt(2);
		if (b == 0) {
			throw outer;
		} else
			throw inner;
	}
}

class Quiz3 {

	public static void main(String[] args) throws OuterQuiz3Exception {
		System.out.println("***Quiz3***\n");
		Quiz3Class demo = new Quiz3Class();
		try {
			demo.raiseException();
		} catch (OuterQuiz3Exception e) {
			System.out.println(e);
			System.out.println("Here is the stack trace :");
			e.printStackTrace();
		}
	}
}
