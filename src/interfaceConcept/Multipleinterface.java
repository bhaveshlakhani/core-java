package interfaceConcept;
/*
 *-->JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE.
 *   BUT IT SUPPORT MULTIPLE INTERFACE
 * 
 * ``
 * -->INTERFACE CONCEPT
 *
 * THE METHOD OF INTERFACE SHOULD BE IMPLEMENTED IN A CLASS.
 *
 * A CLASS CAN IMPLEMENT AN INTERFACE BY USING INTERFACE KEYWORD.
 * 
 * WHENEVER CLASS IMPLEMENT INTERFACE THE CLASS MUST PROVIDE IMPLEMENTATION
 * TO ALL INHERITED ABSTARCT METHOD OF INTERFACE OTHERWISE THE CLASS SHOULD 
 * BE DECLARE AS ABSTRACT.
 * 
 * THE CLASS CAN IMPLEMENT ANY NUMBER OF INTERFACES.
 * 
 * INTERFACE CAN HAVE SUPER INTERFACE BUT CAN NOT HAVE SUPER CLASS.
 *
 
 */

public interface Multipleinterface
{

	void test(int arg1);
}

interface Demo3
{

	void disp(int arg2);
	
}

class Sample3 implements Multipleinterface,Demo3
{
	
	public void test(int arg1)
	{
		
		System.out.println("running test(int) method");
		System.out.println("arg1 value: "+arg1);
	}
	
	public void disp(int arg2)
	
	{
		System.out.println("running disp(int) method");
		System.out.println("arg2 value: "+arg2);
	}
	
}

class Mainclass3
{
	public static void main(String[] args)
	{
	
		System.out.println("************************");
		
		Sample3 obj1=new Sample3();
		
		obj1.test(10);
		obj1.disp(20);
		
	
		System.out.println("*************************");
	}
	
	
}
