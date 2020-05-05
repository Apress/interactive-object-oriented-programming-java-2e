package java2e.chapter10;

class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Exploring Exceptions.***");
		int a = 100, b = 2, result;
		b -= 2;//b beomes 0
		result = a / b;
		System.out.println("The result of a/b is :" + result);
	}
}
