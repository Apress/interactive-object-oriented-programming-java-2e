package java2e.appendixa.set7;

import java.util.Arrays;

class Q4 {

	public static void main(String[] args) {
		System.out.println("***Set7.Q4***");
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
        System.out.println("\nmyIntArray length="+myIntArray.length);
        
        //Incresing the size of the array        
        int[] myBigArray=Arrays.copyOf(myIntArray,6);
        //Putting a new value in newly added location
        myBigArray[5]=6;
        System.out.println("Displaying the contents of the myBigArray:");
        for(int i=0;i<6;i++)
        {
                System.out.print("\t"+myBigArray[i]);
        }
        System.out.println("\nmyBigArray length="+myBigArray.length);
	}

}
