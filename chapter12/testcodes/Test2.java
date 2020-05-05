package chapter12.testcodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sample {
	//Case Study-1:Wildcards in fields
	List<?>  myList;  //valid
	//?  aField;  //Invalid
	
	
	//Case Study-2:Wildcards in method paramter
	//Syntax error for ?
	//Invalid
	 //public void invalidMethodWithWildCardParameter(? methodParameter) {  
		 //Some code
	// }
   //The following method is valid.
	public void validMethodWithWildCardParameter(List<?> myParameter) {
		 System.out.println("The validMethodWithWildCardParameter(List<?> myParameter) is a valid method.");
		} 
	//Case Study-3:Wildcards in return type
	
	//Error: Return type for the method is missing
	// private ? methodWithWildCardReturnType() {//Invalid
	        //return null;
	//    }	
}
//Case Study-4:Wildcards in supertype
//Error: A supertype may not specify any wild card
//public class SubList implements List<?>{ //Invalid
	//Some code
//}

class Test2 {
	public static void main(String[] args) {
		System.out.println("***Demonstration 6A.Some case study with wildcards***");
		Sample sample=new Sample();
		//Case Study-5:Wildcards in local variable		
	    List<?> myList = Arrays.asList(12,27,39);//Valid
	    System.out.println("Original list :" + myList);
	    Collections.reverse(myList);
	    System.out.println("Reversed List:"+myList);		
		sample.validMethodWithWildCardParameter(myList);
	}
}
