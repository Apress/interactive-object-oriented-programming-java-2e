package java2e.chapter2;

class ClassEx5 {
	public int sum(int x, int y) {
		return x + y;
	}
}

class Demonstration5 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-5. A simple class with a method returning an integer ***\n");
		ClassEx5 ob = new ClassEx5();
		int result = ob.sum(57, 63);
		System.out.println("Sum of 57 and 63 is : " + result);
		
	}
}
