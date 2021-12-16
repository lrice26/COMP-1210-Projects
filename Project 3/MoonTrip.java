import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/** Program to accept coded ticket input, then print ticket information
 *  and discounted cost.
 *
 *  Project 3
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 8, 2021
 *
 */

public class MoonTrip {
  
   /** Function takes user input of specifically coded ticket, then separates
    *  it into distinct parts, calculates a discounted ticket cost, then prints
    *  all the information in a readable way. It also generates a random 
    *  prize number.
    *
    *  @param args - Not used.
    */
    
   public static void main(String[] args) {
      
      // create Scanner, ask user for input, store as string variable
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter ticket code: ");
      String ticketCode = userInput.nextLine();
      
      // trim input
      String newTicketCode = ticketCode.trim();
      
      // if statement to determine if valid ticket code input
      if (newTicketCode.length() < 27) {
        
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.print("Ticket code must have at least 27 characters.");
     
      } else { // continue with the rest only if valid input
      
         // create decimal formats needed
         DecimalFormat pricedf = new DecimalFormat("$#,##0.00");
         DecimalFormat discountdf = new DecimalFormat("0%");
         DecimalFormat prizedf = new DecimalFormat("00000");
         
         // separate ticketCode into distinct parts and store
         String date = newTicketCode.substring(0, 8); 
         String time = newTicketCode.substring(8, 12);
         double price = (Double.parseDouble(newTicketCode.substring(12, 21))
             / 100);
         double discount = (Double.parseDouble(newTicketCode.substring(21, 23)))
             / 100;
         String seat = newTicketCode.substring(23, 26);
         String ticketDescription = newTicketCode.substring(26, 
            newTicketCode.length());
         
         // calculate discounted price and store in new variable
         double cost = price * (1 - discount);
         
         // create random prize number
         Random random = new Random();
         double prize = random.nextInt(100000);
         
         // print correct output if ticket code is valid
         System.out.println("");
         
         System.out.println("Ticket: " + ticketDescription.trim()
            + "   Date: "
            + date.substring(0, 2) + "/" + date.substring(2, 4) + "/"
            + date.substring(4, 8) + "   Time: " + time.substring(0, 2)
            + ":" + time.substring(2, 4));
            
         System.out.println("Seat: " + seat + "   Price: " 
            + pricedf.format(price)
            + "   Discount: " + discountdf.format(discount) + "   Cost: "
            + pricedf.format(cost));
            
         System.out.print("Prize Number: " + prizedf.format(prize));
         
      }
   
   
   
   }

}