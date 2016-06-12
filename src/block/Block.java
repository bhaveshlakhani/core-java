package block;


//IN JAVA THERE ARE A TWO TYPES OF BLOCK 1.STATIC 2.NON STATIC 

/*-->Static block.
 * 
 * --STATIC BLOCK USED INITIALIZE STATIC DATA MEMBER.
 * 
 * --STATIC BLOCK ALAWAYS EXECUTED BEFORE MAIN METHOD.
 * 
 * --AT THE TIME OF CLASS LOADING JVM CHECK FOR STATIC BLOCK IF PRESENT THAN JVM EXECUTE IT.
 * 
 * --IF MORE THAN ONE STATIC BLOCK AVAILABLE THAN JVM EXUCUTE SEQUENTIALLY.
 * 
 * 
 * -->NON STATIC BLOCK.
 * 
 * --USED TO INITIALIZE NON STATIC DATA MEMBER.
 * 
 * --NON STATIC BLOCK EXECUTE EACH TIME WHEN OBJECT IS CREATED. 
 * 
 */


class Blockconcept

{
	
	static double W;
	int c=11;
	
	
	//non static block
	
	{
		
		W=123;//overwrite value of w in non static
		System.out.println("this is non static block");
		
	}
	
	
	
	
	void test()
	{
		
		System.out.println("running test method of Blockconcept");
	}
	
	static
	{
		// c=11; // error because it c is non static data member
		W=12.55;
		double d=12.4;
		final int a=12;
		System.out.println("this is static block Blockconcept");
		System.out.println("static block is used to initialize static member of class");
		
	}
	
}
public class Block 
{

	static
	{
		System.out.println("this is a static block of main class");	
	}
	
	
	public static void main(String[] args) 
	{
		
	System.out.println("******************************");
	
	Blockconcept x=new Blockconcept();//blockconcept class is loaded
	
	Blockconcept x1=new Blockconcept();// creating second instance
	
	System.out.println("w value"+x.W);
	
	//System.out.println("d value "+x.d);//error because d is local variable
	
	
	
	
	System.out.println("**************************");
		
		
	}

}
