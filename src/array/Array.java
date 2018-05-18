package array;
/*
 * -->>ARRAY
 * --array is collection of element.
 * 
 * 
 * Java provides a data structure, the array, which stores a fixed-size 
 * sequential collection of elements of the same type. An array is used to 
 * store a collection of data, but it is often more useful to think of an
 *  array as a collection of variables of the same type.
 * 

 */

public class Array {

	public static void main(String[] args)
	{
     
		int b[]=new int[4];
		 b[0]=12;
		 b[1]=13;
		 b[2]=14;
		 b[3]=12;
		// b[4]=12;  error array index out of bound
	 
		for(int i=0;i<4;i++)
		{
			System.out.println(b[i]);
		}
		
     System.out.println("*******************************");
		
    //example of static array	
		
	 int a[]=new int [5];
		
		a[0]=12;
		a[2]=34;
		
		//here we only define  1st and 3rd element
		//in other index it print default value
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

	}

}
