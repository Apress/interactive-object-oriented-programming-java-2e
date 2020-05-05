package java2e.chapter12;

class Demo8AClass {
	//Some code
}

class Demo8BClass {
	//Some code
}

interface Interface8ADemo {
	//Some code
}

interface Interface8BDemo {
	//Some code
}

class ImplementorInterface8ADemo implements Interface8ADemo{
	//Some code
}
//class GenericDemo8Class<T extends Demo8AClass & Demo8BClass> {//Error
//class GenericDemo8Class<T extends  Interface8ADemo& Demo8AClass & Interface8BDemo> {//Error
//class GenericDemo8Class<T extends  ImplementorInterface8ADemo & Interface8ADemo & Interface8BDemo> {//Ok
class GenericDemo8Class<T extends Demo8AClass & Interface8ADemo> {//Ok
//class GenericDemo8Class<T extends Demo8AClass & Interface8ADemo & Interface8BDemo> {//Ok
}

//class GenericDemo8B<? extends Demo8AClass >//error
//{	}

class Demonstration8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
