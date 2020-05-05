package java2e.appendixa.set8;

class Q2 {

	public static void main(String[] args) {
		System.out.println("***Set8.Q2***");
		System.out.println("***Discussions on Switch ***");
		int myNumber = 6;
		switch (myNumber) {
		case 1:case 5:
			System.out.println("One or Five");
			break;
		default:
			System.out.println("Default");
			break;
		case 2:case 6:case 8:
			System.out.println("Two or Six or Eight");
			break;
		}
	}
}
