package stringclass;
/*
 * FROM JDK 1.5 JAVA LIBRARY UPDATED WITH TWO ADDITIONAL CLASSES.
 *  1.STRINGBUILDER
 *  2.STRINGBUFFER
 *  
 *  --BOTH CLASSES ARE MUTABLE MEANS YOU CAN CHANGE THE STATE OF OBJECT.
 *  
 *  --BOTH CLASSES ARE FINAL CLASSES AVAILABLE IN JAVA.LANG PACKAGE.
 *  
 *  --IN BOTH CLASSES  TOSTRING() METHOD IS OVERRIDED BUT HASHCODE() 
 *    AND EQUALS() NOT OVERRIDED.
 * 
 *  --BOTH CLASSES DOES NOT PROVIDE IMPLEMENTATION TO THE COMPARABLE INTERFACE.
 *    HENCE THIS OBJECT CAN NOT BE SORTED.
 *    
 *  -->STRING BUFFER IS REPLICA OF STRING BUILDER IN TERMS OF MEMBERS.  
 *     
 *  -->STRINGBUFFER METHODS ARE SYNCHRONIZED, HENCE IT IS THREAD SAFE.   
 * 
 */


public class StringbuilderExample 
{

	public static void main(String[] args) {
		
		
		System.out.println("********************************");
		
		
		StringBuilder s1=new StringBuilder("BhaveshLakhani");
		
		s1.append('5');
		
		System.out.println(s1);
		
		//insert element in 8th 
		s1.insert(8,'L');
		
		System.out.println(s1);
		
		
		//addinf char at 8th location
		s1.setCharAt(7, 'B');
		
		System.out.println(s1);
		
		s1.reverse();
		
		//reverse
		System.out.println(s1);
		
		
		System.out.println("*********************************");
		
	}
	
	
	
	
	
}
