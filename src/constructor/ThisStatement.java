package constructor;
/*
   constructor of class call the another constructor of same class by 
   this() statement

/*
 * 
 * -->this() Statement
  
 * this() statement is first statement of constructor
 * and only one this() statement is allowed
 * recursive constructor call is not allowed
 * in constructor either this() allowed or either super() but not both
 
 */

class A
{

	A()
	{
		this(20);
		System.out.println("running no arg constructor ");
	}
	
	A(int a)
	{
		this(10.5);
		System.out.println("running int arg constructor");
		
	}
	
	A(double arg)
	{
		
		System.out.println("running double arg constructor");
		
	}
	
}


public class ThisStatement
{
	
public static void main(String[] args)
{

	System.out.println("*************************");
	
	
	A a=new A();
	
	
	
	System.out.println("*************************");

	
	
	
}
	
	
	
}
