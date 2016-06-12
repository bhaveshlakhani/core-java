package collectionConcept;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*-->>LINKEDHASHSET
 * 
 * --LINKEDHASHSET IS CLASS WHICH SUB CLASS OF HASHSET.
 * 
 * --LINKED HASHSET IS IMPLEMENTED BASED ON HYBRID DATA STRUCTURE(HASHING+LINKEDLIST)
 * 
 * --LINKEDHASHSET PRESERVE INSERTION ORDER
 * 
 * --DUPLICATE OBJECT ARE NOT ALLOWED,NULL INSERTION IS ALLOWED.
 *  
 */

public class Linkedhashset
{

	public static void main(String[] args)
	{
		
	
	 LinkedHashSet<String> h1=new LinkedHashSet<>();
    
    
	   
    
	h1.add("Hardik");
	h1.add("Ganesh");
	h1.add("Lagesh");
	h1.add("Kajudi");


	
	for(Object o1:h1)
	{
		System.out.println(o1);
	}
	
	
	
	
	
	
	
	
	}
}
