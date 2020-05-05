package java2e.chapter11;

class Thread3A extends Thread {
	public Thread3A(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " is executing and prints : "+ i);			
		}
		System.out.println("Exit-"+ this.getName());
	}
}

class Thread3B extends Thread {
	public Thread3B(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " is executing.It is printing : "+i);		
		}
		System.out.println("Exit-"+ this.getName());
	}
}

class Demonstration3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("***Demonstration-3.Exploring multithreading by extending Thread class.***");
		// Get reference to Main thread 
        Thread mainThread = Thread.currentThread();           
        // Get the details of the Main thread 
        System.out.println("Current thread: " + mainThread.getName() + " and priority: " +mainThread.getPriority()); 
        Thread3A thread3A = new Thread3A("Thread3A");
		thread3A.setPriority(Thread.MIN_PRIORITY);//1
		Thread3B thread3B = new Thread3B("Thread3B");
		// Updating the name of the thread-ThreadDemo4
		thread3B.setName("ThreadDemonstration3B");
		thread3B.setPriority(Thread.MAX_PRIORITY);//10		
		System.out.println("Thread3A priority is " + thread3A.getPriority());
		System.out.println("ThreadDemonstration3B priority is " + thread3B.getPriority());
		thread3A.start();
		thread3B.start();	
		for (int i = 0; i <10; i++) {
			System.out.println( mainThread.getName() + " is executing and prints : "+ i);			
		}
		System.out.println("Exit main()");
	}
}
