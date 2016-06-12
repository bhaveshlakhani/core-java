package collectionConcept;

import javax.swing.text.StyledEditorKit.BoldAction;


public class Student1 implements Comparable{
String name;
int id;

public Student1(String name,int id) {
	this.name = name;
	this.id = id;
	
}

public String toString(){
	return "name "+this.name + " id:" +this.id;	
}


public int hashCode(){
	return this.id;
}

public boolean equals(Object a){
	Student1 d = (Student1)a;
	return this.id==d.id;
}

@Override
public int compareTo(Object arg0)
{
	Student1 a = (Student1)arg0;
	return this.name.compareTo(a.name);
}


}
