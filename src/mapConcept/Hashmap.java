package mapConcept;
import java.util.HashMap;


class Shoppingitem
{

	
}
class shoe extends Shoppingitem
{
 
	String shoename;
 
	double price;
	
	shoe(double price,String shoename)
	{
		this.price=price;
		this.shoename=shoename;
		
	}
	
	
	public String toString()
	{
		
		return this.shoename+" "+this.price;
		
	}
	
}


public class Hashmap
{
	
	
public static void main(String[] args)
{

	
	HashMap m1=new HashMap();
	
	pen p1=new pen();
	employee e1=new employee();
	
	m1.put(p1,new Notebook());
	
	m1.put(e1,new shoe(123.4,"nike"));
	
	m1.put(25,true);
	
	m1.put(null,5.4);
	m1.put(5,null);
	
	System.out.println("total map element "+m1.size());
	
	shoe s1=(shoe)m1.get(e1);
	
	System.out.println("shoe name:"+s1.shoename);
	System.out.println("price: "+s1.price);
	
	
}
	
	
}
