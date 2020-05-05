package java2e.chapter2;

class ConsEx2 {
	int i;

	public ConsEx2(int i) {
		this.i = i;		
	}
	// public ConsEx2() { }
}

public class Quiz1 {

	public static void main(String[] args) {
		System.out.println("***Experiment with constructor***");
		//ConsEx2 ob = new ConsEx2();
		ConsEx2 ob = new ConsEx2(25);		
	}
}
