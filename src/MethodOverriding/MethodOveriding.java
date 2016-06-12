package MethodOverriding;

/*
 * <-->METHOD OVERRIDING
 * 
 *  -->INHRITING METHOD FROM SUPER CLASS CHANGING ITS IMPLEMENTATION IN 
 *     SUB CLASS ACCORDING TO SUB CLASS SPECIFICATION IS KNOW AS 
 *     METHOD OVERRIDNG.
 *     
 *  -->THE SUB CLASS CAN CHANGE THE IMPLEMENTATION OF SUPERCLASS METHOD BY OVERRIDING CONCEPT
 *  
 *  -->WHILE OVERRIDING method in SUB CLASS SHOULD RETAIN SAME SIGNATURE OF SUPER CLASS
 *     AND CAN CHANGE THE IMPLEMENTATION DEFINE IN THE METHOD BODY.
 *     
 *  -->FOLLOWING METHOD OF SUPER CLASS CAN NOT OVERRIDE
 *  
 *  1.STATIC METHOD
 *  2.PRIVATE METHOD
 *  3.FINAL METHOD
 * 
 * 
 */ 
 

class Demo
{

	void test()
	{
		
		System.out.println("running test method");
		
	}
	
	
	
}

class Sample extends Demo
{

	void test()
	{
		
		System.out.println("running overrided test method");
	}
	
	
	
}



public class MethodOveriding
{

	public static void main(String[] args) {
		
		System.out.println("**********************");
		

		Sample obj1=new Sample();
		
		obj1.test();// calling to non static test method
		
     	System.out.println("**********************");

			
	}

}
