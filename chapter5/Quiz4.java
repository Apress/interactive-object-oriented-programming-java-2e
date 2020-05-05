package java2e.chapter5;

class QuizOnFinal {
	public void testMe() {
		System.out.println("I am in parent class");
	}
}

class Q4Child1 extends QuizOnFinal {
	@Override
	final public void testMe() {
		System.out.println("I am in child-1");
	}
}

class Q4Child2 extends QuizOnFinal {
	@Override
	public void testMe() {
		System.out.println("I am in child-2");
	}
}

class Quiz4 {
	public static void main(String[] args) {
		System.out.println("***Quiz on final keyword usage***\n");
		Q4Child2 obClass2 = new Q4Child2();
		obClass2.testMe();
	}
}
