
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
    
public class destinyChild
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        System.out.println("* * * WELCOME TO DESTINY CHILD  * * *");
        
        String cont = "y";
        
        //do
        //{
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
            
            out.println("At index 1: " + band.get(1));
            
            ///////////////////////////finding the size
            
            out.println("size of the band" + band.size());//CANNOT USE .length BC IT WONT KNOW WHAT IT IS
            
            band.add(1, "Paula");
            band.set( 0 , "Lady GaGa");
            out.println(band);
            
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
