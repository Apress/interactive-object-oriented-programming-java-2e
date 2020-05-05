package java2e.appendixa.set2;

class Q2 {

	public static void main(String[] args) {
        System.out.println("***Set2.Q2***"); 
        int a=5;//ok
        int b=07;//ok
        //int c=09;//Error
        int d=010;//8 in octal 
        System.out.println("a="+a );
        System.out.println("b="+b);
       //System.out.println("c="+c);
        System.out.println("d="+d);//Will print 8
	}
}
