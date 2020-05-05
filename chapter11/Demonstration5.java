package java2e.chapter11;

class MyClass5A {
	//Synchronized version
	//synchronized void display() {
	//Non-synchronized version
	void display() {

		System.out.print(Thread.currentThread().getName() + " has entered and working in the shared location. \n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName() + " exits.\n");
	}
}

class Thread5B extends Thread {
	MyClass5A myClass5AObject;

	public Thread5B(MyClass5A myObject, String name) {
		super(name);
		this.myClass5AObject = myObject;		
	}

	@Override
	public void run() {
		myClass5AObject.display();	
	}
}


class Demonstration5 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("***Demonstration-5.Exploring multithreading with( and without) synchronized method.***");
		MyClass5A myObject = new MyClass5A();
		Thread5B ob1 = new Thread5B(myObject, "Thread5B-1");
		Thread5B ob2 = new Thread5B(myObject, "Thread5B-2");		
		ob1.start();
		ob2.start();
	}
}
