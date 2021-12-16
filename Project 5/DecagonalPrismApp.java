import java.util.Scanner;

/** Main method creates an instance of DecagonalPrism and returns 
 *  the object as a string.
 *  Project 4
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 17, 2021
 */
 
public class DecagonalPrismApp {
   /** Main method creates an instance of DecagonalPrism, calculates some 
    *  values, then returns the object as a string with readable information.
    *  @param args - Not used
    */
   public static void main(String[] args) {
      
      // create scanner and ask for label, edge, height
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter label, edge, and height for a decagonal prism.");
      System.out.print("\n\tlabel: ");
      String labelIn = scanner.nextLine();
      System.out.print("\tedge: ");
      double baseEdgeIn = scanner.nextDouble();
      if (baseEdgeIn < 0) {
         System.out.println("Error: edge must be non-negative.");
         return;
      }
      System.out.print("\theight: ");
      double baseHeightIn = scanner.nextDouble();
      if (baseHeightIn < 0) {
         System.out.println("Error: height must be non-negative.");
         return;
      }
      
      // create and print DecagonalPrism object
      DecagonalPrism decagonalPrism = new DecagonalPrism(labelIn, 
         baseEdgeIn, baseHeightIn);
      System.out.print(decagonalPrism);
      
   }

}