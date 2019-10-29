
/**
 * Write a description of class barChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.*;
    import java.util.Scanner;
    import java.text.NumberFormat;
public class barChart
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        int storeCalc1 = 0;
        int storeCalc2 = 0;
        int storeCalc3 = 0;
        int storeCalc4 = 0;
        int storeCalc5 = 0;
        
        int current = 0;
        int largest = 0;
        int smallest = 0;
        
        int store = 0;
        int store1 = 0;
        int store2 = 0;
        int store3 = 0;
        int store4 = 0;
        int store5 = 0;
        
        
        
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        String cont = "yes";
        
        do{
        System.out.print("\f");
        
        
        System.out.print("* * * * ROUND TO NEAREST $100 * * * *\n\n");
        
        for(int n = 1; n<=5; n++)
        {
            System.out.print("Enter today's sales for store " + n + ": $");
            store = keyboard.nextInt();
            
            while(store < 100){
                System.out.println("Invalid Number. Try Again.");
                System.out.print("Enter today's sales for store " + n + " : $");
                store = keyboard.nextInt();
            
            }
            
            
            current = store;
            
            if(n==1){
                store1= store;
                storeCalc1= (store1)/100;
                smallest = current;
            }
            
            if(n==2){
                store2= store;
                storeCalc2= (store2)/100;
            }
            
            if(n==3){
                store3= store;
                storeCalc3= (store3)/100;
            }
            
            if(n==4){
                store4= store;
                storeCalc4= (store4)/100;
            }
            
            if(n==5){
                store5= store;
                storeCalc5= (store5)/100;
            }
            
            
            
            if(current>largest){
                largest = current;
            }
            
            if(current<smallest){
                smallest=current;
            }
        }
        
        
        System.out.println("\n\nTotal amount for all stores: $" + (store1+store2+store3+store4+store5));
        
                
        
        
        System.out.println("\n\nSALES BAR CHART\n");
        
        
        System.out.print("Store 1: ");
        
        for(int i=1; i<=storeCalc1; i++){
            System.out.print("*");
        }
        
        System.out.print("\nStore 2: ");
        for(int i=1; i<=storeCalc2; i++){
            System.out.print("*");
        }
        
        System.out.print("\nStore 3: ");
        for(int i=1; i<=storeCalc3; i++){
            System.out.print("*");
        }
        
        System.out.print("\nStore 4: ");
        for(int i=1; i<=storeCalc4; i++){
            System.out.print("*");
        }
        
        System.out.print("\nStore 5: ");
        for(int i=1; i<=storeCalc5; i++){
            System.out.print("*");
        }
        
        
        System.out.println("\n\nSmallest store amount: $" + smallest);
        System.out.println("\nBiggest store amount: $" + largest);
        
        System.out.print("Do you wish to continue?");
        cont = keyboard2.nextLine();
        
    }while(cont.equals("yes"));
    }
    
}
