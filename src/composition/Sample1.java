package composition;


/*
  
 * -->composition
 * Composition is the design technique to implement has-a relationship 
 * in classes use java inheritance or Object composition for code reuse.
 * 
 * Java composition is achieved by using instance variables that refers
 *  to other objects. 
 
 */

class compos
{

	int k=10;
	void test()
	{
		System.out.println("running test method");
	}
	
}

class demo
{
	
   double d=2.4;
   
   compos rf1=new compos();//non static object of demo1
   
   void disp()
   {
    System.out.println("running disp method");
	   
   }
	
}


public class Sample1 
{
	public static void main(String[] args)
	{
	
		System.out.println("*****************************");
		
		demo obj1=new demo();
		
		System.out.println("d value: "+obj1.d);//accessing property of demo1
		obj1.disp();
		
		System.out.println("k value: "+obj1.rf1.k);//accessing property of composition
		
		obj1.rf1.test();
		
		System.out.println("*****************************");

		
	}

	
}
