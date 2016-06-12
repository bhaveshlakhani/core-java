package accessModifier;

/*
-->There are two types of modifiers in java: access modifiers and
   non-access modifiers.
   
-->The access modifiers in java specifies accessibility (scope) of a data 
   member, method, constructor or class.

-->There are 4 types of java access modifiers:

      1.private
      2.package level(default)
      3.protected
      4.public
      
-------------------------------------------------------------------------------      
      
-->>PROTECTED
   
 --The protected access modifier is accessible within package and outside
   the package but through inheritance only.

 --The protected access modifier can be applied on the data member, 
   method and constructor. It can't be applied on the class.
      
      
-->>PACKAGE LEVEL      
   IT IS A DEFAULT ACCESS LEVEL.IF USER DOES NOT DEFINE THAN ITS DEFAULT 
   PACKAGE LEVEL.   
      
      
-->>PUBLIC      
     
  --IT VISIBLE TO THE WORLD.IT IS ACCESSIBLE ANYWHERE.    
      
      
-------------------------------------------------------------------------------      
-->>There are many non-access modifiers such as static, abstract, 
    synchronized, native, volatile, transient etc. 
      
      
      


*/

//LET'S SEE EXAMPLE OF PRIVATE ACCESS MODIFIER.

class A
{

	private int k=10;
	
}

public class PrivateData 
{

	public static void main(String[] args) 
	{
	
		System.out.println("******************************");
		
		A a=new A();
		
//		System.out.println("k value: "+a.k);//error because k is private.
		
		System.out.println("******************************");
	}
	
	
}
