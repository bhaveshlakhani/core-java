package javaLibraries;

class A
{
	void test()
	{
		System.out.println("running test");
	}
}

class B extends A
{

	String tostring()
	{
	
		System.out.println("this is a overridden tostring method");
		
		return "bhavesh";
	}
	
	
}


public class ToStringmethod 
{

	public static void main(String[] args) {
		System.out.println("**************************");
		
		B a=new B();
		
		a.tostring();
		
		
		
		System.out.println("***************************");
	}
}
