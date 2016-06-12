package abstraction;



/* -->ABSTRACTION
 * 
 * abstraction process of hiding the implementation of object functionality,
 * the object functionality is allowed to used in the code without knowing 
 * how it is implemented.
 * 
 * 
 * 
 * or
 * 
 * Object oriented programming Abstraction is a process process of hiding 
 * the implementation details from the user, only the functionality will be 
 * provided to the user. 
 * 
 * 
 * -->IN ABSTRACT CLASS U CAN DECLARE
 *     -ABSTARCT METHOD
 *   11  -CONCRETE METHOD
 *       --DEFINING METHOD WITH METHOD DECLARATION AND METHOD BODY IS KNOWN AS CONCRETE METHOD
 *     -STATIC AND NON STATIC MEMBER
 *     -U CAN ALSO DECLARE CONSTRUCTOR
 * 
 * -->IT IS NOT MENDETORY THAT ABSTRACT CLASS MUST HAVE ABSTRACT METHOD.
 *     
 * --> AND YOU CAN NOT CREATE AN INSTANCE OF ABSTRACT CLASS.    
 * 
 * -->ABSTRACT KEYWORD CAN NOT COMPILE WITH FOLLOWINF KEYWORD.
 *     --STATIC
 *     --FINAL
 *     --PRIVATE
 *         
 */
abstract class Demo1
{
   static int k=12; //static member

   double d=12.4;//non static member

    Demo1()//constructor
    {
    	
	System.out.println("running Demo1 constructor");
	
    }
	
    static void test()//static method
    {
    	System.out.println("running test method");
    }
	
	
	abstract void disp();//abstract method
	
	
}


public class Abstract1
{

	public static void main(String[] args) 
	{
	
		System.out.println("***************************");
		
		
		Demo1 d1;//creating reference reference variable of Demo1
		
		//u can not create instance of Demo1
		//so we can access only static property because static member associated with class not instance
		
		System.out.println("k value: "+Demo1.k);
		Demo1.test();
		
		System.out.println("***************************");
	}
	
}
