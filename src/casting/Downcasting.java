package casting;

import thread.mainclass;

/*
 *  
 * -->>DOWN CASTING
 * 
 * -->CASTING SUPER CLASS TO SUB CLASS TYPE  IS KNOWN AS DOWN CASTING.
 * 
 * -->DOWNCASTING SHOULD BE DONE EXPLICITLY.
 * 
 * -->DOWN CASTING IS POSSIBLE ONLY ON THE ALREADY UPCASTED OBJECT.
 
 */



class Demo10
{

	int k=10;
	
	void test()
	{
		System.out.println("running test method");
	}
}

class Sample10 extends Demo10
{
   
	double d=12.3;
	void disp()
	{
		System.out.println("running disp method");
	}
}

class Run10 extends Sample10
{

	boolean b=true;
	void run()
	{
		System.out.println("running run method");
	}
	
}

class start10
{
	
	void execution(Demo10 arg1)
	{
		
		System.out.println("running execution method");
		
		//using arg1 we can access Demo10 and its super class property 
		
		System.out.println("k value: "+arg1.k);
		arg1.test();
		

		
		System.out.println("*************************");
		
		//now suppose we have requirement in which accessing Sample10 property without creating instance of it. 
		//so we need to do downcasting
		
		
		//upcasting
		arg1=new Sample10();//SAMPLE10 CASTED INTO DEMO10
		
		//down casting
		
		Sample10 rf1=(Sample10) arg1;//arg1 is reference of demo10 so we need to cast into Sample10
		//HERE DEMO10 IS CASTED TO SAMPLE10
		
		
		System.out.println("d value: "+rf1.d);
		rf1.disp();
		
	
	}	
}

public class Downcasting 
{
	public static void main(String[] args) 
	{
	
		start st=new start();
		
		st.execution(new Sample12());
		
		
		
	}

	
}
