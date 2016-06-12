package thread;

public class Thread5 extends Thread {

	public void run(){
		
		System.out.println(Thread.currentThread().getName()+" running");
		
		notify();
	}
	
	
}
