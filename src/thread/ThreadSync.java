package thread;

public class ThreadSync {

public static void main(String[] args) {
	
	Thread1 e = new Thread1();
	Thread t  = new Thread(e);
	t.start();

	Thread t2 = new Thread(e);
	t2.start();
	
	
}
	
	
	
}
