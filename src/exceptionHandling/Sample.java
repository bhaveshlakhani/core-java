package exceptionHandling;


/*--->>Exception
  
   Exception is an abnormal condition which occurs during the execution of 
   a program and disrupts normal flow of the program. This exception must be 
   handled properly. If it is not handled, program will be terminated 
   abruptly.
 
 --->> What is exception handling

   Exception Handling is a mechanism to handle runtime errors such as 
   ClassNotFound, IO, SQL, Remote etc.
 
 */

public class Sample 
{

	public static void main(String[] args)
	{
	
		System.out.println("****************************");
		
		int a=23;
		int b=0;
		
		
		try
		{
		   int c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("exception handled succcessfully");
		}
		
		
		System.out.println("**********************************");
		
	}
}
