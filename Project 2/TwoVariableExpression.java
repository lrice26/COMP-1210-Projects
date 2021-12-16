import java.util.Scanner;

/** 
 * Program to calculate an expression result based on input values.
 * 
 * Project 2
 * @author Lyndsey Rice - COMP 1210 - D01
 * @version September 1, 2021
 */ 
 
public class TwoVariableExpression {
   /**
    * Prints given expression, inputted values of x and y, 
      and the calculated result.
    * @param args Command Line arguments - not used.
    */
    
   public static void main(String[] args) {
      
      // Scanner 
      Scanner userInput = new Scanner(System.in);
                      
      // print first three lines of output
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      System.out.print("\tx = ");
      double x = userInput.nextDouble();
      System.out.print("\ty = ");
      double y = userInput.nextDouble();
      
      // calculate result (or undefined)
      if (x * y == 0) {
         
         String result = "undefined";
         System.out.print("result is \"undefined\"");
         
      } else {
         
         double result = (4.5 * x + 12.5) * (3 * y - 9.0) / (x * y);
         System.out.print("result = " + result);
      
      }
      
             
   }
   
 
}