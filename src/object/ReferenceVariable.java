package object;
/*
 * -->>REFERENCE VARIABLE
 * 
 *  --REFERENCE VARIABLE IS A SPECIAL VARIABLE IN JAVA IT IS USED TO REFER AN
 *    INSTANCE CREATED IN JVM.
 *    
 *  --REFERENCE VARIABLE SHOULD BE DECLARE BY CLASS TYPE
 *  
 *  --WE CAN ASSIGN EITHER NULL OR INSTANCE OF CLASS.
 *    IF NULL IS ASSIGN WE CAN NOT USE THE PROPERTY.
 *     
 */

class demo5
{
	int a=10;
	double b=10.3;
	
	void test()
	{
	
		 System.out.println("running test method");
		 
		
	}
	 }

public class ReferenceVariable 
{
	
   public static void main(String[] args)
 
      {
              demo5 obj1 =   new demo5();
 
  
            // reference variable value either null or instance of class
  
          //  obj1=null; //assigning null value to reference variable
   
             System.out.println("a value = "+obj1.a);
  
             System.out.println("b value = "+obj1.b);
  
           obj1.test();
  
  
      }
}

