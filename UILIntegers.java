
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
    
public class UILIntegers
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        out.println("* * * WELCOME TO MY SWAMP  * * *");
        
        String cont = "y";
        String input = "";
        int n = 0;
        //do
        //{ //3,4,2 -set at index two: 10-
            ArrayList<Integer>Li;
            Li = new ArrayList<Integer>();
            
            Li.add(3);
            Li.add(4);
            Li.add(2);
            Li.set(2, 10);
            
            out.println(Li);
            
            //prints the stuff on the list :o ? called a "for-each" loop...
            for (int x : Li)//for each ; can put char, int, strings
                out.println(x);
            
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
