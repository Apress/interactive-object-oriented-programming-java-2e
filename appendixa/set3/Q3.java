package java2e.appendixa.set3;

class Q3 {
	public static void main(String[] args) {
		System.out.println("***Set3.Q3***");
        byte b1=127;
        int i1=b1;//ok: small to big
       //b1=i1;//Error: big to small
        System.out.println("b1="+b1);
        System.out.println("i1="+i1);
	}
}
