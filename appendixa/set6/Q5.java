package java2e.appendixa.set6;

class Q5 {
	public static void main(String[] args) {
		System.out.println("***Set6.Q5***");		
		int x=24;
        int y=11;
        int z=100;
        //int result= ++x * y--;//275
        int result= ++x *--y %z;
        System.out.println(" Result is : "+ result);
        System.out.println(" y now : "+ y);
	}
}
