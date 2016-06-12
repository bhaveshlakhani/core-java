package inheritance;

/*
 -->>4.HIERARCHICAL INHERITANCE

  --IN THIS TYPE OF INHERITANCE PROPERTY OF SUPERCLASS IS INHERITED  
    TO MORE THAN ONE SUB CLASS
*/

  class demo3
   {
      int k=13;
      void test()
      {
    	  System.out.println("running test method");
      }
	
   }
  
  class Sample3 extends demo3
  {
	  double d=12.5;
	  void disp()
	  {
		  System.out.println("running disp method");
	  }
	  
  }
  
  class run3 extends demo3
  {
	  boolean b=true;
	  
	  void run()
	  {
		  System.out.println("running run method");
	  }
	  
  }

public class Hierarchical
{
  public static void main(String[] args)
  {
		System.out.println("**************************");
	
		Sample3 obj1=new Sample3();
		
		//sample3 object have property of Sample3 and demo3
		 System.out.println("k value: "+obj1.k);
	     obj1.test();
		
	     System.out.println("d value: "+obj1.d);
	     obj1.disp();
	     
		System.out.println("**************************");
		
		run3 obj2=new run3();
		
		//run3 object have property of run3 and demo3
		
		System.out.println("k value: "+obj2.k);
		obj2.test();
		
		System.out.println("b value: "+obj2.b);
		obj2.run();
		
		System.out.println("**************************");
		

  }	
	
}
