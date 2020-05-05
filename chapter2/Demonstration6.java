package java2e.chapter2;

class ClassEx6 {
	// The following method supports variable length arguments
	public int sum(int... vararg) {
		System.out.println("You have passed " + vararg.length + " arguments now.");
		//System.out.println(String.format("%s, you have passed %d arguments now.","Dear reader",vararg.length));
		int total = 0;
		for (int i : vararg) {
			total = total + i;
		}
		return total;
	}
}

class Demonstration6 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-6.Methods with variable-length argument demo ***\n");
		ClassEx6 ob = new ClassEx6();
		int resultOfSummation = ob.sum(57, 63);
		System.out.println("Sum of 57 and 63 is : " + resultOfSummation);
		resultOfSummation = ob.sum(57, 63, 50);
		System.out.println("Sum of 57, 63 and 70 is : " + resultOfSummation);
		resultOfSummation = ob.sum(57, 63, 50, 70);
		System.out.println("Sum of 57, 63, 50 and 70 is : " + resultOfSummation);

	}

}
