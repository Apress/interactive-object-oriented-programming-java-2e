package java2e.appendixa.set9;

class Q1Modified {
	public static void main(String[] args) {		
		System.out.println("***Set9.Q1-Analysing the Modified Program***");
		System.out.println("***String vs StringBuffer***");
        String str1="Hello";
        str1.concat("World");
        System.out.println(str1);//Hello
        System.out.println("The str1.hashCode()="+ str1.hashCode());
        System.out.println("The str1.concat(\"World\").hashCode()="+ str1.concat("World").hashCode());
        StringBuffer str2=new StringBuffer("Hello");
        str2.append("World");
        System.out.println(str2);//HelloWorld
        System.out.println("The str2.hashCode()="+str2.hashCode());
        System.out.println("The str2.append(\"World\").hashCode()="+ str2.append("World").hashCode());

	}

}
