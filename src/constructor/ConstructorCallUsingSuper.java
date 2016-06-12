package constructor;

//this is example of explicit constructor calling made by programmer using super()

class demo12
{
  
	demo12(int k)
	{
		
		System.out.println("running demo12 int arg constructor");
		
	}
	
}

class Sample12 extends demo12
{
	
   Sample12(double d)
   {
	   super(25);// call made to int arg constructor
	   
	   System.out.println("running SAmple12 double arg constructor");
	   
   }
	
}

class Run12 extends Sample12
{

	Run12()
	{
		super(2.4); //call made to double arg constructor
		System.out.println("running Run12 constructor");
		
	}
	
}


public class ConstructorCallUsingSuper 

{
	public static void main(String[] args)
	{
	
		System.out.println("*****************************");
		
		
		Run12 obj=new Run12();
		
		
		System.out.println("*****************************");
	
	}
}
