package threadConcept;


class Commonresource
{
	
	synchronized void sequence1()
	{
		Thread c1=Thread.currentThread();
		//return reference of current running thread
		
		String name=c1.getName();
		//to get the name of current thread
		
		System.out.println("printing value 1 to 10");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(name+ i);
			
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
			
			
	
	synchronized void sequence2()
	{
		Thread c1=Thread.currentThread();
		//return reference of current running thread
		
		String name=c1.getName();
		//to get the name of current thread
		
		System.out.println("printing value 10 to 1");
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(name+ i);
			
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}	
	}	
}


class Threadnumber extends Thread
{
	
	
	//creating reference
	Commonresource cr;

	//constructor
	public Threadnumber(Commonresource cr) 
	{
		
		this.cr=cr;
		
	}
	
	
  public void run()
	{
		cr.sequence1();
	}
	
}


public class SynchroNized 
{

	public static void main(String[] args)
	{

		System.out.println("*****************************");
		
		
		Commonresource cr1=new Commonresource();
		
		Threadnumber th1=new Threadnumber(cr1);
		Threadnumber th2=new Threadnumber(cr1);
		Threadnumber th3=new Threadnumber(cr1);
		
		th1.setName("bhavesh");
		th2.setName("abhi");
		th3.setName("rohit");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
		System.out.println("*****************************");
	}
	
}
