package java2e.chapter8;

class Rectangle2 {
	static int staticOuterInt = 25;
	int nonStaticOuterInt = 125;

	//Static class
	static class StaticRectangle2 {
		void staticDisplay(){
			System.out.println("Inside the static class.");
			System.out.println("The staticOuterInt is : " + staticOuterInt);
			//	System.out.println("The nonStaticOuterInt is : " + nonStaticOuterInt);//error
			}		
	}
    //Inner class
	class InnerClass2 {
		void nonStaticDisplay(){
			System.out.println("\nInside the inner class.");
			System.out.println("The staticOuterInt is : " + staticOuterInt);
			System.out.println("The nonStaticOuterInt is : " + nonStaticOuterInt);//ok
			}
	}
}

class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring class variables and class methods.***\n");
		
		Rectangle2.StaticRectangle2  nestedStaticOb=new Rectangle2.StaticRectangle2();
		nestedStaticOb.staticDisplay();
		//Instantiating an inner class
		//Inner class is contained in an outer class, so you need to instatiate the outer class first.
		Rectangle2.InnerClass2 innerOb=new Rectangle2().new InnerClass2();
		//Or, use these multiline codes to instantiate an inner class as follows:
		/*Rectangle2 rect2=new Rectangle2();
		Rectangle2.InnerClass2 innerOb2=rect2.new InnerClass2();*/
		innerOb.nonStaticDisplay();
		//using Math class(Used for Q&A 8.2)
		//System.out.println(" Minimum of (12,15) is "+ java.lang.Math.min(12, 15));
	}

}
