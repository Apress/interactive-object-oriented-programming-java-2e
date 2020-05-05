package java2e.chapter14;

class StringMethodsFromJava11 {

	public static void main(String[] args) {
		System.out.println("***Demonstration 5.Some new String methods from Java 11.***\n");
		String str1 = "A non-empty string.";
		System.out.println("The str1 is :" + str1);
		System.out.println(" 'The str1 is a blank string'-This statement is " + str1.isBlank());

		String str2 = "";
		System.out.println("The str2 is :" + str2);
		System.out.println(" 'The str2 is a blank string'-This statement is " + str2.isBlank());

		// Repeat the string
		System.out.println("\nRepeating 'str1' 3 times now.");
		System.out.println(str1.repeat(3));

		// Using strip() removing beginning and trailing whitespaces
		String str3 = " Hi, Readers! How are you? ";
		System.out.println("\nThe str3 is :" + str3);
		System.out.println("After strip() operation, str3 is :" + str3.strip());
	}

}
