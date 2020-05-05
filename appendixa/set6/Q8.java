package java2e.appendixa.set6;

class Q8 {

	public static void main(String[] args) {
		System.out.println("***Set6.Q8***");
		System.out.println("***break vs continue***");
		System.out.println("***Example : break***");
		for (int i = 0; i < 5; i++) {
			System.out.print("At entry, i is :" + i + "\t");
			if (i == 3)
				break;
			System.out.println("At Exit, i is :" + i);
		}
		System.out.println();
		System.out.print("***Example : continue***\n");
		for (int i = 0; i < 5; i++) {
			System.out.print("At entry, i is :" + i + "\t");
			if (i == 3)
				continue;
			System.out.println("At Exit, i is :" + i);
		}
	}
}
