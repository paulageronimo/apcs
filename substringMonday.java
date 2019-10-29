
/**
 * 
 *
 * @Paula Leticia Geronimo
 * @v1
 */

    import java.util.*;
    import java.util.Scanner;
    import java.lang.Math;
    import java.text.NumberFormat;
    
public class substringMonday
{
    public static void main(String args[])
    {
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
       Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
       Scanner keyboard2 = new Scanner(System.in);
        
       System.out.print("\f");
        
       System.out.println("* * * WELCOME TO SUBSTRING MONDAY  * * *");
       
       char letter = ' ';
       String tres = "";
       int cal = 0;
       int x = 0;
       String cont = "yes"; 
           
       do{
           
           System.out.println("Input numbers.");
           String substringMonday = keyboard2.nextLine();
           
           int numCal = substringMonday.length();
           int numCal3 = numCal%3;
           
           while(numCal3 != 0)
           {
               System.out.println("ERROR INPUT AGAIN");
               System.out.println("Input numbers.");
               substringMonday = keyboard2.nextLine();
               numCal = substringMonday.length();
               numCal3 = numCal%3;
           }
           
           ///////////////////////////////////////////////////////////////////////////
           
           int timesLoop = numCal/3;
           
           for(x = 0; x<timesLoop; x++)
           {
               int in = 3 * x;
               int si = 3 + in; 
               tres = substringMonday.substring(in, si);
               //System.out.println(tres);
               //changing char into integer ... double x - Double.parseDouble();
               int num123 = Integer.parseInt(tres);
               cal += num123;
               System.out.println("Set " + (x+1) + ": " + tres);
               
           }
           
           System.out.println("Total: " + cal);
           
           System.out.println("Do you wish to continue? (enter y or Y for yes)");
           cont = keyboard2.nextLine();
           
           letter = ' ';
           tres = "";
           cal = 0;
           x = 0;
           
        }while(cont.equals("y") || cont.equals("Y"));
    }
}
