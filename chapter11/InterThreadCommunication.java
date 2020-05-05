package java2e.chapter11;

//A singleton class
class SharedResource {
	static boolean jobDone = false;

	// We make the constructor private to prevent the use of "new" 
	private SharedResource() {
	}

	private static SharedResource sharedInstance;

	public static synchronized SharedResource getInstance() {
		if (sharedInstance == null) {
			System.out.println("Creating the singleton Instance");
			sharedInstance = new SharedResource();
		} else {
			System.out.println("I already created a SharedResource instance.I'm using that.");
		}
		return sharedInstance;
	}

	synchronized void allowJob() {
		System.out.println(Thread.currentThread().getName() + " enters into allowJob().");
		System.out.println("Checking whether a new job is allowed to perform or not.");
		if (jobDone != true) {
			System.out.println("Waiting for any existing/pending job to complete (i.e.jobDone flag to be true).");
			try {
				System.out.println("Releasing control in allowJob().");
				wait();
				System.out.println("wait() performed.");
			} catch (Exception e) {
			}
		}
		System.out.println("Ready to allow new Job.");
	}

	synchronized void performJob() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " enters into performJob()");
		System.out.println("A job is already in progress.");
		for (int i = 0; i < 10; i++) {
			// Any arbitrary job can be performed.Here we are just printing 0 to 9.
			System.out.print("\t" + i);
			Thread.sleep(100);
		}
		System.out.println(" ");
		System.out.println("Job completed. ");
		jobDone = true;
		notify();
		// notifyAll();
	}
}

//FirstThread class
class FirstThread extends Thread {
	public FirstThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		SharedResource.getInstance().allowJob();
		//new SharedResource().allowJob();//error
		System.out.println("Exit-FirstThread.");
	}
}

//SecondThread class
class SecondThread extends Thread {
	public SecondThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			SharedResource.getInstance().performJob();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// new SharedResource().performJob();//error
		System.out.println("Exit-SecondThread.");
	}
}

class InterThreadCommunication {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("***Demonstration 8. A simple demo on Interthread Communication.***");

		FirstThread first = new FirstThread("FirstThread");
		first.start();
		// We want FirstThread to start executing first
		Thread.sleep(1000);
		SecondThread second = new SecondThread("SecondThread");
		second.start();

		/*
		 final SharedResource c = new SharedResource(); 
		 new Thread() { 
			 public void run() { 
				 c.allowJob(); 
			 	} 
			 }.start(); 
			 
			 new Thread() { 
				 public void run() { 
					 try {
						 c.performJob(); 
					 } catch (InterruptedException e) { e.printStackTrace(); } }
		  }.start();
		 */

	}
}