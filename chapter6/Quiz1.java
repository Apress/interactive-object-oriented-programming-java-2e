package java2e.chapter6;

abstract class AbstractClassQuiz1 {
	public void completeMethod1() {
		System.out.println("completeMethod-1");
	}
	public void completeMethod2() {
		System.out.println("completeMethod-2.");
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("***Quiz1.A case study with an abstract class with no abstract method in it.***");
		//AbstractClassQuiz1 absRef = new AbstractClassQuiz1 ();//Error:Cannot instantiate the type AbstractClassQuiz1

	}

}
