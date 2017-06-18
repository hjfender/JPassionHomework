package mypackage;

public class Main {

    public static void main(String[] args) {
	
	/* 
	 * Create an object instance of a class that contains
	 * an inner class - we will call it OuterClass.
	 */
	OuterClass outerObject = new OuterClass();
	
	/*
	 * Create an object instance of an inner class. Please
	 * note that you create it from an object instance of
	 * OuterClass.
	 */
	OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	
	/*
	 * Create an object instance of an inner inner class.
	 */
	OuterClass.InnerClass.InnerInnerClass innerInnerObject = innerObject.new InnerInnerClass(); 
	
	// Display data from both outer class and inner class.
	System.out.println("Access data from outer class = " + outerObject.defaultData); // 7
	System.out.println("Access data2 from inner class = " + innerObject.data2); // 10
	System.out.println("Access data3 from innerinner class = " + innerInnerObject.data3);
	
	/*
	 * Invoke a method from an inner class
	 * Observe that the inner class object has access to
	 * instance variables and methods of the outer class object.
	 */
	innerObject.myInnerClassMethod();
	innerInnerObject.myInnerInnerClassMethod();
    }
}
