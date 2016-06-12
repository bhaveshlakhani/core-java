package exceptionHandling;


class Demo123
{

	void printnumber(int n,int m) throws InterruptedException
	{
		
		for(;n<=m;n++)
		{
			System.out.println(n);
			
			
			
			Thread.sleep(1000);
			
			
		}
	}
}


public class UseOfThrows
{
public static void main(String[] args) 
{

	System.out.println("****************************");
	
     Demo123 obj1=new Demo123();	
     
     try
     {
     obj1.printnumber(1, 5);
     }
     catch(InterruptedException e)
     {
    	 e.printStackTrace();
     }
	System.out.println("*****************************");
}
	
	
	
	
}