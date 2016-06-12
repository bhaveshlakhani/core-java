package collectionConcept;

/*-->>COLLECTION FRAMEWORK
 * 
 *  --COLLECTION FRAMEWORK DEFINE SET OF CLASSES AND INTERFACE WHICH USED 
 *    TO HOLD HOLD ANY TYPE OF OBJECT. 
 *
 *  --COLLECTION FRAMEWORK LIBRARY IS USED TO STORE,MANAGE, MANIPULATE  
 *    AND REMOVE OBEJCTIN  A PARTICULAR STRUCTURE.
 * 
 * -->>COLLECTION
 * 
 * --COLLECTION INTERFACE IS ROOT INTERFACE IN COLLECTION FRAMEWORK.WHICH 
 *   DEFINES THE PROPERTIES OF COLLECTION TYPE.
 * 
 * --COLLECTION IS A GROUP OF OBJECT WHICH IS USED TO STORE AND PROCESS OBJECT IN
 *   STRUCTURED MANNER.
 * 
 * 
 * -->>TYPES OF COLLECTION.
 * 
 *     1.LIST
 *        --ARRAYLIST
 *        --VECTOR
 *        --LINKEDLIST
 *        
 *     2.QUEUE
 *        --LINKED LIST
 *        --PRIORITY QUEUE
 *        
 *     3.SET
 *        --HASHSET(RANDOM)
 *        --LINKED HASHSET(PRESERVE ORDER)
 *        --TREESET(ACSENDING ORDER)
 *        
 *        
 *---------------------------------------------------------------------------        
 * -->>                          LIST       
 *---------------------------------------------------------------------------  
 *    
 *   --LIST IS TYPE OF COLLECTION WHICH IS USED TO STORE ANY TYPE OF OBJECT.
 *   
 *   --IT STORES THE OBJECT SEQUENTIALLY.   
 *      
 *   --ALL THE OBJECT STORE IN THE LIST WILL HAVE INDEX.
 *   
 *   --LIST PRESERVE INSERTION ORDER.
 *   
 *   --LIST ALLOW TO INSERT DUPLICATE OBJECT AS WELL AS NULL ELEMENT.
 *      
 *   --LIST ELEMENT CAN BE PROCCESED BASED ON INDEX.
 *      
 *   --THERE ARE A THREE TYPE OF LIST.
 *        --ARRAYLIST
 *        --VECTOR LIST
 *        --LINKED LIST
 *        
 *-->>ARRAYLIST
 * 
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
 *    
 * --IN ARRAYLIST ACCESING AND RETRIEVAL OF ELEMENT IS FASTER COMPARED TO 
 *   LINKEDLIST.
 *      
 *        
 * -->>VECTOR
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
 *   
 *  -->>Linkedlist
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
 *        
 * ---------------------------------------------------------------------------     
 * -->>                            QUEUE
 * ---------------------------------------------------------------------------
 *    --QUEUE IS A TYPE OF COLLECTION WHICH IS USED STORE THE OBJECT
 *      IN FIFO ORDER..
 *      
 *    --THE OBJECT ARE STORE RANDOMELY WITHOUT INDEX.
 *    
 *    --QUEUE ALLOWS DUPLICATE OBJECT INSERTION.     
 *      
 *    --NULL INSERTION IS NOT ALLOWED.    
 *        
 *    --QUEUE ELEMENT CAN BE ACCESSED BY USING POLLING MECHANISM.    
 *        
 *    --THERE ARE A TWO TYPES OF QUEUE.    
 *        --LINKEDLIST
 *        --PRIORITY QUEUE.
 *        
 * -->>LINKEDLIST
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
 *        
 *       
 * -->>PRIORITY QUEUE
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
 *      --ZERO PARAMETER
 *        PRIORITYQUEUE()
 *      --COMPARATOR OBJECT TYPE
          PRIORITYQUEUE(COMPARATOR C1)       
            
 *      
 *  --------------------------------------------------------------------------
 * -->>                             SET       
 *  -------------------------------------------------------------------------
 *        
 *   --SET IS TYPE OF COLLECTION WHICH IS USED TO STORE UNIQUE OBJECT.     
 *        
 *   --SET DOES NOT ALLOW TO STORE DUPLICATE OBJECT.
 *        
 *   --NULL INSERTION IS ALLOWED.
 *        
 *   --THE OBJECT ARE STORE RANDOMELY WITHOUT ANY INDEX.     
 *        
 *   --SET ELEMENT CAN BE RETRIEVE BY USING FOR EACH LOOP OR ITERATOR.
 *   
 *   --THERE ARE THREE TYPE OF SET     
 *        --HASHSET
 *        --LINKEDHASHSET
 *        --TREESET
 *        
 *        
 *        
 * -->>HASHSET 
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
 *     
 *     
 * -->>LINKEDHASHSET
 * 
 * --LINKEDHASHSET IS CLASS WHICH SUB CLASS OF HASHSET.
 * 
 * --LINKED HASHSET IS IMPLEMENTED BASED ON HYBRID DATA STRUCTURE(HASHING+LINKEDLIST)
 * 
 * --LINKEDHASH SET PRESERVE INSERTION ORDER
 * 
 * --DUPLICATE OBJECT ARE NOT ALLOWED,NULL INSERTION IS ALLOWED.    
 * 
 * 
 *        
 *  -->>TREESET
 * 
 * --TREESET IS A TYPE OF SET WHICH IMPLEMENT NAVIGABLE SET,WHICH IS SUB 
 *   INTERFACE OF SORTSET
 * 
 * --TREESET IS IMPLEMENTED BASED ON BALANCED TREE DATA STRUCTURE.
 * 
 * --TREESET DOES NOT ALLOW DUPLICATE OBJECT.BUT NULL INSERTION IS ALLOWED.
 * 
 * --DOES NOT PRESERVE INSERTION ORDER,OBJECT INSERTED ACCORDING TO SORTING ORDER
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
 *        11
 *        
 *        
 *        
 *        
 *        
 *        
 *        
 *        
 *        
 *        
 *        
 */  
   
public class AcollectionIntro 
{
public static void main(String[] args)
{

	System.out.println("collection is a root interface..");
}
	
	
}
