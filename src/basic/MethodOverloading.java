package basic;

/*
  <-->METHOD OVERLOADING
  
  -->IN A CLASS DEFINING MULTIPLE METHOD WITH A SAME NAME AND DIFFRENT PARAMETER IS KNOWN AS
     METHOD OVERLOADING
 
  -->PARAMETER SHOULD DIFFER EITHER IN TERMS OF PARAMETER TYPE OR PARAMETER LENGTH     
 
  --> IN A CLASS WE CAN OVERLOAD BOTH STATIC AND NON STATIC METHOD
  
  -->THE OVERLOADED METHOD ARE INVOLKED BASED ON THE ARGUMENT
  
  -->ANY TWO METHOD HAVING SAME NAME SHOULD NOT BE MATCH OF IN TERMS OF ARGUMENT
  
  -->METHOD OVERLOADING IS USED TO ACHIEVE COMPILE TIME POLYMORPHYSM
  
  -->>WHEN DEVOLOPING APPLICATION IF WE COME ACROSS AN OPERATION WHICH HAS TO DONE
      TO THE DIFFRENT PARAMETER THAN WE GO FOR METHOD OVERLOADING.
  
 */

class Demo1
{

	void test()
	
	{
		
		System.out.println("running no arg test method");
	}
	
	void test(int arg)
	{
		
		System.out.println("running int arg test method");
		
	}
    
	static void test(double arg1)//static method
	{
		
		System.out.println("running double arg static test method");
	}
	
	
}


public class MethodOverloading
{
	public static void main(String[] args) {
		
		System.out.println("*************************");
		
		Demo1 obj1=new Demo1();
		
		obj1.test();//calling no arg test method
		
		obj1.test(10);// calling int arg test method
		
		System.out.println("*************************");
		
		Demo1.test(12.4);//calling static test double arg method
		
		
		System.out.println("**************************");
					
	}
}
