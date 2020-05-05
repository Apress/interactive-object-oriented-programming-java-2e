package java2e.chapter3;

class Student
{
    int rollNo;
    String name;
    //Instance Constructor
    public Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }
    //Copy Constructor
    public Student( Student student)
    {
        this.name = student.name;
        this.rollNo = student.rollNo;
    }
    public void displayDetails()
    {
    	System.out.println(" Student name: " + name + ",Roll no: "+rollNo);
    }
}

class Demonstration6 {
	public static void main(String[] args) {
		System.out.println("***Demonstration-6.User defined copy constructor example in Java***\n");
		Student student1 = new Student(1, "Bob");
		System.out.println(" The Student1 details is as follows:");
        student1.displayDetails();
        System.out.println("\n Copying student1 to student2 now");
        //Invoking the user-defined copy constructor
        Student student2 = new Student (student1);
        System.out.println(" The details of Student2 is as follows:");
        student2.displayDetails();
	}
}
