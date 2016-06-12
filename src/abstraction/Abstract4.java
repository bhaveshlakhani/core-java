package abstraction;

abstract class A
{

	void test()
	{
		System.out.println("runnning test");
	}
}

class B extends A
{

	void disp()
	{
		System.out.println("running disp");
	}
	

}
public class Abstract4 
{

	public static void main(String[] args)
	{

		System.out.println("*******************************");
		
		B b=new B();
		b.test();
		b.disp();
		
		
		System.out.println("*******************************");
		
		
		
	}
	
	
	
	
}
