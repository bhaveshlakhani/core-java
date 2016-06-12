package constructor;

/*--------------------------------------------------------------------------
 * -->>                    CONSTRUCTOR CALLING
 *-------------------------------------------------------------------------- 
 *  WHENEVER SUBCLASS INHERIT PROPRTY OF SUPERCLASS, SUBCLASS CONSTRUCTOR 
 *  SHOULD MAKE A  CALL TO THE SUPERCLASS CONSTRUCTOR EITHER IMPLICIT
 *  OR EXPLICIT CALL IS MADE BY SUPER() STATEMENT.

/*
 
   SUPER() STATEMENT
   
 -->USED TO CALL SUPER CLASS CONSTRUCTOR
 
 -->USED INSIDE CONSTRUTOR BODY ONLY

 -->MUST FIRST STATEMENT OF CONSTRUCTOR

 -->MULTIPLE SUPER STATEMENT NOT ALLOWED

*/



//IF COMPILER MAKES CALL THAN ITS CALLED IMPLICIT CALL

// IF PROGRAMER MAKES CALL TO SUPER CLASS CONSTRUCTOR USING SUPER() STATEMENT
// THAN ITS CALLED EXPLICIT CALL



// this is a example of implicit call made by compiler

class demo3
{

	int k;
	
	demo3()
	{
		k=10;
		System.out.println("running demo3 constructor");
		
	}
}	
class Sample3 extends demo3
{

	double d;
	Sample3()
	{
		d=12.3;
		System.out.println("running Sample3 constructor");
	}

	
}

class Run3 extends Sample3
{
   
	Run3()
	{
	
		System.out.println("running run3 constructor");
	}
	
}


public  class ConstructorCall 
{

	public static void main(String[] args)
	{

     System.out.println("*****************************");
     
     Run3 obj1=new Run3();//implicit call made by compiler
  	
     System.out.println("*****************************");		
	
	}
	
	
	
}