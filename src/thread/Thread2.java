package thread;

public class Thread2 {
public static void main(String[] args) {
	
	
	
	Thread t = Thread.currentThread();
	t.setName("abhilashshah");
	for (int i = 1; i < 50; i++) {
		System.out.println(t.getName()+"i"+i);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
}
}
