package exceptionHandling;

import java.util.Scanner;

public class Throw 
{
public static void main(String[] args) 
{

	Scanner c=new Scanner(System.in);
	System.out.println("enter your age");
	
	int n=c.nextInt();
	
	System.out.println("checking......");
	
	if(n<18){
		try {
			throw new myexception();
		} catch (myexception e) {
			// TODO Auto-generated catch block
			System.out.println("try next year,your age is not valide");
		}
	}
	else{
		System.out.println("thank you for voting ");
	}
	
	
	
}
	
	
	
}



class myexception extends Throwable{
}