package thread;

public class thread4 implements Runnable{

	public void run(){
		for (int i = 0; i < 30; i++) {
			Thread.currentThread().setName("abhilash");
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
