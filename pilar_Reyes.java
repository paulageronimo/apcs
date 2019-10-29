
/**
 * 
 * While Loop grade calculator for Miss Pilar Reyes
 * 
 * Features:   identified by ID #
 *             ability to enter grades
 *             average to be permitted
 *             find out how many grades were entered
 *             if(no grades) println "No scores were entered"
 *             displayed information 
 *             and the letter grade
 *
 * @Paula Leticia Geronimo
 * @v1
 */

    import java.util.*;
    import java.util.Scanner;
    import java.text.NumberFormat;
public class pilar_Reyes
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        int ID= 0;
        
        int grades=0;
        int numGrades=0;
        int avg = 0;
        String grade = "yes";
        
        
        int check = 0;
        
        System.out.print("\f");
        
        System.out.println("* * * WELCOME TO YOUR GRADE CALCULATOR * * *");
        System.out.println("Enter '-1' to stop.");
        
        
        
        System.out.print("Enter ID#:");
        ID=keyboard.nextInt();
        
        
        if(ID<0)
        {
            System.out.print("Are you going to re-enter another student's name? ");
            grade = keyboard2.nextLine();
            if(grade.equals("no"))
            {
                System.out.println("Thank you!");
                System.exit(0);
            }
        }else{
            System.out.print("Are you going to enter your grades?");
            grade = keyboard2.nextLine();
        }
        
        
        if(grade.equals("yes")){
            System.out.print("Enter your grades: ");
            
            do
            {
                System.out.print("\n");
                grades=keyboard.nextInt();
                
                
                if(grades<0 || grades>100)
                {
                    System.out.println("Invalid. Only numbers: (+) and (0 to 100).");
                    System.out.print("Do you wish to continue inputting grades? (yes or no):");
                    grade = keyboard2.nextLine();
                    if(grade.equals("yes"))
                    {
                        while(grades<0 || grades>100)
                        {
                            System.out.println("Invalid. Only numbers: (+) and (0 to 100).");
                            System.out.print("Do you wish to continue inputting grades? (yes or no):");
                            grade = keyboard2.nextLine();
                    
                        }
                    }else{
                        grades+=grades;
                        numGrades++;
                        
                    }
                }
                
            }while(grade.equals("yes"));
            }
            if(grade.equals("no") && numGrades==0){
                System.out.println("No scores were entered.");
        }
        
        avg = grades/numGrades;
        
        
        //the print 
        
        System.out.println("Average" + avg);
        
        
        
    }
}