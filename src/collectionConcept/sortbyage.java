package collectionConcept;
import java.util.Comparator;


public class sortbyage  implements Comparator  {

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Student s1= (Student)arg0;
		Student s2 =(Student)arg1;
		
		
		
		return s1.age - s2.age;
		
	}
	
	

}
