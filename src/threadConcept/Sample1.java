package threadConcept;

//creating thread by implementing runnable interface.

class Demo22 implements Runnable
{

	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println(j);
		
		
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}	
	}
}

public class Sample1
{

	public static void main(String[] args)
	{
	System.out.println("*********************************");

	Demo22 d=new Demo22();//runnable type object
	Demo22 d1=new Demo22();
	
	Thread th1=new Thread(d);
	
	th1.start();
	//th1.run();
	
	Thread th2=new Thread(d1);
	th2.start();
	
	
	System.out.println("*********************************");	
	}	
}
