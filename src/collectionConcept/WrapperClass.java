package collectionConcept;
/*
 * -->>WRAPPER CLASS..
 * 
 * --IN COLLECTION  STORE ONLY OBJECT TYPE TYPE DATA.BUT IF YOU WANT TO STORE
 *   DATA TYPE THAN WRAPPER CLASS IS USED. 
 * 
 * --FOR EACH DYPE THERE ARE A WRAPPER CLASS AVAILABLE.
 * 
 *   
 *        DATA TYPE          WRAPPER CLASS
 *        
 *        int                 Integer
 *        
 *        double              Double
 * 
 *        char                Char
 * 
 *        byte                Byte
 * 
 * 
 * 
 * 
 * 
 */

public class WrapperClass
{

	public static void main(String[] args)
	{
	
		//data member
		int x1=12;
		double d1=12.3;
		
		System.out.println("*******************************");
		
		Integer i=new Integer(x1);//data type is converted into object type
		System.out.println(i);
		
		
		
		Double d=new Double(d1);////data type is converted into object type
		System.out.println(d);
	
		
		System.out.println("******************************");
			
		Integer a=x1;//auto boxing
		
		System.out.println(a);
	
		System.out.println("******************************");
		
	//	int x1=(Integer)i.get(0);
		
	
	}
}
