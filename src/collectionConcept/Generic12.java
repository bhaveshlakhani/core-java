package collectionConcept;
import java.util.ArrayList;

//IN THIS EXAMPLE IT ONLY ALLOW STUDENT TYPE OBJECT

public class Generic12
{

	public static void main(String[] args) 
	{
	
		ArrayList<Student> st1=new ArrayList<Student>();
		
		st1.add(new Student("bl", 1,23));
		
		st1.add(new Student("bhavesh", 2,22));
		
		st1.add(new Student("abhi", 4,21));
		
		st1.add(new Student("rohit", 3,32));
		
		st1.add(new Student("bhavesh", 23,27));
		
		
		//st1.add(new pen());
		
		for(Object o1:st1)
		{
			System.out.println(o1);
		}
		
		
	}
	
}
