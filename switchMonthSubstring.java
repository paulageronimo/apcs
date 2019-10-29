
/**
 * 
 *
 * @Paula Leticia Geronimo
 * @v1
 * 
 * 
 * Program that will print:
 * 
 * month, 
 * number of the month, 
 * vowels,
 * consonants, 
 * length, 
 * and second vowel substring
 * 
 * 
 * 
*/

import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
    
public class switchMonthSubstring
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        System.out.println("* * * WELCOME TO SWITCH MATH SUBSTRING * * *");
        
        String month = "";
        String monthName = "";
        int monthNo=0;
        int vowels = 0;
        int con = 0;
        int length = 0;
        int consonants = 0;
        String secVowSub = "";
        String cont = "y";
        char monthLet=' ';
        char letter = ' ';
        int n = 0;
        char let = ' ';
        int vowLoc2=0;
        
        do{
            month = "";
            monthName = "";
            monthNo=0;
            vowels = 0;
            con = 0;
            length = 0;
            consonants = 0;
            secVowSub = "";
            cont = "y";
            monthLet=' ';
            letter = ' ';
            n = 0;
            let = ' ';
            vowLoc2=0;
            
            System.out.print("Insert Month Name: ");
            month = keyboard2.nextLine();
            
            int size = month.length();
            
            for(n = 0; n<size; n++)
            {
                letter = month.charAt(n);//can only handle one letter at a time
                let= Character.toLowerCase(letter);
                monthName +=  let;//adding char to string
            }
            
            System.out.print(monthName);
            
            switch(monthName)//  NO doubles in here :0  // CAN use int, char, String
            {
                //can out formulas, and compounds or do whiles n stuff
                case "january":monthNo=1;
                break;
                case "february":monthNo=2; 
                break;
                case "march":monthNo=3; 
                break;
                case "april":monthNo=4;
                break;
                case "may":monthNo=5;
                break;
                case "june":monthNo=6;
                break;
                case "july":monthNo=7;
                break;
                case "august":monthNo=8;
                break;
                case "september":monthNo=9;
                break;
                case "october":monthNo=10;
                break;
                case "november":monthNo=11;
                break;
                case "december":monthNo=12;
            }
            
             for(n = 0; n<size; n++)
                {
                    monthLet = monthName.charAt(n);
                    switch(monthLet)
                    {
                        case 'e' : 
                        case 'u' : 
                        case 'i' :
                        case 'o' :  
                        case 'a' : vowels++;
                        if(vowels ==2)
                            vowLoc2=n;
                        break;
                        case 'E' : 
                        case 'U' : 
                        case 'I' : 
                        case 'O' : 
                        case 'A' : vowels++;
                        if(vowels ==2)
                            vowLoc2=n;
                        break;
                        default:consonants++;
                    }
                    
                }
            
            secVowSub = monthName.substring(vowLoc2, size);
            if(vowLoc2==0)
                secVowSub = "Invalid";
                
            System.out.println("\n Name:" + monthName + "\n Month: " + monthNo+ "\n Vowels: " + vowels + "\n Consonants: " + consonants+ "\n Length: " + size + "\n Second Vowel Substring: "+ secVowSub);
            
        }while(cont.equals("y") || cont.equals("Y"));    
    }
           
}
        
   
   

