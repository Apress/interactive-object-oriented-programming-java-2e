package java2e.chapter8;

class Parent
{
	int intInstanceParent;
	static int intStaticParent, count;
	static void testMethod() {
		count++;
		System.out.println("Inside static testMethod(), count ="+ count);		
	}
	
	//The static block
	static {
		System.out.println("Inside static block of Parent");
		//intInstanceParent=10;//error
		intStaticParent=10;//ok
		testMethod();//ok
		//System.out.println("intInstanceParent="+ intInstanceParent);//error
		System.out.println("intStaticParent="+ intStaticParent);
	}
	//The instance block
	{
		System.out.println("\nInside instance block of parent");
		intInstanceParent++;
		intStaticParent++;		
		System.out.println("intStaticParent changed to :"+ intStaticParent);
		System.out.println("intInstanceParent changed to :"+ intInstanceParent);
		testMethod();//No compilation error
	}
	//The constructor
	public Parent()
	{
		System.out.println("\n Inside Parent() constructor");
		intInstanceParent++;
		intStaticParent++;		
		System.out.println("intStaticParent changed to ="+ intStaticParent);
		System.out.println("intInstanceParent changed to="+ intInstanceParent);
		
	}
	
	//static constructor is not possible,only public,private and protected are allowed
	//	static Parent(){}//error	
}
class Child extends Parent
{
	//The static block
	static {
		System.out.println("\nInside static block of Child");
		//intInstanceParent=10;//error
		intStaticParent++;
		System.out.println("intStaticParent="+ intStaticParent);
	}
	//The instance block
	{
		System.out.println("\nInside instance block of child");
		intInstanceParent++;
		intStaticParent++;		
		System.out.println("intStaticParent changed to :"+ intStaticParent);
		System.out.println("intInstanceParent changed to :"+ intInstanceParent);
	}
	//The constructor
	public Child()
	{
		System.out.println("\nInside Child() constructor");
		intInstanceParent++;
		intStaticParent++;		
		System.out.println("intStaticParent changed to ="+ intStaticParent);
		System.out.println("intInstanceParent changed to="+ intInstanceParent);		
	}		
}
public class Demonstration3 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-3.Exploring initialization blocks***\n");
		Parent parentOb=new Child();
		
		System.out.println("--------------------");
		//Again instantiating an object.
		Parent parentOb2=new Child();

	}

}
