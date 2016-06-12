package collectionConcept;
import java.lang.Comparable;

/*
 * -->comparable
  
  Comparable interface is used to order the objects of user-defined class.
  This interface is found in java.lang package and contains only one method
  named compareTo(Object).
  
  It provide only single sorting sequence
  i.e. you can sort the elements on based on single datamember only.
  For instance it may be either rollno,name,age or anything else.

-->>comparator

    Comparator interface is used to order the objects of user-defined class.

    This interface is found in java.util package and contains 2 methods 
    compare(Object obj1,Object obj2) and equals(Object element).

    It provides multiple sorting sequence
    i.e. you can sort the elements based on any data member. 
    For instance it may be on rollno, name, age or anything else.

*/
public class Student implements Comparable {

	String name;
	int id;
	int age;
	public Student(String name,int id,int age) {
		
		this.name=name;
		this.id=id;
		this.age=age;
		}
	public String toString(){
		return "name "+ name +" id "+id + " age: "+ age;
		
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		Student ref1 = (Student)arg0;
		
		return this.id - ref1.id;
	}
	
}
