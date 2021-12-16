import java.util.Scanner;
import java.text.DecimalFormat;

/** Program to calculate a mathematical result using input from the user, 
 *  then format the result properly.
 *  
 *  Project 3
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 8, 2021 
 *
 */
 
public class UsingMathMethods {
   /** Given a specific mathematical equation, the program asks the user for
    *  the number they would like to input, then it calculates and formats
    *  the result.
    *    
    *  @param args - Not used.
    *
    */
   public static void main(String[] args) {
      
      // create new Scanner and double storage variable x
      Scanner userInput = new Scanner(System.in);
      double x;
      
      // prompt user for number and store in x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // create result variable
      double result;
      
      // perform calculations
      double numerator = (8 * Math.pow(x, 4)) + Math.sqrt(Math.abs(
         (4 * Math.pow(x, 3) + 4 * Math.pow(x, 2) + 4 * x + 4)));
      double denominator = 4 + Math.abs(x);
      result = numerator / denominator;
      
      // print result
      System.out.println("Result: " + result);
      
      // convert result to String and store in stringRes
      String stringRes = Double.toString(result);
      
      // find position of period and length of string
      int index = stringRes.indexOf(".");
      int length = stringRes.length();
      
      // find characters to left and right of decimal point
      int right = length - index - 1;
      int left = length - right - 1;
      
      // print right and left values 
      System.out.println("# of characters to left of decimal point: " + left);
      System.out.println("# of characters to right of decimal point: " 
         + right); 
      
      // create decimal format object
      DecimalFormat df = new DecimalFormat("#, ##0.0##");
      
      // print result in decimal format
      System.out.println("Formatted Result: " + df.format(result));
      
   }
   

}