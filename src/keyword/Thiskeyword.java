package keyword;




//THIS KEYWORD IS USE TO REFER CURRENT CLASS OBJECT

//THIS KEYWORD CONTAIN ADRESS OF OBJECT

//IT IS ONLY USED IN NON STATIC CONTEXT

//whenever local variable aFnd class variable name is same,
//we can differenciate data member from local variable using this keyword

class Sample3
{
	//data member of class
	int k=10;
	double d=2.4;
	
	Sample3(double d)
	{
		this.d=d;
		
	}

	void test()
	{
		int k=12; //local variable
		
		System.out.println("running test method");
		
		System.out.println("k value "+this.k);
		
		System.out.println("local variable k value: "+k);
		
		System.out.println("adress of current class object");
		
		System.out.println(this);
		
	}
	
}


public class Thiskeyword
{
	public static void main(String[] args)
	
	{
		System.out.println("************************");

		
		Sample3 obj1=new Sample3(2.55555555);
		System.out.println("d value: "+obj1.d);
		obj1.test();
		
		
		System.out.println("************************");
	
		
	}	
}

