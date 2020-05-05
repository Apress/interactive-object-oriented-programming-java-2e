package java2e.chapter3;

class StudentDemo9 {
//Some code
	protected void finalize() {
		System.out.println("Freeing memory. The object with hashcode " + hashCode() + " is collected.");
	}
}

class GarbageCollectionDemo {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("***Demonstration 10.Exploring Garbage Collection.***\n");
		//Stage-1
		StudentDemo9 student1, student2, student3;
		student1 = new StudentDemo9();// Student#1
		System.out.println("The student1.hashCode()=" + student1.hashCode());
		student2 = new StudentDemo9();// Student#2
		System.out.println("The student2.hashCode()=" + student2.hashCode());
		student3 = new StudentDemo9();// Student #3
		System.out.println("The student3.hashCode()=" + student3.hashCode());
		
		//Stage-2
		student1 = null;
		// Requesting JVM to run Garbage Collector
		System.out.println("Requesting GC-1");
		System.gc();
		Thread.sleep(3000);
		
		//Stage-3
		student3 = student2;
		// Requesting JVM to run Garbage Collector
		System.out.println("Requesting GC-2");
		System.gc();
		Thread.sleep(3000);
		
		//Stage-4
		student2 = null;
		// Requesting JVM to run Garbage Collector
		System.out.println("Requesting GC-3");
		System.gc();
		Thread.sleep(3000);

		student3 = null;
		// Requesting JVM to run Garbage Collector
		System.out.println("Requesting GC-4");
		System.gc();
		Thread.sleep(3000);
		
	}// End of main()
}
