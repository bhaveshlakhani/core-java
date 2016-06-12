package keyword;

// A DATA MEMBER OF CLASS CAN BE DECLARED AS FINAL,
// A FINAL DATA MEMBER SHOULD BE INITIALIZE ANY OF THREE PLACE
//  1. AT A TIME OF DECLARATION 
//  2.USING RESPECTIVE BLOCK.
//  3.USING CONSTRUCTOR

//WE CAN NOT RE-ASSIGN VALUE OF FINAL DATA MEMBER

public class Finalkeyword 
{
	
	final int a=10;//initialize at the time of declaration
	final int b;
	final int c;
	
	
	{
	  c=13;//initializing final value in non static block
	  
	}
	
	Finalkeyword()
	{
		
		b=12;//initializing in constructor
		
	}
	
	
	public static void main(String[] args)
	{
	
		
		System.out.println("*********************");
		
		Finalkeyword f=new Finalkeyword();
		
	//	f.a=15;//error because final value can not re-assign
		
		System.out.println("a value : "+f.a);
		
		System.out.println("b value : "+f.b);
		
		System.out.println("c value : "+f.c);
		
		System.out.println("*********************");
		
	
     	}
			
		
	}

	
	
	
	


