package java2e.chapter11;

class Thread2A implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2A prints ->" + i);
		}
		System.out.println("Exit-Thread2A");
	}
}

class Demonstration2 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring multithreading by implementing Runnable Interface.***");
		Thread thread2A = new Thread(new Thread2A());// Thread2A implements Runnable interface
		thread2A.start();		
		System.out.println("Exit from main thread");
	}
}