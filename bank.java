
/**
 * This program will allow you to enter data for an output relating to a bank account balance.
 * 
 * $$$$BANK$$$$
 *
 * @author (Paula L. Geronimo)
 * 1/17/2019
 */

import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class bank
{
    public static void main(String args[])
    {
        //   System.out.println ("Roses are red, \n\tViolets are blue, \n" + 
        //       "Sugar is sweet, \n\tBut I have \"commitment issues\",\n\t" +
        //       "So I'd rather just be friendts\n\tAt this point in our " +
        //      "relationship."); 
        //   System.out.println ("Paula Geronimo");
        //   
     
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   
    double BegBal, OldBegBal, Bal, ZeroCharge, depositAmnt, chkAmnt, ovrdrmChrg, FinBal = 0;
    double checkTotal=0;
    double MonthFees = 10;
    double extra = 15;
    int checks = 0;
    
    Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
     
    Scanner keyboard2 = new Scanner(System.in);
    
    
    System.out.print("\f");//will clear data from the screen
    
    System.out.println("......Welcome to Geronimo Bank......");
    
    System.out.print("Client Name?: ");
    String name= keyboard.nextLine();
    
    
    //You will enter the information about the personal bank statements
    System.out.print("Enter Starting Balance: $");
    BegBal = keyboard.nextDouble();
    OldBegBal=BegBal;
    
    
    
    if(BegBal == 0)
    {
        System.out.print("Would you like to deposit to your account (Type: yes or no)?");
        String deposit= keyboard2.nextLine();
        
        //System.out.print("Enter Number of Checks: ");
        //checks=keyboard.nextInt();
        if(deposit.equals("yes"))
        {
            System.out.print("Deposit amount: ");
            depositAmnt = keyboard.nextDouble();
            BegBal = BegBal + depositAmnt;
        }
        if(deposit.equals("no"))
        {
            System.out.println("Have a nice day!");
            System.exit(0);
        }
    }
    
    if (BegBal<400)
    {
       
       MonthFees = 10 + extra;
       
    }
    
    
    System.out.print("Enter Number of Checks: ");
    checks=keyboard.nextInt();
    
    System.out.print("Monthly Checks Amount: ");
    chkAmnt = keyboard.nextDouble();
    
    System.out.println("\n\n*************************** \n\n");
        
    //System.out.println("Monthly Fee: $10.0");
    
    System.out.println("Begining Balance: $" + OldBegBal+ "\n\n\n***************************\n\n");
    
    if(checks != 0){
        if(checks < 20)
        {
            checkTotal = (.10*checks);
        }
    
        if(20 <= checks && checks <= 39)
        {
            checkTotal = (.08*checks);
        }
    
        if(40 <=checks && checks<= 59)
        {
        checkTotal = (.06*checks);
        }
        
        if(checks>=60)
        {
            checkTotal = (.04*checks);
        }
        
        MonthFees = checkTotal + MonthFees;
        System.out.println("Monthly Fees: $" + MonthFees + "\n\n"); 
    
        FinBal = BegBal - MonthFees - chkAmnt;
        
        if(FinBal<0)
        {
            System.out.println("******OVERDRAWN ACCOUNT****** \n\na 1% charge was added to your account\n");
            MonthFees = (-FinBal * .01) + MonthFees; 
        
            System.out.println("New Monthly Fees: $" + MonthFees);
        
            FinBal = BegBal - chkAmnt -MonthFees;
        }
    
    }else{
        
        ZeroCharge = BegBal * .02;
        
        MonthFees = MonthFees + ZeroCharge;
        System.out.println("Monthly Fees: $" + MonthFees + "\n\n"); 
    
        FinBal = BegBal - MonthFees;
        

    }
    
    System.out.println("Balance: $" + FinBal + "\n\n");
    
    System.out.println("Thank you for using Geronimo Bank, " + name + "!");
    
  }
}
    
