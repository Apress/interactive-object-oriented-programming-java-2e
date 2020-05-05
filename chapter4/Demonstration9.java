package java2e.chapter4;

class Parent9 {
	int i;
	Parent9() {
		System.out.println("Invoking parameterless constructor of Parent class.");
	}
}

class Child9 extends Parent9 {
	int b;
	Child9() {
		// both this() and super() cannot be used together
		 //super();
		this(2);		
		System.out.println("Invoking parameterless constructor of Child9.");
	}

	Child9(int b) {
		this.b = b;
		System.out.println("Inside Child9 constructor with one parameter where b= " + b);
	}
}

class Demonstration9 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-9.A case study with this and super keyword.***");
		Child9 obChild9 = new Child9();
	}
}
