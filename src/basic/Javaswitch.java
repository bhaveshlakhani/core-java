package basic;

import java.util.Scanner;

public class Javaswitch {
	
	public static void main(String arg[])
	{
		Scanner c=new Scanner(System.in);
		
		
		int x;
		
	    int a,b;
	    System.out.println("enter value of a");
	    a=c.nextInt();
	    System.out.println("enter value of b");
	    
	    b=c.nextInt();
	    System.out.println("enter operation u want to perform 1.addtion 2.multiplication 3.subtraction");
	   x=c.nextInt();
	    
	    int answer = 0;
	    
	    switch (x) {
		case 1:
			answer=a+b;
			System.out.println("addition is ="+answer);
			break;
			
		case 2:
			answer=a*b;
			System.out.println("multiplication is=" +answer);
			
		case 3:
			answer=a-b;
			System.out.println("subtration is ="+answer);
			
		default:
			System.out.println("invalid operator");
			break;
		}
	}
	

}
