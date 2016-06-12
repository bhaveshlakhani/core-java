package collectionConcept;
import java.util.Comparator;


public class sortby_Name implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Student1 a = (Student1)arg0;
		Student1 b = (Student1)arg1;
		
		 
		return a.name.compareTo(b.name);
	}

}
