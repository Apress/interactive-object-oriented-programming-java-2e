class SwitchExpressionTest {
	public static void main(String[] args) {
	  System.out.println("***Testing Switch expression in Java 13.***");
                System.out.println("Considering versions between 1 to 13.");                
                int myVersion=13;//Your version.You can change here.
                testNewSwitchExpressionInJava13(myVersion);
}

public static void testNewSwitchExpressionInJava13(int version){
		switch (version) {
    		case  1,2,3,4,5-> System.out.println(" Your version is between 1 and 5.");
    		case 6,7,8,9,10,11,12-> System.out.println("Your version between 6 to 12");
    		case 13-> System.out.println("At present, 13 is the latest version.You picked it.");
                default -> System.out.println("You did't pick between 1 to 13.Default version is :0");
		}		
	}
}
