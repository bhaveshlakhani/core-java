package javaBeanclass;
/* -->Encapsulation
 * 
 * --Binding (or wrapping) code and data together into a single unit is 
 *   known as encapsulation.
 *   
 *   A java class is the example of encapsulation.
 *   Java bean is the fully encapsulated class because all the 
 *   data members are private here.
 * 
 * --encapsulation used to provide security.
 * 
 * -->JAVA BEAN CLASS
 *    --PRIVATE DATA MEMBER
 *    --PUBLIC CONSTRUCTOR
 *    --PUBLIC GETTER AND SETTER METHOD
 * 
 * -->DESIGNNING A JAVA CLASS WITH PRIVATE DATA MEMBER,PUBLIC CONSTRUCTOR,AND 
 *    PUBLIC GETTER AND SETTER METHOD IS KNOWN AS JAVA BEAN CLASS.
 *    
 * -->THE GETTER METHOD IS USED TO READ ACCESS AND THE SETTER METHOD IS USED 
 *    TO PROVIDE WRITE ACCESS.
 * 
 * -->JAVA BEAN CLASS IS GOOD EXAMPLE OF ENCAPSULATION.
 * 
 * --IT IS USED TO BUILT DATA ACCESS OBJECT AND DATA TRANSFER OBJECT.
 * 
 * 
 */


class Employee
{

	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id,String name,double salary)
	{
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	
	}
	
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}

	
	
	public String getname()
	{
		return "bhavesh";
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	
	public double getsalary()
	{
		return salary ;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
}

public class JavaBeanclass
{

	public static void main(String[] args) {
		
		System.out.println("***************************");
		
		
		Employee emp=new Employee(1, "bhavesh", 23.9);
		
		System.out.println("Employee id: "+emp.getid());
		System.out.println("Employee name: "+emp.getname());
		System.out.println("Employee salary: "+emp.getsalary());
	
		
		System.out.println("***************************");
		
		emp.setsalary(2344.23);
		
		System.out.println("Employee Salry: "+emp.getsalary());
	}
	
}
