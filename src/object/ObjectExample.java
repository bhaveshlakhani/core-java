package object;

/* -->OBJECT
 *  
 *  --AN ENTITY WHICH HAVE STATE AND BEHAVIOUR IS KNOWN AS OBJECT.
 *    STATE DEFINES CHARACTERISTIC OF OBJECT AND BEHAVIOUR DEFINES FUNCTIONALITY OF OBJECT

 * -->AN OBJECT IS A COPY OF CLASS EACH TIME WE CREATE AN OBJECT A COPY OF 
 *    CLASS WILL BE CREATED.
 *    
 *    
 *    
 *-->>CLASS    
 *    
 *  --CLASS IS A DEFINITION BLOCK WHICH DEFINE STATE AND BEHAVIOUR OF OBJECT   
 *    
 *  --NON STATIC DATA MEMBER DEFINES THE STATE OB OBJECT.  
 *    
 *  --NON STATIC FUNCTION MEMBER DEFINE BEHAVIOUR OF OBJECT.  
 *

*/
class Notebook

 {
	
	//characteristic of notebook
	
	String brand;
	int pages;
	double price;
	
	
	//functionality of notebook
	
	void open()
	{
		System.out.println("open the book");
	}
	void read()
	{
		System.out.println("reading book");	
	}
	void close()
	{
		System.out.println("closing book");
	}
	
	
	//method to get details of notebook
	
	void bookdetail()
	{
		
		System.out.println("brand name: "+brand);
		
		System.out.println("number of pages: "+pages);
		
		System.out.println("price of notebok: "+price);
	}
	
 }

public class ObjectExample {


	public static void main(String[] args)
	{
        //creating instance of notebbok
		Notebook mbook=new Notebook();
		
		mbook.brand="class mate";
		mbook.pages=200;
		mbook.price=23.5;
		
		
		mbook.bookdetail();//calling function to get notebook detail
	
		System.out.println("************************");
		
		
		// creating second instance of notebook
		
		Notebook mbook1=new Notebook();
		
		mbook1.brand="camel";
		mbook1.pages=230;
	    mbook1.price=20;
		
		mbook1.bookdetail();//calling function to get notebook detail
	}

}
