package java2e.chapter11;


//Thread2A class already defined in demonstration2
/*class Thread2A implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2A prints ->" + i);
		}
		System.out.println("Exit-Thread2A");
	}
}*/

class Demonstration2Modified {
	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Exploring multithreading by implementing Runnable Interface.***");
		Thread thread2A = new Thread(new Thread2A());// Thread2A implements Runnable interface
		thread2A.start();		
		
		/* Thread2A class implements the Runnable interface, so, objects of Thread2A become Runnable type.
		 * But the objects of Thread2A are NOT threads.
		 */
		System.out.println("Creating another object of Thread2A");
		Thread2A anotherObject=new Thread2A();
		anotherObject.run();		
		System.out.println("Exit from main thread");
	}
}
