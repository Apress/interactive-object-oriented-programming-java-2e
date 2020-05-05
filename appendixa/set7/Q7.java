package java2e.appendixa.set7;

class Q7 {

	public static void main(String[] args) {
		System.out.println("***Set7.Q7***");
        int[] myIntArray=new int[3];
        myIntArray[0]=10;
        myIntArray[2]=20;
        System.out.println("Contents of Array:");
        //Runtime error will occur for the following block of code
        for(int i=0;i<5;i++)
        {
                System.out.println("\t"+myIntArray[i]);
        }
	}
}
