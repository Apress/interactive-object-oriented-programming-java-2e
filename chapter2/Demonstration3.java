package java2e.chapter2;

class ClassEx3
{
    public int i;
    public ClassEx3(int i)
    {
        this.i = i;
       //i=i;//Warning:The assignment to variable i has no effect”
    }
}
/*class ClassEx3 {
	int i;// instance variable

	ClassEx3(int myInteger)// myInteger is a local variable here
	{
		i = myInteger;
	}
}*/

class Demonstration3 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-3.A class demo with 2 objects ***");
		ClassEx3 obA = new ClassEx3(10);
		ClassEx3 obB = new ClassEx3(20);
		System.out.println("obA.i =" + obA.i);
		System.out.println("obB.i =" + obB.i);
	}
}
