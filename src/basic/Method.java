package basic;
/*
 ----------------------------------------------------------------------------
 -->>                             METHOD
 ----------------------------------------------------------------------------
 
--METHOD ARE USED TO PERFORM OPERATION
 
 SYNTAX-
    
    MODIFIER  RETURNTYPE METHODNAME(ARGUMENT);
 
 ADVANTAGE-
 
  --RE-USABILITY
  --DECOMPOSITION
  --YOUR CODE LOOKS GOOD.
 
 METHOD ARGUMENT-
 --USED TO PASS VALUE IN METHOD
 --YOU CAN DEFINE MULTIPLE ARGUMENT
 
 
 
 
 
*/
public class Method
{
	static int b=13; //global
	

	public int k=12;//non static data member
	
	static void test()
	{
	     final int a=12;  //local variable
	     
		System.out.println("running test method");
		
	}
	

	public static void main(String[] args)
	{
	System.out.println("*************************");
		
	System.out.println("b value"+b);
	
	
	test(); //calling static method test of same class
	
	System.out.println("*************************");
		
		
		
	}

}
