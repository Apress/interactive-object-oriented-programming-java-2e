class TrimVsStripMethod {
 public static void main(String[] args) {
	System.out.println("***Demonstration- Strip() vs Trim() from Java 11.***\n");
	//Medium Mathematical Space U+205F
              
        String str1 = "\u205F \u205FThis is my test string with trailing whitespace-END.\u205F \u205F";
        //String str2 = "\nThis is my test string with trailing whitespace-END.\n";
        String trimmedString = str1.trim();
        String strippedString = str1.strip();
        System.out.println(trimmedString);
        System.out.println(strippedString);
        System.out.printf("'%s'%n", trimmedString);
        System.out.printf("'%s'%n", strippedString);	
	}
}
