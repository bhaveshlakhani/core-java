package filehandling;
import java.io.File;

//create a file or directory

//remove fle or directory

public class CreateFile
{

	public static void main(String[] args)
	{

		File f=new File("H:\\BECM4\\bl\\b");
		
		
		//to check directory exist or not
		if(f.exists())
			
		{
			System.out.println("directory already exist");
		}
		
		else
		{
			System.out.println("directory does not exist");
			
			if(f.mkdir())
			{
				System.out.println("directory created successfully");
			}
			else
			{
				System.out.println("directory creation failed");
			}
			
		}
		
		System.out.println(f.getAbsolutePath());//to get file path
		
		//to delete directory
		//f.delete();
		
	}
	
	
}
