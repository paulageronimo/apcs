
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
    
public class lesson
{
    public static void main(String args[])
    {
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        out.print("\f");
        out.println("* * * WELCOME TO   * * *");
        
        String cont = "1";
        String word = "";
        String currentWord = "";
        String wordName = "";
        
        char letter = ' ';
        char wordLet = ' ';
        char let = ' ';
        
        int m = 0;
        int n = 0;
        int size = 0;
        int vE = 0;
        int vA =0;
        int vO=0;
        int vI = 0;
        int vU =0;
        int vowels = 0;
        
        do
        {
            ArrayList<String>WordList = new ArrayList<String>();
            
            out.print("Input word. If done, input '-1' : " );
            
            do
            {
                word = keyboard2.nextLine();
                WordList.add(word);
                if(word.equals("-1"))
                    WordList.remove("-1");
            }while(!word.equals("-1"));
            
            out.println( "\n\n ================================= \n\n ");
            
            ListIterator iterator = WordList.listIterator();
            while (iterator.hasNext())
                out.println(iterator.next());
            
            out.print("\n");
            
            out.println( "\n\n ================================= \n\n ");
            
            for(m = 0; m<WordList.size(); m++)
            {
                currentWord = WordList.get(m);
                size = currentWord.length();
                
                for(n = 0; n<size; n++)
                {
                    letter = currentWord.charAt(n);
                    let= Character.toLowerCase(letter);
                    wordName+=let;
                }
                
                for(n = 0; n<size; n++)
                    {
                        wordLet = wordName.charAt(n);
                        switch(wordLet)
                        {
                            case 'e' : 
                            case 'E' : 
                            vE++;
                            vowels++;
                            break;
                            case 'u' : 
                            case 'U' : 
                            vU++;
                            vowels++;
                            break;
                            case 'i' :
                            case 'I' : 
                            vI++;
                            vowels++;
                            break;
                            case 'o' : 
                            case 'O' :
                            vO++;
                            vowels++;
                            break; 
                            case 'a' : 
                            case 'A' : 
                            vA++;
                            vowels++;
                            break; 
                            default:
                        }
                        
                    }
                    
                currentWord = "";
                wordName = "";
                size = 0;
                wordLet = ' ';
                letter = ' ';
                let = ' ';
            }
            
            out.println("Total vowels a = " + vA);
            out.println("\nTotal vowels e = " + vE);
            out.println("\nTotal vowels i = " + vI);
            out.println("\nTotal vowels o = " + vO);
            out.println("\nTotal vowels u = " + vU);
            
            out.println("\nTotal vowels = " + vowels);
            
            
            out.println("Would you like to continue? ");
            cont = keyboard.nextLine();
            
            vowels = 0;
            vA =0;
            vE =0;
            vI =0;
            vO =0;
            vU =0;
            currentWord = "";
            wordName = "";
            size = 0;
            wordLet = ' ';
            letter = ' ';
            let = ' ';
            word = "";
            
            
        }while(!cont.equals("-1") || !cont.equals("-1"));
        
        
    }
}
