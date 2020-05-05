package java2e.chapter6;

abstract class IncompleteClass {
	public abstract void showMe();
}

class CompleteClass extends IncompleteClass {
	//private void showMe() {//Error:Cannot reduce the visibility of the inherited method
	public void showMe() {//ok
		System.out.println("I am complete.");
		System.out.println("I supplied the method body for showMe().");
	}
}

class Quiz2 {
	public static void main(String[] args) {
		System.out.println("***Quiz2 : Experiment with access specifiers***\n");
		IncompleteClass myRef = new CompleteClass();
		myRef.showMe();
	}
}
