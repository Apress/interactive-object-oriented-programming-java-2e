package java2e.chapter12;

class GenericClass12<T> {
	public void show(T value) {
		System.out.println("Inside parent class.The value is:"+value);		
	}
}

class SubClass12 extends GenericClass12<Integer> { 
	@Override
	public void show(Integer value) {
		System.out.println("Inside Child Class.The value is:"+value);		
	}
}

class Demonstration12 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-12.Bridge Method in Generic Programming.***");
		// Creating a MyGenericClass<Integer> type object.
		GenericClass12<Integer> parentOb = new GenericClass12<Integer>();		
		parentOb.show(100);
		// A SubClass12 object
		SubClass12 childOb = new SubClass12();		
		childOb.show(300);		
		//Object ob=(int)400;
		//childOb.show(ob);//Error
		
		//Using Polymorphism
		System.out.println("Using Ploymorphism :" );
		parentOb=childOb;
		parentOb.show(500);		
	}
}
