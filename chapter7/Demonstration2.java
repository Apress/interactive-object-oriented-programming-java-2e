package java2e.chapter7;//package statement should be the first statement
import java.util.Date;// ok

/*import java.util.Date;
package java2e.chapter7;//error
*/
class Demonstration2 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring the order of package and import statements.***");
		Date currentTime = new Date();
		System.out.println(currentTime.toString());
	}
}
