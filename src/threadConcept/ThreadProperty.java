package threadConcept;

class sequence1 extends Thread
{
	
	public void run()
	{
	
	Thread c1=Thread.currentThread();
	//to get the current thread
	
	String name=c1.getName();
	//to get the name of current thread
	
	System.out.println("printint from 1 to 10");
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(name+ i);
	
	  try {
		  
		Thread.sleep(1000);
          } 
	  catch (InterruptedException e) 
	  {
		
		e.printStackTrace();
	  }
	}
	}	
}


public class ThreadProperty 
{
public static void main(String[] args)
{

	System.out.println("**********************");
	
	sequence1 s1=new sequence1();
	
	//to get properties of thread
	
	System.out.println("thread id: "+s1.getId());
	
	System.out.println("thread name: "+s1.getName());
	
	System.out.println("thread priority: "+s1.getPriority());
	
	
	//set properties of thread
	s1.setName("bhavesh");
	s1.setPriority(8);
	
	System.out.println("******************************");
	
    System.out.println("thread id: "+s1.getId());
	
	System.out.println("thread name: "+s1.getName());
	
	System.out.println("thread priority: "+s1.getPriority());
	
	System.out.println("******************************");
}
}
