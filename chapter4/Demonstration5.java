package java2e.chapter4;

class Parent5 {
	private int a;	
	private int b;

	Parent5(int a, int b) {
		System.out.println("I am in parent constructor.");
		System.out.println("Before setting,a="+ this.a);
		System.out.println("Before setting, b="+ this.b);
		System.out.println("Setting the values for instance variables a and b.");
		this.a = a;
		this.b = b;
		System.out.println("Now a="+ this.a);
		System.out.println("Now b="+ this.b);
	}

	void parent5Method() {
		System.out.println("I am a parent method.");
	}
}

class Child5 extends Parent5 {
	private int c;
	Child5(int a, int b, int c) {
		//System.out.println("Before setting,c="+ this.c);//Error:Constructor call must be the first statement in a constructor
		super(a, b);
		System.out.println("I am in child constructor.");
		System.out.println("Before setting,c="+ this.c);
		this.c = c;
		System.out.println("Now c="+ this.c);		
	}

	void child5Method() {
		System.out.println("I am a child method.");
		System.out.println("I am calling the parent method.");
		super.parent5Method();
	}

}

public class Demonstration5 {

	public static void main(String[] args) {
		System.out.println("*** Demonstration-5.The uses of the 'super' keyword Demo***");
		Child5 obB2 = new Child5(1, 2, 3);
		//System.out.println("a in ObB2=" + obB2.a);//Error:a is private
		//System.out.println("b in ObB2=" + obB2.b);//Error:b is private
		//System.out.println("c in ObB2=" + obB2.c);//Error:c is private
		obB2.child5Method();
	}
}
