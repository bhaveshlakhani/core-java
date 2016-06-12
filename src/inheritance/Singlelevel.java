package inheritance;

/*
 * -->>INHERITANCE
 * 
-- CLASS ACUIRING PROPERTY OF ANOTHER CLASS IS KNOWN AS INHERITANCE.

--CLASS CAN INHERIT FROM ANY CLASS USING EXTENDS KEYWORD

--> THERE ARE FOUR TYPES OF INHERITANCE

 1.SINGLE LEVEL INHERITANCE
--> IN SINGLE LEVEL INHERITANCE SUBCLASS INHERIT FROM ONLY ONE SUPER CLASS 
    
 

 2.MULTILEVEL INHERITANCE
 -->SUBCLASS INHERIT FROM SUPER CLASS WHICH INHERIT FROM ANOTHER SUPERCLASS

 3.MULTIPLE INHERITANCE(JAVA DOES  NOT SUPPORT MULTIPLE INHERITANCE)
 -->SUBCLASS INHERIT MORE THAN ONE SUPER CLASS

 4.HIERARCHICAL INHERITANCE
 -->IN THIS TYPE OF INHERITANCE PROPERTY OF SUPERCLASS IS INHERITED TO 
    MORE THAN ONE SUB CLASS

------------------------------------------------------------------------------------------------

 ------>>> WHY JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE.
  
 * To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

 *Consider a scenario where A, B and C are three classes. 
 *The C class inherits A and B classes. If A and B classes have same method
 *and you call it from child class object, 
 *there will be ambiguity to call method of A or B class.
 * 
 */
class demo1
{
int k=12;

  void test()
   {
     System.out.println("running test method");	
   }
	
}

class Sample1 extends demo1
{
  double d=12.4;

  void disp()
  {
    System.out.println("running disp method");	
  }
	
}



public class Singlelevel 
{
	public static void main(String[] args)
	{
		
    System.out.println("**********************");	
		
    Sample1 obj1=new Sample1();//now this object have property of both class
    //so using obj1 you can refer property of both class
    
    System.out.println("k value: "+obj1.k);
    obj1.test();
    
    System.out.println("d value: "+obj1.d);
    obj1.disp();
    
   
    System.out.println("**********************");	
	}
	
}
