package collectionConcept;
import java.util.ArrayList;
/*
 * -->>                            ARRAYLIST
 * ----------------------------------------------------------------------------------------
 * --ARRAYLIST IS A IMPLEMENTATION CLASS OF LIST INTERFACE.
 * 
 * ARRAYLIST IMPLEMENET MARKER INTERFACE
 *  --SERIALIZE
 *  --CLONEABLE
 *  --RADOM ACCESS
 * 
 * -->ARRAYLIST BUILT ON RE-SIZABLE ARRAY DATA STRUCTURE.
 * 
 * -->ARRALIST GROWS WITH A FORMULA.
 * 
 *  NEW CAPACITY=(old capacity*3/2)+1
 * 
 * -->ARRAYLIST CLASS HAS 3 OVERLOAD CONSTRUCTOR.
 *    1.NO ARG CONSTRUCTOR
 *    2.INT ARG CONSTRUCTOR
 *    3.COLLECTION TYPE ARG CONSTRUCTOR.
 */


public class Arraylist1 
{
 public static void main(String[] args)
 {
	System.out.println("*************************");
	
	     ArrayList a = new ArrayList();

          a.add("abhilash");
          
          //duplicate
          a.add("bhavesh");
          a.add("vaibhav");
          
          a.add("rohit");
          a.add("hardik");
          
          a.add("jspiders");//now size automatically grown
          a.add("rohit");
          a.add("hardik");
          a.add("jspiders");
          
          
          a.remove(2);//to remove element from 2nd index
          a.add(2,"abhi");//add element into 2nd index
          
          //null insertion
          a.add(null);
          

       System.out.println(a.size());
       
       a.set(0,"bhavesh");
       a.set(5, "abhilash");

    for (int i = 0; i < a.size(); i++)
    {
	 
    	System.out.println(a.get(i));
    }
      
 }
}
