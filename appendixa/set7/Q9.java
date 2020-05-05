package java2e.appendixa.set7;

class A {
	int i;
	A(int i) {
		this.i = i;
	}
}

class Q9 {
	public static void main(String[] args) {
		System.out.println("***Set7.Q9***");		
		A[] myArray = new A[5];
		myArray[0] = new A(10);
		myArray[2] = new A(25);
		System.out.println("Contents of Array:");
		for (int i = 0; i < 5; i++) {
			System.out.println(myArray[i]);
			//Modification for Q10 in Set 7
			/*
           if(myArray[i]!=null)
            {
             System.out.println("myArray["+ i+"] : "+myArray[i].i);
            }
            */
		}		
	}
}
