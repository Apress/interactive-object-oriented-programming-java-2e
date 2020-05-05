package chapter5.testcodes;


  //Case-1 
 class Test5 { public static final void main(String[] args) {
 System.out.println(" Making main() method final."); }
 }
 

/*
//Case-2

class Test5A {
	public static final void main(String[] args) {
		System.out.println("In Parent-Test5A.Making main() method final...");
	}
}

class Test5 extends Test5A {
	public static final void main(String[] args) {//error: cannot override the final method from Test5A
		System.out.println(" In Child-Test5.Making main() method final...");
	}
}
*/