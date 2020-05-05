package java2e.appendixa.set7;

class Q2 {
	public static void main(String[] args) {
		System.out.println("***Set7.Q2***");
		System.out.println("Creating an  integer array which can contain 5 integers.");
        int[] myIntArray=new int[5];
        //also valid
        //int myIntArray[]=new int[5];        
        for(int i=0;i<5;i++)
        {
                myIntArray[i]=i;
                System.out.println("Inserted "+ i +" in myIntArray["+ i + "]");
        }
        System.out.println("Displaying the contents of the Array:");
        for(int i=0;i<5;i++)
        {
                System.out.print("\t"+myIntArray[i]);
        }
        //System.out.println("\nArray length="+myIntArray.length);
	}
}
