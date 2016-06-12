package basic;

public class StringA {

	public static void main(String[] args)
	{

		System.out.println("in java String is a class");

		//here String is class.it is immutable.
		
		String name="bhavesh";//only one object is created. 
		
		//use of different String function
		
		System.out.println(name.length()); //to find length of string
		
		System.out.println(name.charAt(0)); //find char from Specific index
		
		System.out.println(name.contains("bh"));//return true or false
		
		System.out.println(name.substring(2));//printing string after 2nd index
		
		System.out.println(name.toUpperCase());//convert string into uppercase
		
	
	}

}
