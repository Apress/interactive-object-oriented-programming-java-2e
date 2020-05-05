package java2e.appendixa.set4;

class Q2 {

	public static void main(String[] args) {
		System.out.println("***Set4.Q2***");
		int i = 5;
		int j = i++;// j becomes 5, i becomes 6
		System.out.println("Now j=" + j);
		System.out.println("Now i=" + i);
		int k = ++j;// j and k both becomes 6
		System.out.println("Here j=" + j);
		System.out.println("Here k=" + k);
	}
}
