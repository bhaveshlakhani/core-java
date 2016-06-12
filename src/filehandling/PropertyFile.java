package filehandling;
import java.io.FileReader;
import java.util.Properties;
/*
 * PROPERTIES CLASS
 
 --The properties object contains key and value pair both as a string.
 
 -- It is the subclass of Hashtable.

 --It can be used to get property value based on the property key. 
 
 --The Properties class provides methods to get data from properties file 
 and store data into properties file. Moreover, it can be used to get 
 properties of system.


-->>Advantage of properties file

  Easy Maintenance: 
  --If any information is changed from the properties file,
    you don't need to recompile the java class. It is mainly used to contain
    variable information i.e. to be changed.
 
  
  
  
 */

public class PropertyFile 
{

	public static void main(String[] args) throws Exception
	{
	
		FileReader f3=new FileReader("H:\\BECM4\\myfile.txt");
		
		Properties pr=new Properties();
		
		pr.load(f3);
		
		
		String fname=pr.getProperty("fname");
		String lname=pr.getProperty("lname");
		String  id=pr.getProperty("id");
		
		
	
		System.out.println("first name: "+fname);
		System.out.println("last name: "+lname);
		System.out.println("id is:"+id);
		
			
	}
	
	
}
