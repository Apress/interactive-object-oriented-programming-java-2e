package java2e.chapter4;

class Parent4 {
	Parent4() {
		System.out.println("Inside Parent Constructor.");
	}
}

class Child4 extends Parent4 {
	Child4() {
		System.out.println("Inside Child Constructor.");
	}
}

class Grandchild4 extends Child4 {
	Grandchild4() {
		System.out.println("Inside GrandChild Constructor.");
	}
}

class Demonstration4 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-4. Testing constructor calling sequence***");
		Grandchild4 grandChild = new Grandchild4();
	}
}
