package inheritance;

//2.MULTILEVEL INHERITANCE

//  --> IN THIS TYPE OF INHERITANCE SUBCLASS INHERIT FROM SUPER CLASS 
//      WHICH INHERIT FROM ANOTHER SUPERCLASS

  class demo2
  {
	  int k=10;
	  void test()
	  {
		  System.out.println("running test method");
	  }
	  
  }
  
  class Sample2 extends demo2
  {
	  double d=12.4;
	  void disp()
	  {
		  System.out.println("running disp method");
	  }
	 
  }
  
 class Run2 extends Sample2
 {
	 boolean b=true;
	 void run()
	 {
		 System.out.println("running run method");
		 
	 }
	 
 }
 
public class MultiLevel
{
public static void main(String[] args)
{
	
	System.out.println("*****************************");

	
	Run2 r=new Run2();
	
	//run2 class have property of all class
	
	System.out.println("k value: "+r.k);
	r.test();
	
	System.out.println("d value: "+r.d);
	r.disp();
	
	System.out.println("b value: "+r.b);
	r.run();
	
	
	System.out.println("*****************************");

	
  }
		
}
