/**
 * 
 * 
 * 
 * Features: determines if a number is a perfect square  
 * 
 *
 * @Paula Leticia Geronimo
 * @v1
 * 
 * 
 */

    import java.util.*;
    import java.util.Scanner;
    import java.text.NumberFormat;
    import java.text.DecimalFormat;
    import java.lang.Math;
    
    
public class squares
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        int numInp = 0;
        double rootCheck1 = 0;
        double root = 0; 
        double rootSub=1 ;
        double rootCheck2=0;
        
        String sq = "0";
        String cont = "yes";
        
        System.out.println("* * * WELCOME TO SQUARES.JAVA * * *");
        System.out.println("* * * * * input -1 to exit * * * * *");
        
        do
        {
            System.out.print("Input Num: ");
            numInp=keyboard.nextInt();
            
            if(numInp<0)
            {
                System.out.println("INVALID NUMBER. DO YOU WISH TO CONTINUE? ");
                cont = keyboard2.nextLine();
                if(cont.equals("no"))
                {
                    System.out.println("Thank you for using SQUARES.JAVA!");
                    System.exit(0);
                }
            }
            
            root = Math.sqrt(numInp);
            
            rootCheck1 = Math.ceil(root);
            rootCheck2 = Math.floor(root);
            
            rootSub = rootCheck1-rootCheck2;
            
            if(rootSub == 0)
            {
                System.out.println("PERFECT SQUARE");
            }else{
                System.out.println("NOT A PERFECT SQUARE");
            }
            
        }while(cont.equals("yes") || cont.equals("YES"));
            
        
    
    }
}

