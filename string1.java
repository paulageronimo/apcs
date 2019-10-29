
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
    
public class string1 //casting- way to change the data
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        System.out.println("* * * WELCOME TO STRING1  * * *");
        /*
         * 
         * C A S T I N G
         * 
         */
        /*double Money = 25.9;
        int dollars = 25;
        
        Money = dollars;//output: 25.0
        //dollars = Money;//lossy conversion error
        //do instead...-v
        dollars = (int) Money;//removes what's after the decimal
        
        //System.out.println(Money);
        System.out.println(dollars);//does not round up to 26
        
        //use Math.round(); instead for better results, then cast it
        */
       
        /*
         * 
         * S U B S T R I N G
         * 
         */           //index
        String Name = "Cynthia Susan Smith"; 
                      //size
                      
        //to find length, Name.length()  
        // look at name, take size of string, and make it into an int
        
        String Middle = "";
        
        int y = Name.length();
        
        
        //charAt(index);
        char letter = ' ';
        
        int x = 8;
        
        /*
         * //for looping it
        for(x=8; x<13; x++)
        {
            letter = Name.charAt(x);
        
            System.out.print(letter);
        }
        
        */
       
       //substring ISNTEAD of for loop
       
       
       String last = Name.substring(14,19);
                   //(8,13);
       System.out.print(last + ", ");
       
       String first = Name.substring(0,7);
                   //(8,13);
       System.out.print(first+ " ");
       
       String middle = Name.substring(8,13);
                   //(8,13);
       System.out.print(middle );
       
       
       ///////////////////////////
       
       //0 28
       String welcome = "Welcome to Totorialspoint.com";
       
       
       
       String link = welcome.substring(11,29);
       System.out.println("\n\n\n" + link);
       
       String tutor = welcome.substring(11,16);
       System.out.println(tutor+ "\n\n\n");
        
        
       /////////////////////////
       
       
       
       
       
       
    }
}

