package basic;
/*
 * CLASS HAS TWO TYPES OF MEMBER
 * 1.STATIC MEMBER
 * 2.NON STATIC MEMBER
 * 
 * -->STATIC MEMBER
 * 
 * --USING static KEYWORD YOU CAN DEFINE STATIC DATA MEMBER OR FUNCTION MEMBER
 * 
 * --STATIC MEMBER ALWAYS ASSOCIATED WITH A CLASS.
 *   SO IT REFER THROUGH CLASS.
 * 
 * --WHEN YOU DECLARE MEMBER AS STATIC THEN ONLY ONE COPY CREATED IN MEMORY 
 *   AND THAT IS MODIFIABLE.
 *   WHENEVER WE WANT ONLY SINGLE COPY WE GO THROUGH STATIC MEMBER.
 *   
 * --STATIC MEMBER ARE ALSO USED TO SHARE DATA OR FUNCTION ACROSS OBJECT.  
 * 
 * -->>2.NON STATIC MEMBER.
 * 
 * --IT DECALRE WITHOUT STATIC KEYWORD.
 * 
 * --NON STATIC MEMBER ASSOCIATED WITH AN INSTANCE. HENCE WE NEED TO CREATE 
 *   INSTANCE IN ORDER TO NON STATIC DATA MEMBER.
 * 
 * --WHEN EVER WE CREATE INSTANCE OF CLASS, COPY OF CLASS CREATED IN
 *   MEMORY(ONLY NON STATIC MEMBER)
 *   
 * --MODIFIEING THE DATA MEMBER OF ONE INSTANCE WILL NOT AFFECT TO OTHER 
 *   INSTANCE.  
 * 
 * 
 */

//THIS IS EXAMPLE OF HOW TO REFER STATIC AND NON STATIC MEMBER OF CLASS



class A
{
    static int a=10;  //static data member
    
    int b=12;  // non static data member
    
    static void test()   //static method
    {
    	
    	System.out.println("running test() static method");
    	
    }
    
    void disp()   //non static method
    {
    	
    	System.out.println("runnning disp non static method");
    	
    } 
}

public class ClassOBJect {

	
	public static void main(String[] args)
	{
	
		System.out.println("a value : "+A.a);//referring static data member
		
		A.test();// Referring static method
		
		
		
       A a=new A(); //creating instance of A
       
       
        System.out.println("b value:  "+a.b);// referring non static data member
       
		a.disp();// referring non static method
		
		
		
	}

}
