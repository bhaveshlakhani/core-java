package constructor;


//THIS IS A EXAMPLE OF DEFAULT CONSTRUCTOR
//EVERY CLASS HAS A CONSCTRUCTOR
//IF USER DOES NOT DEFINE ANY CONSTRUCTOR THEN COMPILER AUTOMATICALLY DEFINE dEFAULT CONSTRUCTOR


class Sample2
 {
   
	int k=12;
	
	double d;
	
 /*	
   this is a default constructor it defines automatically by compiler and it initialize default value value
   
   Sample2()
	{
		d=0;
	}
	*/
 }






public class DefaultC {

	
	public static void main(String[] args)
	{
	System.out.println("**************************");	
	
	Sample2  obj1=new Sample2();
	
	System.out.println("k value  "+obj1.k);
	

	System.out.println("d value  "+obj1.d);
	
    System.out.println("above d value initialize by compiler");	
	

	System.out.println("**************************");	

     
		
	}

}
