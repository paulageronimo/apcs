
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
import static java.lang.System.*;
    
public class presidents
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3= new Scanner(System.in);
        
        System.out.print("\f");
        
        System.out.println("* * * WELCOME TO PRESIDENTS  * * *");
        
        String cont = "y";
        
        int lines = 0;
        int x = 0;
        int n = 0;
        int billVal = 0;
        int totBillVal = 0;
        int end = 0;
        int prezNumLine = 0;
        int l = 0;
        
        String name = "y";
        String prezName = "";
        String prezName1 = "";
        
        char let = ' ';
        char letter = ' ';
        
        
        ArrayList<String>Li = new ArrayList<String>();
        
        do
        {
            out.println("How many lines?");
            lines = keyboard.nextInt();
            
            for(x=0; x<lines; x++)
            {
                billVal = 0;
                totBillVal = 0;
                prezName = "";
                out.println("Inset President Names: ");
                
                do
                {
                    name = "";
                    prezName = "";
                    let = ' ';
                    letter = ' ';
                    out.print("");
                    name = keyboard2.nextLine();
                    Li.add(name);
                    out.println(name);
                    for(n = 0; n<name.length(); n++)
                    {
                        letter = name.charAt(n);//can only handle one letter at a time
                        let= Character.toLowerCase(letter);
                        prezName +=  let;
                    }
                    while(!prezName.equals("franklin") && !prezName.equals("grant") && !prezName.equals("washington") && !prezName.equals("jackson") && !prezName.equals("hamilton") && !prezName.equals("lincoln"))
                    {
                        if(name.equals("-1"))
                            Li.remove("-1");
                            else{
                            out.println("ERROR. Input only presidents on the dollar bills.");
                            name = keyboard.nextLine();
                            int size = name.length();
                        }
                        for(n = 0; n<name.length(); n++)
                        {
                            letter = name.charAt(n);//can only handle one letter at a time
                            let= Character.toLowerCase(letter);
                            prezName +=  let;
                        }
                    }
                    if(prezName.equals("franklin") || prezName.equals("grant") || prezName.equals("washington") || prezName.equals("jackson") ||prezName.equals("hamilton") || prezName.equals("lincoln"))
                    {
                        
                        switch(prezName)
                        {
                            case "franklin" : billVal = 100;
                            break;
                            case "grant": billVal = 50; 
                            break;
                            case "hamilton": billVal = 20; 
                            break;
                            case "lincoln": billVal = 10; 
                            break;
                            case "washington": billVal = 5; 
                            break;
                            case "jackson": billVal = 1; 
                            break;
                            //default: billVal = 0;
                        }
                        totBillVal+=billVal;
                    }
                    if(name.equals("-1"))
                        Li.remove("-1");
                        
                        
                }while(!name.equals("-1") || !prezName.equals("-1"));
                
                
            System.out.println("Total bill value: $" + totBillVal);
                
                
            }
            
            
            
            billVal = 0;
            totBillVal = 0;
            lines = 0;
            x = 0;
            n = 0;
            name = "";
            let = ' ';
            letter = ' ';
            
            out.println("Do you want to rerun?");
            cont = keyboard2.nextLine();
            
            
        }while(cont.equals("y") || cont.equals("Y"));
        
        
    }
}
