
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
    
public class charArrayList
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        out.println("* * * WELCOME TO   * * *");
        
        //String cont = "y";
        String input = "";
        int n = 0;
        
        //do
        //{
            List<Character> characters = new ArrayList<Character>();
            out.println("Please enter string data. ");
            input = keyboard2.nextLine();
            
            int size = input.length();
            
            for(n = 0; n<size; n++)
            {
                characters.add(input.charAt(n));
            }
            
            ListIterator iterator = characters.listIterator();
            while (iterator.hasNext())
                out.println(iterator.next());
                
                
            out.println(characters);
            
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
