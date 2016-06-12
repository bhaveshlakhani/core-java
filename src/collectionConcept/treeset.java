package collectionConcept;
import java.util.Scanner;
import java.util.TreeSet;
/*
 * -->>TREESET
 * 
 * --TREESET IS A TYPE OF SET WHICH IMPLEMENT NAVIGABLE SET,WHICH IS SUB 
 *   INTERFACE OF SORTSET
 * 
 * --TREESET IS IMPLEMENTED BASED ON BALANCED TREE DATA STRUCTURE.
 * 
 * --TREESET DOES NOT ALLOW DUPLICATE OBJECT.
 * 
 * --DOES NOT PRESERVE INSERTION,OBJECT INSERTED ACCORDING TO SORTING ORDER
 * 
 * --TREESET ALLOW ONLY COMPARABLE TYPE OBJECT.
 * 
 * --BY DEFAULT OBJECT ARE SORTED IN ASCENDING ORDER.
 * 
 * 
 * -->>TREESET OVERLOAD CONSTRUCTOR
 * 
 *   --TREESET(COMPARATOR C1)
 *   --TREESET(SORTEDSET C1)
 *   --TREESET(COLLECTION C1)
 *   --
 * 
 */

public class treeset{
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	String f = s.next();
	
	TreeSet d;
	
	sortbyage t = new sortbyage();
	
	sortbyname n = new sortbyname();
	
	switch (f)
	{
	case "age":
		d = new TreeSet(t);
		break;

    case "id":
	    d=new TreeSet();
		break;
    case "name":
	    d = new TreeSet<>(n);
	    break;
    default :
        d = new TreeSet<>();
        break;
	}
		
	d.add(new Student("abhi", 1,34));
	d.add(new Student("abhishek", 6,45));
	d.add(new Student("abhinav", 3,56));
	d.add(new Student("abhilash", 9,23));
	d.add(new Student("bhavesh", 4,25));
	
	for(Object x:d){
		System.out.println(x);
	}
	
}
}
