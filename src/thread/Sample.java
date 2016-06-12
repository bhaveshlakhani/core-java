package thread;

class Demo1 implements Runnable
{

	public void run()
	{
		
		System.out.println("printing value 1 to 25");
		
		for(int i=1;i<=25;i++)
		{
			System.out.println("i="+i);
		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			
			{
			
				e.printStackTrace();
			}
		}
		
		
	}

}
class Demo2 implements Runnable
{
	
	
	public void run(){
		Thread t = Thread.currentThread();
		String a = t.getName();
		for (int i = 39; i<56; i++) {
			System.out.println(a+":"+i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	
}











public class Sample {

	public static void main(String[] args) 
	{
	
		
		
	 Demo1 d=new Demo1();
		Demo2 d1 = new Demo2();
		Thread th1=new Thread(d);
		
		th1.start();
Thread t2 = new Thread(d1);
System.out.println("thread id is :"+t2.getId());
System.out.println("thread name is :"+t2.getName());
System.out.println("thread priority :"+t2.getPriority());
t2.setPriority(10);
t2.start();


Thread t3 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String a = t.getName();
		// TODO Auto-generated method stub
		for (int i = 0; i <19; i++) {
			System.out.println(a+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
});
		t3.start();
		
		
	}
}
