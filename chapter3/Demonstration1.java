package java2e.chapter3;
class Rectangle {
	//static variables
    static double length=25.5, breadth=10.0;
    //static method
	public static double area() {
		return length * breadth;
	}
}
class Demonstration1 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Exploring class variables and class methods.***\n");
		System.out.println("Length of the Rectangle is :" + Rectangle.length + " unit");
		System.out.println("Breadth of the Rectangle is :" + Rectangle.breadth + " unit");
		System.out.println("Area of Rectangle is " + Rectangle.area() + " sq.unit");
	}
}
