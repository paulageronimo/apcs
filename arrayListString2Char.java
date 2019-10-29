
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
    
public class arrayListString2Char
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        out.println("* * * WELCOME TO String2Char  * * *");
        
        //String cont = "y";
        String str= "";
        
        //do
        //{
            
            ArrayList<Character>chars;
            chars = new ArrayList<Character>();
            /*
            str = keyboard2.nextLine();
            //a b c d . . . 
            //can use  a for each ?? wowzers
            
            for( char c : str.toCharArray())//methods must have "open" and "close"
            {
                chars.add(c);
                out.println(c);
            }
            out.println(chars);
            */
            //Integer[]list = {1,2,3,4}; s i z e 
            // int y = list[0] + list [2];
            // y = 4
            
            
            char[]list1 = {'c', 'a', 'b'};
            out.println(list1);
            Collections.sort(list1);
            out.println(list1);
            //add to an array, print, remove index, collections sort, that iterator, set size, 
            
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
