package constructor;

/*

 
* CONSTRUCTOR IS SPECIAL MEMBER OF CLASS 
   IT IS USED TO INITIALIZE DATA MEMBER OF CLASS AT TIME OF OBJECT CREATION.
   
* EVERY CLASS MUST HAVE CONNSTRUCTOR EITHER USER DEFINE OR COMPILER DEFINE(DEFAOULT CONSCTRUCTOR)
  
   
* CONSTRUCTOR DEFINE BY PROGRAMMER IS KNOWN USER DEFINE CONSTRUCTOR.
  WHERE AS CONSTRUCTOR DEFINE BY COMPILER IS KNOWN AS DEFAULT CONSTRUCTOR.

* if user not define constructor then compiler automatically define default constructor

* constructor type 1.user define 
                   2.compiler define
                   
* CONSTRUCTOR WITHOUT ANY PARAMETER IS KNOWN AS ZERO PARAMETER OR NO ARGUMNET
  CONSTRUCTOR                   

* CONSTRUCTOR DEFINE WITH PARAMETER IS KNOWN AS PARAMETARIZED CONSTRUCTOR.
* PARAMETARIZED CONSTRUCTOR USED TO PASS VALUE IN CONSTRUCTOR.


* same name as class name

* it has no return type

*-->CONSTRUCTOR OVERLOADING

 --IN A CLASS WE CAN DEFINE ANY NUMBER OF CONSTRUCTOR IS KNOW AS OVERLOADED 
   CONSTRUCTOR.

 --WHENEVER WE CREATE OVERLOADED CONSTRUCTOR ARGUMENT SHOULD BE DIFFRR IN
   TERMS ARGUMENT TYPE OR ARGUMENT LENGTH.

 --THE OVERLOADED CONSTRUCTOR ARE USED TO CREATE OBJECT WITH DIFFRENT 
   INITIALIZATION

 --CONSTRCTOR RETURNS THE OBJECT ADDRESS WHICH IS CONSTRUCTED BY CONSTRUCTOR
   OF CLASS. 

*/

class Demo1
 {
  
	int a=10;
	int k;
	double d;
	
	
	//zero argument constructor
	Demo1()
	{  
		k=12;
	   
		d=12.4;	
	}
	
	
	
	// u can overload the constructor
	//but argument should differ in terms of argument type or length of argument
	
	
	Demo1(int a) //Parameterized constructor
	{
		this.a=a;
	}
	
	
 } 

public class Sample1
{

	
	public static void main(String[] args)
	{
		System.out.println("*************************");
		
		Demo1 obj1=new Demo1();
		
		System.out.println("k value : "+obj1.k);
	
		System.out.println("d value :"+obj1.d);
		
		Demo1 obj2=new Demo1(12);
		
        System.out.println("a value : "+obj2.a);
        
        System.out.println("*************************");
	}

}
