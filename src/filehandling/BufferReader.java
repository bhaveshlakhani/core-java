package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;


public class BufferReader
{

	public static void main(String[] args)
	{
		
	try
	{
	
		FileReader r=new FileReader("H:\\BECM4\\bll.txt");
		
		BufferedReader r1=new BufferedReader(r);
		
		String line=r1.readLine();
		
		
		//it read only first line
		System.out.println(line);
		
		while(line!=null)

		{
			
			System.out.println(line);
			
			line=r1.readLine();
			
		}
		
		
		r1.close();//buufer reader closed
		r.close(); //filereader closed

	}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
   	}
		
}
	
	

