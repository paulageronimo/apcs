
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
    
public class recipe
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
            ArrayList<String> ingredients = new ArrayList<String>();
            ingredients.add("flour");
            ingredients.add("sugar");
            ingredients.add("cocoa");
            ingredients.add("oil");
            ingredients.add("butter");
            ingredients.add("eggs");
            ingredients.add("baking soda");
            
            out.println(ingredients);
            
            ingredients.size();
            
            ListIterator iterator = ingredients.listIterator();
            while (iterator.hasNext())
                    out.println(iterator.next());
                    
            //the way the iterator reads it
            /*
             *          iterator
             *              hasnext()
             *                  next()
             *                  
             */
            List<Character> characters = new ArrayList<Character>();
            out.println("Please enter string data. ");
            input = keyboard2.nextLine();
            
            int size = input.length();
            
            for(n = 0; n<size; n++)
            {
                characters.add(input.charAt(n));
            }
                   
                    
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
