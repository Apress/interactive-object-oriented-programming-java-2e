package java2e.chapter11;
//ThreadOne extends from the Thread class 
class ThreadOne extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadOne prints ->" + i);
		}
		System.out.println("Exit-ThreadOne");
	}
}

//ThreadTwo extends from the Thread class
class ThreadTwo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadTwo prints ->" + i);
		}
		System.out.println("Exit-ThreadTwo");
	}
}

class Demonstration1 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-1.Exploring multithreading by extending Thread class.***");
		//An instance of ThreadOne
		ThreadOne threadOne = new ThreadOne();
		//An instance of Threadtwo	
		ThreadTwo threadTwo = new ThreadTwo();
		//The following lines of code will invoke the run() method of the corresponding threads.
		threadOne.start();
		threadTwo.start();
		System.out.println("Exit from main thread");
	}
}
