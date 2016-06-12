package javaLibraries;
/*
 * 
 *                            JAVA
 *                              |
 *                              |
 * ------------------------------------------------------------------------
 * |                |            |                 |                     |
 * |                |            |                 |                     |
 * LANG            UTIL          SQL              IO                    AWT
 * --SYSTEM         --ARRAY      --RESULTSET       --FILE
 * --OBJECT         --SCANNER    --CONNECTION      --FILE LOADER
 * --THREAD                                        --FILEWRITE
 * --RUNNABLE()
 * 
 * 
 * -->OBJECT CLASS MEMBER
 * 
 *     1.tostring()
 *     2.hashcode()
 *     3.equals()
 *     4.clone() 
 *     5.finalize()
 *     6.overloaded wait()
 *     7.notify()
 *     8.notifyall()
 * 
 * 
 * -->TOSTRING()
 * 
 *   --TO STRING METHOD IS A METHOD OF OBJECT CLASS.
 *   --AND ITS RETURN TYPE IS STRING.
 *   
 * -->>TOSTRING() METHOD IN OBJECT CLASS IS IMPLEMENTED TO RETURN STRING
 *     WHICH CONTAIN FULLYQUALIFIED NAME OF INSTANCE AND CLASS.
 * -->THIS METHOD IS OVERRIDED IN SUB CLASS.
 * 
 * -->WHENEVER WE POINT A REFERENCE VARIABLE JVM MAKES A CALL TO THE TOSTRING()
 *    FUNCTION AND ITS POINT RETURN VALUE OF TOSTRING() FUNCTION.
 * 

 * -->now let's see example of toString method
 *  
 */




public class Demo1 
{

	public static void main(String[] args) 
	{
	
		System.out.println("******************************");
		
		Object o1=new Object();
		
		System.out.println(o1.toString());
		
		String a=o1.toString();
		System.out.println(a);
		
		
		System.out.println("******************************");
	}
}
