package threadConcept;

/*
 * -->THREAD
 * 
 * --THREAD IS EXECUTION INSTANCE WHICH HAVE ITS OWN EXECUTION ENVIRONENT
 *   (SYSTEM RESOURCE).
 *   
 * --THREAD IS A UNIT OF PROCEES AND IT IS A LIGHT WEIGHT.
 * 
 * --THREAD class IS DEFINE IN JAVA.LANG PACKAGE
 * 
 * --JVM CAN RUN ONLY RUNNABLE TYPE OBJECT.
 * 
 * --RUNNABLE IS A INTERFACE AVAILABLE IN JAVA.LANG PACKAGE.
 *   -RUNNABLE HAVE ONLY ONE ABSTRACT METHOD RUN()
 *   -THREAD CLASS IMPLEMENT RUNNABLE INTERFACE WHERE RUN METHOD DOES NOT HAVE
 *    ANY IMPLEMENTATION
 *    
 * --THREAD IMPLEMENTATION STARTED BY CALLING START() METHOD ON THREAD TYPE OBJECT.
 * 
 * --THERE ARE TWO WAYS TO CREATE THREAD.
 * 
 *   1.BY EXTENDING THREAD CLASS AND OVERRIDNG RUN()
 *   2.AND BY IMPLEMENTING RUNNABLE INTERFACE AND PROVIDE IMPLEMENTATION TO RUN()
 * 
 * --Commonly used Constructors of Thread class:

       --Thread()
       --Thread(String name)
       --Thread(Runnable r)
       --Thread(Runnable r,String name)
       
       
  -->EACH THREAD IN JVM HAS FOLLOWING PROPERTIES.
       1.THREADID
       2.THREADNAME
       3.THREADPRIORITY     
  --THREAD CLASS PROVIDE GETTTER AND SETTER METHOD TO ACCESS THE PROPERTIES LIKE     
       -getid(),getname(),setname(),getpriority(),setpriority()
       
       
  --METHOD IN THREAD..     
     
       1.PUBLIC VOID START
        START THE THREAD EXECUTION IN SEPERATE STACK AND CALLS THE RUN 
        METHOD OF THREAD OBJECT
        
       2.PUBLIC VOID RUN()
         START THE EXECUTION OF TASK DEFINE IN run() CURRENT ECECUTION STACK.
         (NO CONCURRENCY)
 
 -->>Daemon Thread in Java

--Daemon thread in java is a service provider thread that provides services 
  to the user thread. 
  
--Its life depend on the mercy of user threads i.e. when 
  all the user threads dies, JVM terminates this thread automatically.

--There are many java daemon threads running automatically e.g. gc,
    finalize  etc.
 
 
 -->>Thread Scheduler in Java

  --Thread scheduler in java is the part of the JVM that decides which thread
    should run.

  --There is no guarantee that which runnable thread will be chosen to 
    run by the thread scheduler.Only one thread at a time can run in a
     single process.
 

 */




public class ThreadIntro 
{
	

	public static void main(String[] args) 
	{
	
		
		System.out.println("thread");
			
	}
	
	
	
	
}
