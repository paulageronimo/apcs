
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
    
public class study
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        ArrayList band = new ArrayList();
        //arrays and array lists have index....
        
        band.add("Michelle");//0
        band.add("Kelly");//1
        band.add("Beyonce");//2
        band.add("Farrah");//3
        //[Michelle, Kelly, Beyonce, Farrah] starting at zero
        
        out.println(band);
        int location = band.indexOf("Joey");
        
        //band.remove(location);
        out.println(location);
        out.println("At index 1: " + band.get(1));//says which is on the index
        
        ///////////////////////////finding the size
        out.println("size of the band" + band.size());//CANNOT USE .length BC IT WONT KNOW WHAT IT IS
        band.add(1, "Paula");//adds me onto the first index
        band.set( 0 , "Lady GaGa");//removes the one at zero and adds lady gaga
        out.println(band);
        /////////////////////////////////////////////////////
        ArrayList<Integer>Li;
        Li = new ArrayList<Integer>();
        
        //prints the stuff on the list :o ? called a "for-each" loop...
        for (int x : Li)//for each ; can put char, int, strings
            out.println(x);
        
        Collections.sort(band);//ABC order looll
        out.println("\n\n");
        out.println(band);
        
        ListIterator iterator = band.listIterator();
        while (iterator.hasNext())
            out.println(iterator.next());
        
            //the way the iterator reads it
        /*
         *          iterator
         *              hasnext()
         *                  next()
         *                  
         */
    
    }
}
