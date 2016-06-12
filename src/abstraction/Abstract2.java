package abstraction;

/*-->ABSTRACT CLASS 
 * 
 * DEFINING A METHOD WITHOUT IMPLEMENTATION IS KNOWN AS ABSTRACT METHOD.
 * 
 * THE ABSTRACT METHOD DOES NOT SPECIFY ANY IMPLEMENTATION OR METHOD BODY.
 * 
 * THE ABSTRACT METHOD SHOULD BE DEFINE ONLY INSIDE THE ABSTRACT CLASS.
 * 
 * A CLASS DECLARE USING ABSTRACT KEYWORD IS KNOWN AS  ABSTRACT CLASS.
 * 
 * AN ABSTRACT CLASS CAN HAVE CONCRETE METHOD OR ABSTRACT METHOD.
 * 
 * IT CAN HAVE BOTH STATIC AND NON STATIC METHOD.
 * 
 * WE  CAN NOT CREATE INSTANCE OF ABSTRACT CLASS.
 * 
 *  THE SUBCLASS WHICH INHERIT THE PROPERTY FROM ABSTRACT CLASS MUST PROVIDE
 *  THE IMPLEMENTATION TO THE INHERITED ABSTRACT METHOD OTHER SUBCLASS SHOULD 
 *  BE DECLARE AS A ABSTRACT.
 *  
 *  THIS IS ALSO KNOWN AS CONTRACT OF ABSTRACT.
 *  
 * THE ABSTRACT KEYWORD CAN NOT BE COMPILED WITH FOLLOWING KEYWORD BECAUSE 
 * THIS METHOD CAN NOT BE OVERRIDE IN SUBCLASS.
 *     -FINAL 
 *     -STATIC 
 *     -PRIVATE
 *  
 *  AN ABSTRACT CLASS IS NOT A PURE ABSTRACT BODY BECAUSE IT ALLOWS TO DEFINE 
 *  CONCRETE METHOD
 *  
 *  TO OVERCOME THIS ONE JAVA IS PROVIDE INTERFACE CONCEPT.
 * 
 * 
 */

abstract class Demo2
{

	abstract void test(int arg);
	
	abstract void disp();
	

}

//you must provide implementation of abstract method in sub class 
//or if you don't want provide implentation then you must declare subclass as abstarct


class Sample2 extends Demo2
{

	void test(int arg)
	{
		
		System.out.println("running int arg test method");
	}
	
	void disp()
	{
	
		System.out.println("running disp method");
		
	}
	
}

public class Abstract2
{

	public static void main(String[] args) 
	{
	
		System.out.println("*******************************");
		
		
         Sample2 obj1=new Sample2();
         
         
		   obj1.test(12);
		   obj1.disp();
		
		
		System.out.println("*******************************");
	}
}
