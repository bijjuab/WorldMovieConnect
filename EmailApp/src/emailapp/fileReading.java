/**
 * 
 */
package emailapp;
import java.io.*;
/**
 * @author Bijju
 *
 */
public class fileReading {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         FileReader in = null;
         try {
        	 in = new FileReader(args[0]);
        	 int i = 0;
        	 while ( ( i = in.read()) != 26 )
        	 {
        		 System.out.println((char)i + " = value of i = " + i  + " and the assci value =  " + Integer.toBinaryString((int)i));
        	 }
         } finally {
        	 if ( in != null){
        		 System.out.println("entered into final block with value of in " + in + "The value of " + in.read());
        		 in.close();
        	 }
         }
         
         
	}

}
