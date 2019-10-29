
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
    
public class java205
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        //new concept called initializer
        // M   U  S  T  K N O W   T H E   S I Z E  O F   T H E   A R R A Y
        
        /*
        int list[]; 
        list = new int[8];
        
        for(int i : list)
        {
            list[i] = 100 + i;
            out.println(list[i]);
        }
        */
       /*
        char list1[];
        list1 = new char[4];
        
        list1[0]= 'a';
        list1[1]= 'b';
        list1[2]= 'c';
        list1[3]= 'd';
        
        list1[2] = 'e';
        list1[3]='k';
        list1[0] = list1[1];
        
        for(char i : list1)
            out.println(i);
           
       */
       
       
       String[] Name = {"zoe", "allison", "maria"};
       out.println(Arrays.toString(Name));
       for(String x: Name)
            out.println(x);
            
       out.println();
       double Data[] = {120.0,  0.5,  0.0, 999.0, 77.3};
       out.println(Arrays.toString(Data));
       for(double i: Data)
            out.println(i);
       
       out.println();
       out.println();
       out.println();
       
    }
}
