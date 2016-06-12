package casting;

/*-->>CLASS TYPE CASTING
 * 
 * -->CASTING CLASS TYPE TO ANOTHER CLASS TYPE IS KNOWN AS CLASS TYPE CASTING.
 * 
 * -->THE CLASS TYPE CASTING DONE BY FOLLOWING CRITERIA
 * 
 *    1.CLASSES MUST HAVE IS A RELATIONSHIP(INHERITANCE)
 *    2.CLASS WHICH WE ARE TRYING TO CAST MUST HAVE A PRPPERTY OF CLASS WE HAVE TRYING TO CAST
 *  
 *    
 *   -->>CLASS CASTING ACHIEVE BY TWO TYPE
 *        1.UPCASTING
 *        2.DOWNCASTING
 * 
 * -->>UPCASTING
 * 
 * -->CASTING SUB CLASS TO THE SUPER CLASS TYPE IS KNOWN AS UPCASTING
 * 
 * -->UPCASTING CAN BE DONE EITHER IMPLICIT OR EXPLICIT.
 * 
 * -->IMPLICIT CASTING DONE BY COMPILER.
 * 
 * 
 * 
 * -->>DOWN CASTING
 * 
 * -->CASTING SUPER CLASS TO SUB CLASS TYPE  IS KNOWN AS DOWN CASTING.
 * 
 * -->DOWNCASTING SHOULD BE DONE EXPLICITLY.
 * 
 * -->DOWN CASTING IS POSSIBLE ONLY ON THE ALREADY UPCASTED OBJECT.
 * 
 * 
 * 
 */

class A
{

	void test()
	
	{
		System.out.println("running test method");
	}
	
}

class B extends A
{

	void disp()
	{
		
		System.out.println("running disp method");
	}
	
}

public class Classtypecasting
{

	public static void main(String[] args) {
		
		System.out.println("*********************************");
		

		A a=new A();//type matching
		
		a.test();
		
		A b=new B(); //up casting
		
		b.test();
		
		//b.disp();//error 
		
		B c=(B)new A();//down casting done explicitly
		
		//it will give an error class cast Exception because object A does not have property of B
		
		
		
		
		System.out.println("*********************************");
	}
	
	
	
	
}
