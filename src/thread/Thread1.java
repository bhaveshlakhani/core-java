package thread;

public class Thread1 implements Runnable{

 public synchronized void  run(){
	
	
	
	for(int i=0;i<25;i++){
		System.out.println(Thread.currentThread().getName()+" : "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
}
