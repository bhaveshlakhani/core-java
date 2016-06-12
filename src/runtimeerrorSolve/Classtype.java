package runtimeerrorSolve;

/*-->CLASS CAST EXCEPTION
 * 
 * IT IS EXCEPTION THROWN BY JVM DURING CLASS CASTING.
 * IT IS TYPE OF RUNTIME EXCEPTION.
 * 
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

	}

}
