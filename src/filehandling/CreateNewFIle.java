package filehandling;
import java.io.File;
import java.io.IOException;

public class CreateNewFIle 
{
public static void main(String[] args)
{

	File f1=new File("H:\\BECM4\\bl\\bll.txt");
	
	
	try 
	{
		f1.createNewFile();//creating new file
	}
	
	catch (IOException e)
	{	
		e.printStackTrace();
		//to print detail of exception
	}
	
	
	System.out.println(f1.getAbsolutePath());
	
	
	System.out.println("file exist:"+f1.exists());//return true or false
	
	
	System.out.println("can write:"+f1.canWrite());//default it is true
	
	//to change write access
	f1.setWritable(false);
	
	System.out.println("can write:"+f1.canWrite());
	
	
  }
	

}
