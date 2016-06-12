package casting;

/*-->>>CASTING
 * 
 * -->IN CASTING ONE TYPE OF INFORMATION IS CONVERTED INTO ANOTHER TYPE OF INFORMATION.
 * 
 * -->IT CLASSIFIED INTO TWO TYPES
 *    1.DATA TYPE CASTING
 *    2.CLASS TYPE CASTING
 * 
 * -->A DATA TYPE CASTING DONE IN TWO WAYS
 *     1.WIDENING 
 *     2.NARROWING
 *     
 *                          WIDENING
 *     ----------------------------->
 *     BYTE  SHORT  INT  LONG  FLOAT  DOUBLE 
 *     <----------------------------
 *      NARROWING
 * 
 * 
 * -->CASTING LOWER DATA TYPE TO HIGHER DATA TYPE IS KNOWN AS WIDENING.
 *    THE WIDENING CAN BE DONE EITHER IMPLICIT OR EXPLICIT.
 *    
 * -->CASTING HIGHER DATA TYPE TO LOWER DATA TYPE IS KNOWN AS NARROWING.
 *    THE NARROWING OPERATION SHOULD BE DONE EXPLICITLY.
 *    
 *    WHENEVER WE PERFORM NARROWING THERE WILL BE A LOSS OF DATA.
 
 
 */

public class DataTypecasting
{
 public static void main(String[] args)
 {

	 System.out.println("***************************");
	 
	 double d=12; //widening (integer type is converted into double) it done automatically

	 
	 int a=(int)12.6;//narrowing(double type is converted into integer)
	 
	 System.out.println("d value: "+d);
	 
	 System.out.println("a value: "+a);
	 
	 
	 
	 System.out.println("***************************");

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 
	
	
}
