package java2e.chapter4;
class Parent
{
    public void show()
    {
        System.out.println ("I am in Parent");
    }
}
class Child1 extends Parent
{
    public void show()
    {
        System.out.println ("I am in Child-1");
    }
}
class Child2 extends Parent
{
    public void show()
    {
        System.out.println ("I am in Child-2");
    }
}

/*class GrandChild extends Child1,Child2//Error: Diamond Effect,Not supported in Java
{
    public void show()
    {
    	System.out.println("I am in Grandchild");
    }
}*/

public class Demonstration3 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-3.Testing diamond effect in Java.***");

	}
}
