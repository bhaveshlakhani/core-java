package basic;

public class Unaryoperator {
	public static void main(String[] args)
	{
		 
	int a=1;
	
	System.out.println(a++);
	// a++ means post increment "use current value a then inrement value of a"
	// here current value is 1
	
	
	System.out.println(a++);//then value become 2
	
	System.out.println(++a);//4
	
	//++a is pre-increment means "first increment value of a then use it"
	
	int i=0,j=0;
	j=i++; //0
	System.out.println("i value :"+i);
	System.out.println("j value :"+j);
		
    //let's see use of final keyword
	//it is used define constant
	
	final int x=12;
	System.out.println("value of x="+x);	
	}

}
