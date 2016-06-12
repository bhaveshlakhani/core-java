package collectionConcept;
/*
 * -->Vector
 * 
 * --vector is implementation class of list interface
 * 
 * --vector implements three marker interface
 *   --serializable
 *   --clonable
 *   --random acccess
 * 
 * --vector is a legacy class which is introduced in java 1.0
 * 
 * --all method in vector is synchronized so it is thread safe class.
 * 
 * --whenever we want to achieve thread safety we go through vector.
 * 
 * --vector grows  by doubling the capacity.
 * 
 */


import java.util.Vector;

public class Vector1
{
 public static void main(String[] args)
 {
	System.out.println("*************************");
	
	     Vector a =new Vector();
          a.add("abhilash");
          a.add("bhavesh");
          a.add("rohit");
          a.add("hardik");
          a.add("jspiders");
         

          a.remove(2);
          a.add(2,"abhi");
          a.add(null);
          a.add("null");

       System.out.println(a.size());
       
       

       a.set(5, "abhilash");

    for (int i = 0; i < a.size(); i++)
    {
	 
    	System.out.println(a.get(i));
    }



       a.clear();
       System.out.println(a.isEmpty());
       System.out.println(a.size());

 }




}
