package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class FIlewrite
{

	public static void main(String[] args)
	{
	
		FileWriter fw=null;
		
		try 
		{
			
			fw=new FileWriter("H:\\BECM4\\bll.txt");
			
			
			
			//writing into file
			fw.write("Bhavesh\r\n");
			fw.write("Lakhani\r\n");
			
			System.out.println("successfully written in a file");
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			
			try 
			{
				fw.flush();
				fw.close();
			}
			
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	
}
