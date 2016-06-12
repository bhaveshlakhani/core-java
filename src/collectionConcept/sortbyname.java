package collectionConcept;
import java.util.Comparator;


public class sortbyname implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
	Student s1 = (Student)arg0;
	Student s2 = (Student)arg1;
	
	return s1.name.compareTo(s2.name);
	
	
	}

}
