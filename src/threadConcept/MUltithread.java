package threadConcept;
//multiple thread performing same operation.

class sequence extends Thread
{
	
	public void run()
	{
	
	Thread c1=Thread.currentThread();
	
	String name=c1.getName();
	//to get the name of current thread
	
	System.out.println("printint from 1 to 10");
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(name+ i);
	
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}	
}

public class MUltithread 
{
public static void main(String[] args)
{

	System.out.println("************************");
	
	sequence s1=new sequence();
	sequence s2=new sequence();
	
	s1.setName("s1.thread1");
	s2.setName("s2.thread2");
	
	s1.start();
	s2.start();
	
	System.out.println("************************");
}
	
}
