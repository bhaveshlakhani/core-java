package interfaceConcept;



/*
 *  AN ABSTRACT CLASS IS NOT A PURE ABSTRACT BODY BECAUSE IT ALLOWS TO DEFINE 
 *  CONCRETE METHOD
 *  
 *  TO OVERCOME THIS ONE JAVA IS PROVIDE INTERFACE CONCEPT.
 * 
 * -->INTERFACE
 * 
 * AN INTERFACE IS A JAVA TYPE DEFINITION BLOCK WHICH IS USED TO DEFINE ONLY
 * ABSTRACT METHOD.
 * 
 * THE INTERFACE METHOD SHOULD BE ABSTRACT, AND SHOULD HAVE PUBLIC ACCESS.
 * 
 * AN INTERFACE CAN HAVE ONLY STATIC FINAL DATA MEMBER.
 * 
 *  An interface method should be abstract in nature,
 *   and it should be public in access.
 *     Inside interface body we can’t create concrete methods. 
 *     Interface variables should be static and final,
 *      we can’t define non-static variables.
 *     By default the interface variable are static final and public.
 *     By default interface methods are abstract and public. 
 *     Inside interface we can’t develop constructer.
 *    AB 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * IN AN INNTERFACE WE CAN NOT CREATE CONSTRUCTOR.
 * 
 * IN AN INTERFACE ALL MEMBER SHOULD HAVE PUBLIC ACCESS.
 * 
 * WE CAN NOT CREATE INSTANCE OF INTERFACE. BECAUSE IT IS AN ABSTRACT BODY.
 * BUT WE CREATE A REFERENCE VARIABLE OF INTERFACE TYPE, FOR SUCH REFERENCE 
 * VARIABLE WE CAN ASSIGN INSTANCE OF IMPLEMENTATION CLASS.
 *
 *
 *-->>>INTERFACE CONCEPT
 *
 * THE METHOD OF INTERFACE SHOULD BE IMPLEMENTED IN A CLASS.
 *
 * A CLASS CAN IMPLEMENT AN INTERFACE BY USING Implements KEYWORD.
 * 
 * WHENEVER CLASS IMPLEMENTS INTERFACE THE CLASS MUST PROVIDE IMPLEMENTATION
 * TO ALL INHERITED ABSTARCT METHOD OF INTERFACE OTHERWISE THE CLASS SHOULD 
 * BE DECLARE AS ABSTRACT.
 * 
 * THE CLASS CAN IMPLEMENT ANY NUMBER OF INTERFACES.
 * 
 * INTERFACE CAN HAVE SUPER INTERFACE BUT CAN NOT HAVE SUPER CLASS.
 *
 */

public interface Demo1
{

final static int id=12;

   public void test(int arg);
	
}

class Sample1 implements Demo1
{
	
	
	//subclass which provide implementation to interface method is known as
	//implementation of class
	
	//u can not reduce the visibility so here you must write public
	public void test(int arg)
	{
		
		System.out.println("test(int)method is implemented in Sample1 class");
		System.out.println("arg value: "+arg);
	}
}
class Mainclass
{
	public static void main(String[] args)
	{
	
		System.out.println("*************************");
		

        Sample1 obj1=new Sample1();
		
		obj1.test(10);
		
		System.out.println("*************************");
		
		
		Demo1 rf1;// you can create reference variable of interface but not create it's instance
		
		rf1=new Sample1();//assigning instance of implementation class
		
		rf1.test(19);
		
		
		
		System.out.println("*************************");
		
	}	
}