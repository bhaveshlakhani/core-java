package constructor;

public class OverLoadconstructor {

	int a;
	
	
	public OverLoadconstructor() {
		System.out.println(a);
	}
	
	OverLoadconstructor(int a){
		this();
		this.a=a;
		System.out.println(a);
	}
}


class mainclass{
	public static void main(String[] args) {
		
		OverLoadconstructor a = new OverLoadconstructor(28);
		
		
	}
}