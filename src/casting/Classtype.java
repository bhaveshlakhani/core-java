package casting;

/*-->CLASS CAST EXCEPTION
 *--------------------------------------------------------------------------------------- 
 * IT IS EXCEPTION THROWN BY JVM DURING CLASS CASTING.
 * IT IS TYPE OF RUNTIME EXCEPTION.
 * 
 * 
 * -->WHEN CLASS CAST EXCEPTION OCCUR
 * --------------------------------------------------------------------------------------
 * WHENEVER WE TRY TO PERFORM CLASS CASTING FROM ONE CLASS TO ANOTHER CLASS TYPE,IF
 * OBJECT DOES NOT HAVE PROPERTY THE CLASS TO WHICH HAVE TO CAST,AT THAT TIME THIS 
 * EXCEPTION OCCUR.
 * 
 * 
 * 
 * -->WHY IT IS NOT DETECTED AT COMPILE TIME.
 * -------------------------------------------------------------------------------------
 * DURING COMPILATION THE COMPILER ONLY CHECK ONLY CHECK RELATIONSHIP BETWWEEN 
 * CLASSES AND OBJECT.BUT IT WILL NOT CHECK THE PROPERTY OF OBJECT.
 * 
 * 
 * 
 * --> HOW TO AVOID CLASS CAST EXCEPTION
 * -------------------------------------------------------------------------------------1
 * THE CLASS CAST EXCEPTION CAN BE AVOIDED BY USING instanceof OPERATOR THIS 
 * OPERATOR WILL HELP US1 TO KNOW WHETHER OBJECT HAVING THE REQUIRE CLASS PROPERTY
 */




class Demo2
{
	void test()
	{
		 System.out.println("******************");
	}
	
}

class Sample2 extends Demo2
    {
   
	  void test1()
	  {
		System.out.println("********************");
	  }
	
	
    }



public class Classtype {

	public static void main(String[] args) {
		
		Demo2 rf1=new Sample2();//implicit
		
		
		Sample2 rf2=(Sample2)new Demo2();//explicit
		//Exception because Demo2 does not have property of sample2

	}

}
