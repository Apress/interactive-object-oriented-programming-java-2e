package java2e.appendixa.set6;

class Q10 {

	public static void main(String[] args) {		
		System.out.println("***Set6.Q10***");
		System.out.println("*** ConditionalOperator.Demo-2***");
        int a=10;
        int b=5;
        //Error:Cannot convert from int to String
        //String result=a<0?"Negative":a;
        //System.out.println("result is : "+result);
        
        
        String str="hello";
        String result;
        result=str.equals("hello")?"Correct Match":"Doesn't match";
        System.out.println(result);
        
	}
}
