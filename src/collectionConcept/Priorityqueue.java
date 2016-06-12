package collectionConcept;
import java.util.PriorityQueue;

/*-->>PRIORITY QUEUE
 * 
 * --PRIORITY QUEUE IS AN IMPLEMENTATION CLASS OF QUEUE INTERFACE.
 * 
 * --IT STORES OBJECTS IN ASCENDING ORDER BASED ON SOME PRIORITY.
 * 
 * --IT STORE ONLY HOMOGENEOUS ELEMENT WHICH ARE OF COMPARABLE TYPE.
 * 
 * 
 * --CONSTRUCTOR OF PRIORITY QUEUE
 * 
 *      
 *       -- PRIORITYQUEUE()
 *      
         -- PRIORITYQUEUE(COMPARATOR C1)
 
 */
public class Priorityqueue 
{

	public static void main(String[] args)
	
	{
		System.out.println("***************************");
		
		PriorityQueue q1=new PriorityQueue<>(2);
		
		q1.add("bhavesh");
		q1.add("hardik");
		q1.add("rohit");
		q1.add("abhilash");
		q1.add("vivek");
        //q1.add(23);
		System.out.println("queue size: "+q1.size());
		
		Object obj2=q1.peek();
		
		System.out.println(q1.size());

		
		Object obj1=q1.poll();
		while(obj1!=null)
		{
			
			System.out.println(obj1);
			
			obj1=q1.poll();
			
		}
		
		//after emptying queue output is null
	    System.out.println(q1.poll());
	
		
		System.out.println("***************************");
	}
	
}
