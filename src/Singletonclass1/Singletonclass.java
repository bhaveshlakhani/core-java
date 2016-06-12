package Singletonclass1;
/*
 * -->ENCAPSULATION
 * 
 * --ENCAPSULATION IS ONE OF THE OOPS CONCEPT WHICH IS USED 
 *   TO PROTECT DATA MEMBER
 * 
 * --THE MEMBER ARE BINDED BY EITHER TO CLASS OR INTERFACE.
 * 
 * --CLASS AND INTERFACE CAN PROVIDE ENCAPSULATION.
 * 
 * --THE MEMBER CAN BE RESTRICTED IN ACCESS USING THE ACCESS SPECIFIER. 
 
 */

class Sample
{

	private static Sample a;
	int k=10;
	
	private Sample()
	{
		System.out.println("this is a private constructor so u can not create instance outside the class");
	}
  
	void test()
	{
		System.out.println("running test method");
	}
	

	static Sample getinstance()
	{
		if(a==null)
		{
			a=new Sample();
		}
		
		
		return a;
	}
	
}

public class Singletonclass
{

public static void main(String[] args)
{

	System.out.println("******************************");
	
	
//	Sample obj1=new Sample();because constructor is declare as private
	
	Sample a =Sample.getinstance();
	System.out.println(a.k);
	
	Sample b=Sample.getinstance();
	
    System.out.println(b.k);
	
	
	System.out.println("******************************");
 }

}
