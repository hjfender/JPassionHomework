package mypackage;

public class OuterClass {

    // Define variables in the outer class
    private int privateData = 5;
    protected int protectedData = 6;
    int defaultData = 5;
    public int publicData = 8;
    
    // Define an inner class
    class InnerClass {
	int data2 = 10;
	
	class InnerInnerClass {
	    int data3 = 15;
	    
	    void myInnerInnerClassMethod(){
		System.out.println("data from OuterClass = " + privateData);
		System.out.println("data2 from InnerClass = " + data2);
		System.out.println("data3 from InnerInnerClass = " + data3);
	    }
	}
	
	void myInnerClassMethod() {
	    // Inner class can access even private member of outer class
	    System.out.println("data from OuterClass = " + privateData);
	    /*System.out.println("data from OuterClass = " + protectedData);
	    System.out.println("data from OuterClass = " + defaultData);
	    System.out.println("data from OuterClass = " + publicData);*/
	    // Inner class can access even private member of outer class
	    /*System.out.println("call a method of Outer Class = " + myOuterMethod());*/
	    System.out.println("data2 from InnerClass = " + data2);
	}
	
    }
    
    private String myOuterMethod() {
	return "myOuterMethod() has been called!";
    }
}
