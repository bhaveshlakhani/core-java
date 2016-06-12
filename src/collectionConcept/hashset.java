package collectionConcept;
import java.util.HashSet;
import java.util.LinkedHashSet;
/*
 *-->>HASHSET 
 * 
 * --HASHSET IS A TYPE OF SET WHICH IMPLEMENT SET INTERFACE
 * 
 * --IT IMPLEMENT TWO MARKER INTERFACE
 *     1.SERIALIZABLE
 *     2.CLONABLE
 * 
 * --HASHSET IS IMPLEMENTED USING HASH TABLE DATA STRUCTUE.
 * 
 * --HASH SET DOES NOT ALLOW DUPLICATE OBJECT.
 * 
 * --HASH SET INSERTS OBJECT BASED ON THE HASH CODE,
 * 
 * --DOES NOT PRESERVE INSERTION ORDER.
 * 
 * --NULL INSERTION IS ALLOWED.
 * 
 * --HASH SET IS PREFERABLE WHENEVER FREQUENT OPERATION IS SEARCHING,
 *   SINCE THE OBJECT SEARCHING BASED ON HASH CODE.
 * 
 *
 * -->>HASHSET CONSTRUCTOR ARE OVERLOADED
 * 
 *     --HASHSET
 *     --HASHSET(INITIAL CAPACITY)
 *     --HASHSET(COLLECTION C1)
 *     --HASHSET(INT INITIALCAPACITY,FLOAT LOADFACTOR)
 */    

public class hashset {
public static void main(String[] args) {
	
	
	
	HashSet<String> h = new HashSet();
	
   // LinkedHashSet<String>=new LinkedHashSet<>();
    
    
   
h.add("Bhavesh");
h.add("Hardik");
h.add("Ganesh");
h.add("Lagesh");
h.add("Kajudi");


System.out.println(h.size());
h.add("Kajudi");
System.out.println(h.size());


java.util.Iterator<String> A = h.iterator();

while(A.hasNext()){
	System.out.println(A.next());
}


}
}
