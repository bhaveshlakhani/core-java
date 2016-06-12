package exceptionHandling;

import java.io.IOException;
/*
 *--> throws keyword for propagate the checked type exception to the caller of 
 * the method.
 * 
 * 
 * 
 * 
 * 
 */


public class Throwa
{
	static void a() throws IOException{
		throw new IOException();
	}
	
	
	
public static void main(String[] args) {
	try{
	a();
	}
	catch(IOException a){
		
	}	
}


}
