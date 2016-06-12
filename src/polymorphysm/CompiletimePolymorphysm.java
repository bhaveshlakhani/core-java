package polymorphysm;
/*
 * 
 * 
 * *-->COMPILETIME POLYMORPHYSM
 *
 * IN COMPILETIME POLYMORPHYSM METHOD DECLARATION IS BINDED TO METHOD IMPLEMENTATION
 * AT THE TIME OF  COMPILATION BY COMPILER.
 * 
 * THIS TYPE OF BINDING IS KNOWN AS STATIC BINDING OR EARLY BINDING.
 * 
 * THE BINDING DONE AT COMPILE TIME CAN NOT BE RE-BINDED.
 * 
 * -->EXAMPLE OF COMPILETIME POLYMORPHYSM
 *   ~METHOD OVERLOADING
 *   ~CONSTRUCTOR OVERLOADING
 *   ~STATIC METHOD AND FINAL METHOD
 *
 */

class Demo12
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


public class CompiletimePolymorphysm
{
	public static void main(String[] args) {
		
		System.out.println("*************************");
		
		Demo12 obj1=new Demo12();
		
		obj1.test();//calling no arg test method
		
		obj1.test(10);// calling int arg test method
		
		System.out.println("*************************");
		
		Demo12.test(12.4);//calling static test double arg method
		
		
		System.out.println("**************************");
					
	}
}
