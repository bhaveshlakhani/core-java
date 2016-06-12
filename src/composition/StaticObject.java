package composition;


class Demo1
{
	  
	int k=12;
	
	void test()
	{
		
		System.out.println("running test method");
	}

}

class Sample
{
 
	static Demo1 rf1=new Demo1();// creating static object
	
	void disp()
	{
		System.out.println("running disp method");
	}
	
}

public class StaticObject
{

	public static void main(String[] args)
	{
	
		System.out.println("*****************************");
		
		
		System.out.println("k value: "+Sample.rf1.k);
		
		Sample.rf1.test();
		
		System.out.println("*****************************");
		
	}
	
	
}
