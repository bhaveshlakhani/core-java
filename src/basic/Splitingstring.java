package basic;

public class Splitingstring

{
public static void main(String[] args)

{ 
	 
	String course="java sql dbms html j2EE";
	
	String[] arr1=course.split(" "); 
	
	
	System.out.println("number of courses "+arr1.length);
	
	for(int i=0;i<arr1.length;i++)
	{
		 System.out.println(arr1[i]);
	}
	
	
}	
	
	
	
	
	
	
	

}
