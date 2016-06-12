import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import thread.mainclass;


public class FileHandling {

	public static void main(String[] args) {
		FileWriter f;
		FileReader fr;
		BufferedReader a;
		
		try {
			 f = new FileWriter("E:\\movies\\file\\abhi.txt");
		f.write("this is abhilash shah. \r\n");
		f.write("this is his fileprogramming class. \r\n");
		f.write("welcome to my world.");
		f.flush();
		f.close();
		 fr = new FileReader("E:\\movies\\file\\abhi.txt");
		
		a= new BufferedReader(fr);
		String line = a.readLine();
		
		
		
		
		
		
		while(line!=null)
		{
			System.out.println(line);
		    line = a.readLine();
		}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
			
		}
		
		
		
	}
	
	
	
}
