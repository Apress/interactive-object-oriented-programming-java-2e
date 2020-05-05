package java2e.chapter11;

class SharedResource1 {
	static synchronized void startingPart() throws InterruptedException {		
		System.out.println(Thread.currentThread().getName() + ": enters starting part-SharedResource1.");
		Thread.sleep(100);
		System.out.println(Thread.currentThread().getName() + ": Waiting to get endPart of SharedResource2.");		
		SharedResource2.endPart();
		System.out.println(Thread.currentThread().getName() + ": Exits starting part-SharedResource1");	
	}

	static synchronized void endPart() throws InterruptedException {		
		System.out.println(Thread.currentThread().getName() + ": Exits SharedResource1.endingPart .");
	}
}

class SharedResource2 {	
	static synchronized void startingPart() throws InterruptedException {			
		System.out.println(Thread.currentThread().getName() + ": enters starting part of SharedResource2.");
		Thread.sleep(100);
		System.out.println(Thread.currentThread().getName() + ": Waiting to get endPart-SharedResource1.");
		SharedResource1.endPart();
		System.out.println(Thread.currentThread().getName() + ": Exits starting part of SharedResource2.");		
	}

	static synchronized void endPart() throws InterruptedException {		
		System.out.println(Thread.currentThread().getName() + ": Exits end part of SharedResource2.");
	}
}

class First extends Thread {
	public First(String name) { 
		super(name);				
	}
	public void run() {
		try {
			SharedResource1.startingPart();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Second extends Thread {
	public Second(String name) { 
		super(name);			
	}
	public void run() {
		try {
			SharedResource2.startingPart();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Deadlock {	
	public static void main(String[] args) {	
		System.out.println("***Demonstration- Incorrect design leads to deadlock.***\n");		
		// An instance of ThreadOne
		First first = new First("FirstThread");
		// An instance of Threadtwo
		Second second = new Second("SecondThread");
		first.start();
		second.start();
	}
}
