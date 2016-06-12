package thread;

public class Thread3 extends Thread{
public void run(){
	for(int i =0;i<60;i++){
		 System.out.println(Thread.currentThread().getName()+" i value:"+i);
	 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	 
	 
	 }
	public static void main(String[] args) {
		Thread3 a= new Thread3();
		a.setName("abhilash");
		a.start();
		Thread3 b = new Thread3();
		b.setName("bhavesh");
		b.start();
	}
	
}
