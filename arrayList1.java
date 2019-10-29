
/**
 * 
 *
 * @Paula Leticia Geronimo
 * @v1
 * 
 * 
 * 
 */

import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator; 
    
public class arrayList1 
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        out.println("* * * WELCOME TO   * * *");
        
        String cont = "y";
        
        //do
        //{
            ArrayList<String> NL = new ArrayList<String>();
            
            NL.add("George");
            NL.add("Mara");
            NL.add("Shoo");
            NL.add("Ada");
            NL.add("Marla");
            out.println(NL);
            
            NL.add( 3 , "Sebastian");
            out.println(NL);
             
            
            int location = NL.indexOf("Ada");   
            NL.remove(location);
            out.println(NL);
            
            NL.add("Alexa");
            out.println(NL);
            
            Collections.sort(NL);//ABC order looll
            out.println("\n\n");
            out.println(NL);
            
            ListIterator iterator = NL.listIterator();
            while (iterator.hasNext())
                out.println(iterator.next());
            
            
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
