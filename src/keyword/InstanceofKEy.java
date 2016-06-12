package keyword;


class AB
{
	int k=10;
   
	void test()
   {
     System.out.println("running test");	
   }

}
class BC extends AB
{
	double d=12.3;
	void disp()
	{
		System.out.println("running disp");
	}
	
	
}

class CC 
{
	int c=23;
	void run()
	{
		System.out.println("running run");
	}
	
}



public class InstanceofKEy
{

 public static void main(String[] args)
 
 {
	
	 AB b=new AB();
	 CC c=new CC();

    System.out.println(c instanceof CC);
    
   
  //  System.out.println(c instanceof BB); //error because c is not instance of class BB
    
	 
	 
	 
}
}
