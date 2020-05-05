package java2e.chapter8;

class Rectangle {
	//static members
    static double length=25.5, breadth=10.0;
    static String myStaticString="I am a static string";
    //Non static members
    int myNonStaticInt=25;

	public static double area() {
		return length * breadth;
	}
}

class Demonstration1 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Exploring class variables and class methods.***\n");
		System.out.println("Area of Rectangle is " + Rectangle.area() + "sq. unit");
		System.out.println("The myStaticString is : " + Rectangle.myStaticString);
		
		Rectangle rectOb=new Rectangle();
		System.out.println("The myNonStaticInt is : " + rectOb.myNonStaticInt);
		//Warning: The static field Rectangle.myStaticString should be accessed in a static way
		//System.out.println("The myStaticString is : " + rectOb.myStaticString);	
	}
}
