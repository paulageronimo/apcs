
/********
 *** @Paula Leticia Geronimo
 * @v1
 * 
 * abs returns the absolute value of the arguement.
 * 
 * pow returns the first argument raised to the power of the
 * second argument.
 * 
 * 
 */

    import java.util.*;
    import java.util.Scanner;
    import java.lang.Math;
    import java.text.NumberFormat;
    
public class abs_pow
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        System.out.println("abs_pow");
        
        System.out.println("Math.abs(-25): " + Math.abs(-25));
        System.out.println("Math.abs(100): " + Math.abs(100));
        System.out.println("Math.abs(0): " + Math.abs(0));
        System.out.println();
        
        System.out.println("Math.pow(3,4): " + Math.pow(3,4));
        System.out.println("Math.pow(-2,2): " + Math.pow(-2,2));
        System.out.println("Math.pow(2,-2): " + Math.pow(2,-2));
        System.out.println();
        
    }
}
