package casting;

/* WHEN YOU PASS CLASS TYPE ARGUMENT IN METHOD, TO CALL THAT METHOD U MUST 
 * PASS INSTANCE OF THAT CLASS OR ITS SUB CLASS TO CALL THAT METHOD.
 * 
 * 
 * 
 */

class Demo12
{

	int k=10;
	
	void test()
	{
		System.out.println("running test method");
	}
}

class Sample12 extends Demo12
{
   
	double d=12.3;
	void disp()
	{
		System.out.println("running disp method");
	}
}

class Run12 extends Sample12
{

	boolean b=true;
	void run()
	{
		System.out.println("running run method");
	}
	
}

class start
{
	
	void execution(Sample12 arg1)
	{
		
		System.out.println("running execution method");
		
		//using arg1 we can access Sample12 and its super class property demo12
		
		System.out.println("k value: "+arg1.k);
		arg1.test();
		
		System.out.println("d value: "+arg1.d);
		arg1.disp();
	}

	
	
}

public class ClassTypeArg
{

	public static void main(String[] args)
	{
	
		System.out.println("***********************");
		
		
		start st=new start();
		
		
		//to calling execution method you need pass Sample12 instance or subclass 
		st.execution(new Sample12());
	System.out.println("**************************");
		st.execution(new Run12());
		
		
		
		
		
		
		System.out.println("***********************");
		
		
		
	}
	
	
	
	
}
