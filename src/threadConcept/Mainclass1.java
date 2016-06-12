package threadConcept;

//creating thread by extending Thread class.

//it is a sophesticated way to create thread.

class Demo1 extends Thread
{

	public void run()
	{
		
		System.out.println("printing value 1 to 10");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("i= "+i);
			
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}

public class Mainclass1
{

	public static void main(String[] args) {
		
		System.out.println("**********************************");
		
		Demo1 d1=new Demo1();
		
		d1.run();
		
		System.out.println(d1);
		
			
		System.out.println("**********************************");
		
	}	
}
