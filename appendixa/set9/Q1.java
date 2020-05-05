package java2e.appendixa.set9;

class Q1 {
	public static void main(String[] args) {
		System.out.println("***Set9.Q1***");
        System.out.println("***String vs StringBuffer***");
        String str1="Hello";
        str1.concat("World");
        System.out.println(str1);//Hello

        StringBuffer str2=new StringBuffer("Hello");
        str2.append("World");
        System.out.println(str2);//HelloWorld
	}
}
