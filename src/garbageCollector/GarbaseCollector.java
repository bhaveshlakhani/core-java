package garbageCollector;
/*
 * GARBAGE COLLECTION
 * --SET OF ALGO TO REMOVE OBJECT FROM HEAP
 * 
 * GARBAGE COLLECTOR:
 * 
 * 
 * --IT IS THREAD RESPONSIBLE FOR GC
 * --IT IS A LOW PRIORITY THREAD
 * --DE-REFERENCE OBJECT
 * --IT REMOVE OBEJECT WITHOUT REFERENCE FROM HEAP AREA.
 * 
 * 
 * 
 * 
 * 
 */

public class GarbaseCollector 
{

	
	void test()
	{
		System.out.println("running test");
	}
	
	public static void main(String[] args)
	{
	
		System.out.println("garbage collector is thread");
	
		GarbaseCollector obj1=new GarbaseCollector();
		obj1.test();
		
		//after performing operation we assign null value to object
		
		 obj1=null;
		
		
		
		System.gc();//explicitly calling to garbage collector
		
		
	}
	
	
}
