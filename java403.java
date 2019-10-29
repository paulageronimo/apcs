
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
public class java403
{
    public static void main(String args[])
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner keyboard = new Scanner(System.in);//data is coming in to the program, out is saving it into a file
        Scanner keyboard2 = new Scanner(System.in);
        
        System.out.print("\f");
        
        double[] numbers = {5.001, 5.999, 5.5, 5.499, .90};
        
        System.out.println("Math.floor(5.001): " + Math.floor(numbers[1]));
        System.out.println("Math.floor(5.999): " + Math.floor(numbers[2]));
        System.out.println("Math.floor(5.5): " + Math.floor(numbers[3]));
        System.out.println("Math.floor(5.499): " + Math.floor(numbers[4]));
        System.out.println();
        
        System.out.println("Math.ceil(5.001): " + Math.ceil(numbers[1]));
        System.out.println("Math.ceil(5.999): " + Math.ceil(numbers[2]));
        System.out.println("Math.ceil(5.5): " + Math.ceil(numbers[3]));
        System.out.println("Math.ceil(5.499): " + Math.ceil(numbers[4]));
        System.out.println();
        
        System.out.println("Math.round(5.001): " + Math.round(numbers[1]));
        System.out.println("Math.round(5.999): " + Math.round(numbers[2]));
        System.out.println("Math.round(5.5): " + Math.round(numbers[3]));
        System.out.println("Math.round(5.499): " + Math.round(numbers[4]));
        System.out.println();
        
    }
}
