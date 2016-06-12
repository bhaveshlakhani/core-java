package exceptionHandling;

public class NestedTry 
{

	public static void main(String[] args)
	{
	
		System.out.println("****************************");
		
		int a=23;
		int b=0;
		
		
		try
		{
			int k=12;
			
			try
			{
			
		       int x[]=new int[5];
		       
		       x[7]=12;
		   
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("exception cought in inner ");
			}
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled outer side");
		}
		
		System.out.println("*************************************");
	}
		
		
	}


