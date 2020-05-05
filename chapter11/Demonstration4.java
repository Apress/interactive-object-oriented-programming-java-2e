package java2e.chapter11;

class Thread4A extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread4A prints ->" + i);
			if (i == 2) {
				System.out.println("Going to interrupt the thread.");
				interrupt();// Interrupts this thread
				System.out.println("Is Thread4A interrupted?" + this.interrupted());
			}
		}
		System.out.println("Exit-Thread4A");
	}
}

class Thread4B extends Thread {
	public void run() {
		for (int j = 0; j < 5; j++) {
			System.out.println("Thread4B prints ->" + j);
			if (j == 3) {
				try {
					sleep(5000);// sleeps for 5000 milliseconds
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Exit-Thread4B");
	}
}

class Thread4C extends Thread {
	public void run() {
		for (int k = 0; k < 5; k++) {
			System.out.println("Thread4C prints ->" + k);
			if (k == 4) {
				yield();
			}
		}
		System.out.println("Exit-Thread4C");
	}
}

class Demonstration4 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("***Demonstration-4.Exploring multithreading with yield(),sleep() and interrupt() methods of the Thread class.***");
		Thread4A thread4A = new Thread4A();
		Thread4B thread4B = new Thread4B();
		Thread4C thread4C = new Thread4C();
		thread4A.start();
		thread4B.start();
		thread4C.start();
		System.out.println("Is Thread4A interrupted now?" + thread4A.interrupted());
		Thread.currentThread();
		//Testing whether Thread4B object is alive or not.
		//System.out.println(" Thread 4B is alive? "+ thread4B.isAlive());
		Thread.sleep(1000);
		//System.out.println("Exit-main()");
		//Modified program to show the use of join()
		//Waiting for the threads to complete before main thread.
		thread4A.join();
		thread4B.join();
		thread4C.join();
		//Testing whether Thread4B object is alive or not.
		//System.out.println(" Thread 4B is alive? "+ thread4B.isAlive());
		System.out.println("Exit-main()");		
	}
}
