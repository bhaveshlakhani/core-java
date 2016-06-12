package exceptionHandling;

class Demo12
{

	void printnumber(int n,int m)
	{
		
		for(;n<=m;n++)
		{
			System.out.println(n);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


public class CheckedException 
{
public static void main(String[] args) 
{

	System.out.println("****************************");
	
     Demo12 obj1=new Demo12();	
	
     obj1.printnumber(1, 5);
	
	System.out.println("*****************************");
}
	
	
	
	
}
