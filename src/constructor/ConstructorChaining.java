package constructor;

/*
 -->CONSTRUCTOR CHAINING.
 
   CONSTRUCTOR CHAINING IS PHENOMENON WHICH TAKE PLACE DURING INHERITANCE 
   IN WHICH SUB CLASS CONSTRUCTOR MAKE A CALL TO SUPER CLASS CONSTRUCTOR,
   SUPER CLASS CONSCTRUCTOR CALL TO ITS SUPER CLASS CONSTRUCTOR.

   constructor chaining happen either implicit or explicit
  
 */

class demo33
{

	int k;
	
	demo33()
	{
		k=10;
		System.out.println("running demo33 constructor");
		
	}
}	
class Sample33 extends demo33
{

	double d;
	Sample33()
	{
		d=12.3;
		System.out.println("running Sample33 constructor");
	}

	
}

class Run33 extends Sample33
{
   
	Run33()
	{
	
		System.out.println("running run33 constructor");
	}
	
}


public  class ConstructorChaining 
{

	public static void main(String[] args)
	{

     System.out.println("*****************************");
     
     Run3 obj1=new Run3();//implicit call made by compiler
  	
     System.out.println("*****************************");		
	
	}
	
}

