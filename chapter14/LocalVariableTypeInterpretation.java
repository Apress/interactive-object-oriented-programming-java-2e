package java2e.chapter14;

class LocalVariableTypeInterpretation {
	 public static void main(String[] args) {
		System.out.println("***Demonstration 4.Local Variable Type Interpretation.***\n");
		int myInt1=1;//ok
		var myInt2=2;//Java10 onwards ok		
		System.out.println("The value in myInt1 is :"+ myInt2);
		System.out.println("The myInt1 is of type:");
	      //It will print java.lang.Integer
		System.out.println(((Object)myInt1).getClass().getName());
		System.out.println("The myInt2 is of type:");
		//It will also print java.lang.Integer
		System.out.println(((Object)myInt2).getClass().getName());	
	}
}
