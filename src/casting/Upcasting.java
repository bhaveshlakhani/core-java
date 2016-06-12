package casting;

/*
 
 * -->>UPCASTING
 * 
 * -->CASTING SUB CLASS TO THE SUPER CLASS TYPE IS KNOWN AS UPCASTING
 * 
 * -->UPCASTING CAN BE DONE EITHER IMPLICIT OR EXPLICIT.
 * 
 * -->IMPLICIT CASTING DONE BY COMPILER.
 
 */

class Demo1
{

	int k=10;
	
	void test()
	{
		System.out.println("running test method");
	}
}

class Sample1 extends Demo1
{
   
	double d=12.3;
	void disp()
	{
		System.out.println("running disp method");
	}
}

class Run1 extends Sample1
{

	boolean b=true;
	void run()
	{
		System.out.println("running run method");
	}
	
}

public class Upcasting 
{
  public static void main(String[] args)
  {
	
	  System.out.println("********************************");
	  
	  
	  Demo1 obj1=new Run1();//up casting
	  //using obj1 you can access demo1 property and its super class
	  
	  System.out.println("k value: "+obj1.k);
	  obj1.test();
	  
	  //obj1.disp();//error because its subclass property
	  
	  System.out.println("********************************");
	  
	  Sample1 obj2=new Run1();//up casting
	  //using obj2 you can access property of Sample1 and its super class DeMO1
	  System.out.println("k value: "+obj1.k);
	  obj1.test();
	  
	  System.out.println("d value: "+obj2.d);
	  obj2.disp();
	  
	  System.out.println("********************************");
}
	
	
}
