package coupling;

/*-->>TIGHT COUPLING
 * 
 * IF A OBJECT DEPEND ON FUNCTIONALITY OF OTHER OBJECT THAN WE CALL IT 
 * TIGHT COUPLING.
 * 
 * ANY CHANGES IN THE IN THE IMPLEMENTATION ON THE OBJECT IMPECTS THE OTHER
 * OBJECT.
 * 
 * -->TO OVERCOME THIS IF IT IS CLASSES REFER THE OBJECT FUNCTIONALITY USING 
 *    INTERFACE REFERENCE VARIABLE. 
 
 
----------------------------------------------------------------------------
                         STEP FOR LOOSE COUPLING..
----------------------------------------------------------------------------
DESIGNING AND DEVOLOPING APPLICATION IN FOLLOWING LAYER IS KNOWN AS
LOOSE COUPLING.

1.OBJECT IMPLEMENTATION LAYER
2.OBJECT CREATION LAYER
3.OBJECT UTILIZATION LAYER.

-->>1.OBJECT IMPLEMENTATION LAYER

 --IN THIS LAYER OBJECT IMPLEMENTATION DONE BY USING ABSTRACTION PRINCIPLE.
 --GENERALIZE THE COMMON BEHAVIOUR IN AN INTERFACE AND PROVIDE IMPLEMENTATION
   TO SPECIFIC CLASS

-->>2.OBJECT CREATION LAYER
 --IN THIS LAYER THE OBJECT REQUIRED IS CREATED BASED ON NEED BY USING 
   FACTORY PATTERN.
 --THE CREATED OBJECT CASTED TO INTERFACE TYPE AND RETURNED.

-->>3.OBJECT UTILIZATION LAYER.
  --IN THIS LAYER FUNCTIONALITY OF OBJECT IS USED WITHOUT KNOWING HOW IT IS
    IMPLEMENTED.
  --OBJECT IS REFERENCE THROUGH INTERFACE REFERENCE VARIABLE.  

-------------------------------------------------------------------------------

*/

//this is a example of loose coupling.. !!

public interface Vehicle
{

	void start();
	void move();
	void stop();

	
}

class Bike implements Vehicle
{

public	void start()
	{
	
		System.out.println("starting bike");
	}
	
public	void move()
	{
		
		System.out.println("moving bike");
	}
	
public void stop()
	{
		System.out.println("stoping bike");
		
	}
	
}

class Car implements Vehicle
{

	public void start()
	{
		System.out.println("starting car");
	}
	
	public void move()
	{
		
		System.out.println("moving car");
	}
	
	public void stop()
	{
		System.out.println("stoping car");
	}
	
}

//object creating
class Person
{

	Vehicle v;
	void initvehicle(Vehicle v)
	{
		this.v=v;
		
	}
	
	void compute()
	{
		v.start();
		v.move();
		v.stop();

	}
	
}



//object utilizing

class Mainclass
{
public static void main(String[] args)
{

	System.out.println("*******************************");

	Person p=new Person();
	
	
	//utilizing object functionality without knowing how it is implemented
	p.initvehicle(new Car());
	
	p.compute();
	
	System.out.println("*******************************");
	
	p.initvehicle(new Bike());
	p.compute();
	
	
	System.out.println("*******************************");
}
	
	
	
}











