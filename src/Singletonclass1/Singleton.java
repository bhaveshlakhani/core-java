package Singletonclass1;


/*-->SINGLETON CLASS
 * 
 * SINGLETON CLASS IS AS ONE OF THE DESIGN PATTERN
 *   1.MAKE CONSTRUCTOR PRIVATE
 *      --RESTRICTING OBJECT CREATION
 *  
 *   2.STATIC METHOD
 *      --TO GET INSTANCE METHOD
 * 
 * 
 * -->SINGLETON CLASS IS A DESIGN PATTERN WHICH IS USED TO DESIGN THE CLASS
 *    SUCH A WAY THAT CLASS PRODUCE ONLY ONE INSTANCE ONLY GIVEN POINT OF TIME.
 * 
 * -->WE  CAN NOT CREATE MORE THAN ONE INSTANCE OF SINGLETON CLASS.
 * 
 * -->IN SINGLETON CLASS DESIGN
 *     --PRIVATE CONSTRUCTOR
 *     --PUBLIC STATIC METHOD WHICH IS RESPONSIBLE TO RETURN INSTANCE OF ITS OWN CLASS
 * 
 * -->THE STATIC METHOD SHOULD HAVE NECESSARY LOGIC TO CREATE ONLY ONE INSTANCE.
 * 
 * 
 * 
 */

class Calculator
{
	private static int count;
    private static Calculator ref1;
    
	private Calculator()
	{
		
		System.out.println("creating calculator instance");
		count++;
	}
	
	
	void devide(int n1,int n2)
	{
		
		System.out.println("deviding "+n1 +" by "+n2);
		int res=n1/n2;
		System.out.println("result is: "+res);
		
	}
	
	static Calculator getinstance()
	{
	
		if(count==0)
	
		{
			
			ref1=new Calculator();	
	
		}
	
	return ref1;
		
	
	}
	
	
}

public class Singleton 
{

	public static void main(String[] args) 
	{
	
		System.out.println("************************");
		
		
		Calculator calc1=Calculator.getinstance();
	
		calc1.devide(24, 6);
		
		
		System.out.println("************************");
		
		
	}
	
	
}
