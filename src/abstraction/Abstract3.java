package abstraction;

abstract class Demo3
{

	abstract void test(int arg);
	
	abstract void disp();
	

}

//you must provide implementation of abstract method in sub class 
//or if you don't want provide implentation then you must declare subclass as abstarct


abstract class Sample3 extends Demo3
{

	void test(int arg)
	{
		
		System.out.println("running int arg test method");
	}

	
}

class Sample4 extends Sample3
{

	void disp()
	{
	
		System.out.println("running disp method");
		
	}
	
}

public class Abstract3
{

	public static void main(String[] args) 
	{
	
		System.out.println("*******************************");
		
		
         Demo3 obj1=new Sample4();
         
         
		   obj1.test(12);
		   obj1.disp();
		
		
		System.out.println("*******************************");
	}
}




