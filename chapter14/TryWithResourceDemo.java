package java2e.chapter14;

//Resource-1
class Resource1 implements AutoCloseable {
	public void useResource() {
		System.out.println("Using a Resource1 type.");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Close Resource1 type now.");
	}
}
/*
//For Q&A this resource is added
//Resource-2
class Resource2 implements AutoCloseable {
	public void useResource() {
		System.out.println("Using a Resource1 type.");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Close Resource1 type now.");
	}
}
*/
class TryWithResourceDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("***Demonstration 1.Try with Resource demo.***\n");
		//try(Resource1 resource1 = new Resource1();Resource2 resource2 = new Resource2())  { 
		try(Resource1 resource1 = new Resource1())  { 
           resource1.useResource();     
           //resource2.useResource();
        } 
        catch(Exception e) { 
            System.out.println(e); 
        }
	}
}
