import java.util.Scanner;

/** Program to take input of raw time, then display in proper measurements.
 * 
 * Project 2
 * @author Lyndsey Rice - COMP 1210 - D01
 * @version September 1, 2021
 *
 */
 
public class TimeInSeconds {

   /** User inputs a raw number to represent time, then program converts and 
    *  displays it in days, hours, minutes.
    * 
    * @param args - not used.
    */
   
   public static void main(String[] args) {
   
      // create Scanner and int rawTime
      Scanner userInput = new Scanner(System.in);
      int rawTime;
      
      // prompt user for input and set rawTime to value given
      System.out.print("Enter the raw time in seconds: ");
      rawTime = userInput.nextInt(); 
      
      // if statement to determine if negative or not
      if (rawTime < 0) {
         
         System.out.print("*** Time must be non-negative. ***");
      
      } else {
      
         // conditionals for conversions 
         int remainder = rawTime;
         int days = 0;
         int hours = 0;
         int minutes = 0;
         int seconds = 0;
         
         if (rawTime >= 86400) {
            days = rawTime / 86400;
            remainder = rawTime - (days * 86400);
         }
         
         if (remainder >= 3600) {
            hours = remainder / 3600;
            remainder = remainder - (hours * 3600);
         } else {
            hours = 0;
         }
         
         if (remainder >= 60) {
            minutes = remainder / 60;
            remainder = remainder - (minutes * 60);
         } else {
            minutes = 0;
         }
         
         seconds = remainder;
         
         if (rawTime > 0 && rawTime < 60) {
            seconds = rawTime;
            
         }
                  
         System.out.println("\nTime by combined days, hours, "  
            + "minutes, seconds: ");
         System.out.println("\tdays: " + days); 
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         
         System.out.println("\n" + rawTime + " seconds = " 
            + days + " days, " + hours + " hours, " + minutes 
            + " minutes, " + seconds + " seconds");       
         
      }
      
      
   }
   

}