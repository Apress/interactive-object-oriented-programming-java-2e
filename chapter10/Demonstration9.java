package java2e.chapter10;

class OuterException extends RuntimeException {
	String str = null;

	OuterException(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}

}

class InnerException extends RuntimeException {
	String str = null;

	InnerException(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}

}

// To increase the depth 

class SubInnerException extends RuntimeException {
	String str = null;

	SubInnerException(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}
}

class Demo9Class {
	void raiseException() // throws clause not necessary now
	{
		OuterException outer = new OuterException("An OuterException is raised.");
		InnerException inner = new InnerException("It is caused by an InnerException.");
		SubInnerException subInner = new SubInnerException("It is again caused by an	SubInnerException.");
		outer.initCause(inner);
		inner.initCause(subInner);
		throw outer;
	}
}

class Demonstration9 {
	public static void main(String args[]) {
		System.out.println("***Demonstration-9.A chained exception demo***\n");
		Demo9Class demo = new Demo9Class();
		try {
			demo.raiseException();
		} catch (OuterException e) {
			System.out.println(e);
			System.out.println("Here is the details:" + e.getCause());
			System.out.println("Here is the stack trace :");
			e.printStackTrace();
		}
	}
}
