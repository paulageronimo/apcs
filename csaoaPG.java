
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
    
public class csaoaPG
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        System.out.println("* * * WELCOME TO CSOA REIMBURSEMENT * * *");
        
        double totalRein= 0;
        double moneyRein = -0;
        int delegates= 0;
        
        System.out.print("How many delegates are going on the trip?");
        delegates = keyboard.nextInt();
        
        for(int person = 1; person<=delegates ; person++)
        {
            System.out.print("Name: ");
            String name = keyboard2.nextLine();
        
            System.out.print("Miles needed to be Reimbursed: ");
            int miles = keyboard.nextInt();
            
            if(miles>=0 && miles<=500)
                moneyRein= .15*miles;
            if(miles>=501 && miles<=1000)
                moneyRein = 75 + (miles-500)*.12;
            if(miles>=1001 && miles<=1500)
                moneyRein = 135 + (miles-500)*.12;
            if(miles>=1501 && miles<=2000)
                moneyRein= 185 + (miles-500)*.12;
            if(miles>=2001 && miles<=3000)
                moneyRein= 225 + (miles-500)*.12;
            if(miles>=3001 && miles<=4000)
                moneyRein= 2855 + (miles-500)*.12;
            if(miles>=4001)
                System.out.println("Forget about the trip!!!");
                
            if(moneyRein>=0)
            {
                System.out.println("Name\ttotal miles\tTotal Reimbursed");
                System.out.println("------------------------------------------------------");
                System.out.println(name + "\t\t" + miles + "\t\t" + moneyRein);
            }
            
            System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            
            totalRein+=moneyRein;
            
            miles = 0;
            moneyRein = -1;
            name = "0";
        }
        
        System.out.println("\n\nOverall total reinbursed for " + delegates +"delegates:\t" + totalRein);
    }
}


 
