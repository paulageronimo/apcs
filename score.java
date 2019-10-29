/**
 * 
 * @Paula Leticia Geronimo
 * @v1
 *
 */
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator; 
public class score 
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);
        out.print("\f");
        out.println("* * * WELCOME TO SCORE.JAVA  * * *");
        String cont = "y";
        int size = 0;
        int data = 0;
        int exit = 0; //-999
        int total = 0;
        int max = 0;
        int min = 100;
        int n = 0;
        
        String AVG = "0.00";
        do
        {
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            out.println("\n----------------------------------\n");
            out.print("Size of array: ");//size inputted from keyboard
            size = keyboard.nextInt();
            //int array
            int grades[];
            grades = new int[size];
            out.print("Input Grades: \n");
            for(n = 0; n<size; n++)
            {
                data = keyboard2.nextInt();//data for array is inputted from keyboard
                while(data>100 || data<0)
                {
                    out.println("**ERROR.**\nInput valid number 0-100.");//error message
                    data=0;//resets inputted data
                    data = keyboard2.nextInt();//reinput data
                }
                grades[n]=data;
                if(data>max)
                    max=data;//finding max
                if(data<min)
                    min=data;//finding min
                if((n+1)!=size)
                out.print("Input Grades: \n");
                total+=data;
            }
            out.println("----------------------------------\n\nGrades Inputted\n");
            for(int v: grades)//for each method
                out.println(v);
            double Total=Double.valueOf(total);
            double Size = Double.valueOf(size);
            double avgcal=Total/Size;
            AVG = new DecimalFormat("00.00").format(avgcal);//provides avg up to hundredths place
            out.println("\n\n----------------------------------\n\nTotal: " + total + "\nAverage:" + AVG +  "\nMax: " + max + "\nMin: " + min);//printing total, average, max, and min
            min=100;//reset values
            max=0;
            Total=0;
            Size=0;
            size = 0;
            data=0;
            n=0;
            total=0;
            avgcal=0.00;
            AVG="0.00";//end of reset values
            out.println("Would you like to run again?");
            cont = keyboard3.nextLine();
        }while(cont.equals("y") || cont.equals("Y")||!cont.equals("-999"));//loop, -999 exiting the loop
    }
}
