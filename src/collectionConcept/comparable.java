package collectionConcept;

import java.util.Comparator;
import java.util.TreeSet;
/*

-->comparable
  
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


 class Student2 implements Comparable
 {

	//data member
	String name;
	int id;
	int age;
	
	//constructor
	public Student2(String name,int id,int age)
	{
		
		this.name=name;
		this.id=id;
		this.age=age;
	}

	
	//to string method that return string
	public String toString()
	{
		return "name "+ name +" id "+id + " age: "+ age;
		
	}
	
	//compareTo() method which is method of comparable interface
	@Override
	public int compareTo(Object arg0) 
	{
		Student2 ref1 = (Student2)arg0;//downcasting
		
		return this.id - ref1.id;
	}
	
}
 
 
 class sortbyage1  implements Comparator
 {

		@Override
		public int compare(Object arg0, Object arg1) {
			
			Student2 s1= (Student2)arg0;
			Student2 s2 =(Student2)arg1;
			
			
			
			return s1.age - s2.age;
			
		}
		
	}

public class comparable
{
 public static void main(String[] args) 
 {

	 System.out.println("*************************");
	 
	 sortbyage1 a1=new sortbyage1();
	 
	 TreeSet<Student2> t1=new TreeSet<Student2>(a1);
	 
	 t1.add(new Student2("bl", 1, 22));
	 t1.add(new Student2("abhi",23, 21));
	  
	 
	for(Object o1:t1)
	{
		System.out.println(o1);
	}
	 
	 
	 System.out.println("**************************");

 }
	
	
}
