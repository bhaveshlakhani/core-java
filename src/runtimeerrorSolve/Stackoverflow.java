package runtimeerrorSolve;


/*
 -->Stack overflow 
 whenever we write program with unconditional recursive call then jvm throws 
 stack overflow error bcz memory allocate for stack consume and no more space 
 for space for running new method

*/

public class Stackoverflow {
	
	public static void square(int x) 
	{
		int res=x*x;
		System.out.println("square of"+x);
		System.out.println(res);
		
	//	if(x<=10)   //to remove stack overflow error we write this condition
		square(++x);
		
		
	}	
	public static void main(String[] args)
	{
		
		square(2);
	
		
	}
	
	

}
