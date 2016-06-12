package collectionConcept;
/*
 * -->Linkedlist
 * 
 * --linked list is a implementation class of list and queue interface.
 * 
 * --linked list also implemenet queue ,hence it follow FIFO.
 * 
 * --linkedlist implement only two marker interface.
 *    --SERIALIZABLE
 *    --CLONABLE
 *    
 * --linkedlist built on doubly linkedlist data structure.
 * 
 * --linkedlist preferable whenever frequent operation is insertion or deletion
 * 
 * --linkedlist grows one element at a time.
 * 
 */


import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Linkedlist
{
 public static void main(String[] args)
 {
	System.out.println("*************************");
	
	     Linkedlist a =new Linkedlist();
	     
	     
         System.out.println(a instanceof Serializable); 
         
         System.out.println(a instanceof Cloneable);
         
         System.out.println( a instanceof RandomAccess);

    System.out.println("******************************");     
 }




}
