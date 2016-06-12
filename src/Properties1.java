import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Properties1 {
public static void main(String[] args) {
	
	try {
		FileReader fr = new FileReader("E:\\movies\\file\\a.properties");
	Properties p =new Properties();
      p.load(fr);
      String a =p.getProperty("abhilash");
	String b = p.getProperty("bhavesh");
	
	System.out.println("password for abhilash is "+a);
	System.out.println("password for bhavesh is "+b);
	fr.close();
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
