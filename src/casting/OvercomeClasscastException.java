package casting;

/* 
 *-->HOW TO AVOID CLASS CAST EXCEPTION
  
 * THE CLASS CAST EXCEPTION CAN BE AVOIDED BY USING instanceof OPERATOR THIS 
 * OPERATOR WILL HELP US TO KNOW WHETHER OBJECT HAVING THE REQUIRE CLASS 
 * PROPERTY.
 * 
 */


class Demo6
{

	int k=10;
	
	void test()
	{
		System.out.println("running test method");
	}
}

class Sample6 extends Demo6
{
   
	double d=12.3;
	void disp()
	{
		System.out.println("running disp method");
	}
}

class Run6 extends Sample6
{

	boolean b=true;
	void run()
	{
		System.out.println("running run method");
	}
	
}

class start6
{
	
	void execution(Demo6 arg1)
	{
		
		System.out.println("running execution method");
		
		//using arg1 we can access Demo12 and its super class property
		
		System.out.println("k value: "+arg1.k);
		arg1.test();

		if(arg1 instanceof Sample6)
		{
			
			Sample6 rf1=(Sample6) arg1;//downcasting
			
			System.out.println("d value: "+rf1.d);
			
			rf1.disp();
			
		}
		else
		{
			
			System.out.println("object does not property of sample6 class");
			
		}
		
		
	}	
}

public class OvercomeClasscastException 
{

	public static void main(String[] args) {
		
		System.out.println("**************************");
		
		start6 st=new start6();
		
		st.execution(new Demo6());
		
		System.out.println("**************************");
				
	}

}
