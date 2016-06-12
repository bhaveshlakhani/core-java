package stringclass;

/*
 * -->STRING CLASS
 * 
 * --DEFINING STRING AS CLASS,DEFINING JAVA.LANG PACKAGE WHICH IS USED TO
 *   STORE STRING VALUE.
 * 
 * -->IT IS A FINAL CLASS.
 * 
 * --> IT IS IMMUTABLE CLASS.
 *   --MEANS ONCE YOU CREATE OBJECT YOU CAN NOT CHANGE STATE OF OBJECT. 
 * 
 * -->IT IS A THREAD SAFE CLASS.
 *    --SINGLE THREAD TO RUN
 * 
 * -->STRING CLASS IMPLEMENT COMPARABLE INTERFACE.HENCE STRING OBJECT CAN BE
 *    SORTED.
 *    
 * -->STRING HAS A OVERLOADED CONSTRUCTOR
 *    --NO ARG CONSTRUCTOR
 *    --STRING TYPE ARG CONSTRUCTOR
 *    --CHAR ARRAY TYPE
 * 
 * -->IN STRING CLASS FOLLOWING METHOD OF OBJECT CLASS IS OVERRIDE.
 *     --tostring()
 *     --hashcode()
 *     --equals(object o)
 * 
 * -->STRING CLASS CAN BE CREATED USING
 *      1.USING NEW OPERATOR
 *      2.WITHOUT USE OF NEW OPERATOR.
 *      
 *      
 * -->>HOW MEMORY ALLOCATION DONE IN MEMORY.
 * 
 * --STRING OBJECT CREATED IN JAVA WILL BE STORED IN STRING POOL AREA OF HEAP.
 *   THIS AREA IS DEVIDED IN TWO TYPES OF AREA.
 *    1.STRING CONSTANT POOL AREA
 *    2.STRING NON CONTANT POOL AREA.
 *    
 * --CONSTANT POOL AREA WILL NEVER ALLOW DUPLICATE OBJECT.   
 *     WHEREAS NON CONSTANT POOL AREA WILL ALLOW DUPLICATE OBJECT.
 *      
 * --THE OBJECT CREATED BY NEW OPERATOR WILL ALWAYS LOADED IN NOT
 *   CONSTANT POOL AREA.
 * --THE OBJECT CREATED WITHOUT NEW OPERATOR WILL BE LOADED IN
 *   CONSTANT POOL AREA.
 *  
 *-----------------------------------------------------------------------------     
 *     
--->> Immutable String in Java

    In java, string objects are immutable. Immutable simply means 
    unmodifiable or unchangeable.

    Once string object is created its data or state can't be changed but 
    a new string object is created.     
 
 
 
 */

public class Demo1 
{
  
		public static void main(String[] args)
		{
		
			System.out.println("**********************");
			
			String s1=new String("bhavesh");
			
			String s2="bhavesh";
			
			String s3=new String("bhavesh");
	
			String s4="bhavesh";
			
			
			
			System.out.println(s1==s2);
			
			System.out.println(s1==s3);
			
			System.out.println("**************************");
			
			System.out.println(s2==s4);
						
			System.out.println("**********************");
		}

}
