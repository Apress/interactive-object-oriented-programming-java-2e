package java2e.chapter6;
import java.lang.annotation.Documented;

//Marker Annotation
@interface MarkerAnnotation {
}

//User-Defined Annotation
@Documented
@interface MySoftwareDetails{
	String author();//You need to supply an author name.
	int currentVersion() default 1;//You may supply a different version which is optional.	
}
//A single-member user-defined annotation
@Documented
@interface MyReviewerDetails{
	//It is single-member annotation.By convention, you use the name value().
	String value();//You need to supply an reviewer name.	
}

@MySoftwareDetails( author="Vaskaran Sarcar")
public class Demonstration9 {
	@MarkerAnnotation
	public void myMethod1() {
		System.out.println("A marker annotation is used in this method.");
	}
	@MySoftwareDetails( author="Sarcar V", currentVersion=2)
	public void myMethod2() {
		System.out.println("A custom annotation is used in myMethod2()");
	}

	@MyReviewerDetails(value = "Joe")
	public void myMethod3() {
		System.out.println("A single-member annotation is applied to myMethod3()");
	}

	// A method without annotations
	public void myMethod4() {
		System.out.println(" Method4() is used without annotations.");
	}
}