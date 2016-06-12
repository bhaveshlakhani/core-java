package interfaceConcept;

public interface SuperInterface 
{
   
	void test(int arg1);
	
	
}

interface Demo2 extends SuperInterface
{

	void disp(int arg2);
	
}

class Sample2 implements Demo2
{
	
	public void test(int arg1)
	{
		
		System.out.println("running test(int) method");
		System.out.println("arg1 value: "+arg1);
	}
	
	public void disp(int arg2)
	
	{
		System.out.println("running disp(int) method");
		System.out.println("arg2 value: "+arg2);
	}
	
}

class Mainclass2
{
	public static void main(String[] args)
	{
	
		System.out.println("************************");
		
		Sample2 obj1=new Sample2();
		
		obj1.test(10);
		obj1.disp(20);
		
	
		System.out.println("*************************");
	}
	
	

}
