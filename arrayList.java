
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
    
public class arrayList 
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        
        int v = 0;
        int total = 0;
        //out.println("* * * WELCOME TO   * * *");
        
        //String cont = "y";
        
        //do
        //{
        //int list[] =new int [10];   //one dimentional bc it only has 1 - [] 
        
        char names [] = new char[25];
        
        double grades [] = new double [50];
        
        //different way hehe
        int list[];//declares the array object
        list = new int[10];//allocates memory for 10 array index spaces (starts at index 0)
        
        //nameOfArray[index of correspondance] = num
        //int x = list[1] + list[0];//can do modulus, multiplication, etc... change data !
        
        //list [4] = list[3] - list[8];
        
        //x = list[10] % list[1]; //is going to get an out of bounds error bc index of 10 does not exist :0
        
        for(v=0 ; v<list.length; v++)
        {
            list[v]=100+v;
            out.println("list[" + v + "]= "+ list[v]+ " ");
            total+=list[v];
        }
        
        out.print("Total = " + total);
        
        //}while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
