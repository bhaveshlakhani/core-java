package basic;

//Scanner is a class which used to take input from keyboard.

import java.util.Scanner; //importing Scanner class

public class Scanner1 
{	
	public static void main(String[] args)
	{
	  
		Scanner scn=new Scanner(System.in);  // creating instance Scanner
		
		
		System.out.println("enter your name");
		
		String name=scn.nextLine();  //reading STring
		
		System.out.println("enter your id");
		
		int id=scn.nextInt();        //reading int type value
		
		
		System.out.println("name :  "+name);
		System.out.println("id   :  "+id);
		
		
		
	}

}
