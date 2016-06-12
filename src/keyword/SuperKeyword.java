package keyword;

// A SUPER KEYWORD USED TO REFER SUPERCLASS PROPERTY FROM SUB CLASS
//IT IS USED IN THE NON STATTIC CONTEXT ONLY

class demo1
{
int k=10;	

}
class Sample extends demo1

 {
   int k=12;

    void disp()
    {

	System.out.println(this.k);//referring current class property
	
	System.out.println(super.k);//referring super class property from subclass
	
    }
	
}	
	
	
public class SuperKeyword 
{
	public static void main(String[] args)
	
	{
		System.out.println("********************");
		
		Sample obj1=new Sample();
		
		obj1.disp();
		
		System.out.println("*********************");
		
	}
	
	
	
	

}
