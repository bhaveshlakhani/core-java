package collectionConcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*
 * ITERATOR is interface. 
 * it CAN RETRIEVE ELEMENT IN UNI DIRECTION
 * ITERATOR USE FUNCTION HASNEXT() AND NEXT()
 * 
 * 
 */

public class itrator {
	
	
public static void main(String[] args) {

	ArrayList<String> a = new ArrayList<String>();
	a.add("rohit");
	
	a.add("bhavesh");
	a.add("hardik");
	a.add("abhilash");

Iterator<String> i = a.iterator();


Collections.sort(a);


while(i.hasNext())

  {
	
	System.out.println(i.next());
	
  }
}
}
