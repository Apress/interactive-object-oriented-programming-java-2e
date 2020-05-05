package chapter5.testcodes;
/*//Case-1
final class ParentClassTest4
{
    public void showMe(){
    	System.out.println("Inside Parent.showMe()");
    }
}
class ChildClassTest4 extends ParentClassTest4 //Error
{
    //Some code
}*/

/*//Case-2
class ParentClassTest4 {
	final public void showMe() {
		System.out.println("Inside Parent.showMe()");
	}
}

class ChildClassTest4 extends ParentClassTest4 {
	public void showMe() { // error
		System.out.println("Inside Parent.showMe()");
	}
}*/

//Case-3
class ParentClassTest4 {
	final int a = 10;
	final double PI = 3.14;// ok
	// final double PI;//error
}

class ChildClassTest4 extends ParentClassTest4 {
	int a = 20;

}

//Case-4:Blank final variables
class FinalDemo {
	// Must be initialized inside a constructor
	final double PI;
	double area;

	// final double PI=3.14;
	FinalDemo() {
		PI = 3.14;
	}
}

public class Test4 {

	public static void main(String[] args) {
		System.out.println("***Testing the use of final keyword ***\n");
		/*
		 * ParentClassTest4 parent=new ParentClassTest4();
		 * System.out.println(parent.a);//10 parent=new ChildClassTest4();
		 * System.out.println(parent.a);//10
		 */
	}

}
