import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** This program contains the main method for Decagonal Prism List.
 *  Project 5
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 24, 2021
 */

public class DecagonalPrismListApp {
   
   /** Main method to prompt user for input, read file, run commands,
    *  and print formatted output.
    *  @param args - Not used.
    *  @throws FileNotFoundException - When file is not found.
    */ 
   
   public static void main(String[] args) throws FileNotFoundException {
     
      // create scanner 1 
      Scanner scanner1 = new Scanner(System.in);
                  
      // prompt user for file name input
      System.out.print("Enter file name: ");
      String fileName = scanner1.nextLine(); 
      
      // create scanner 2
      Scanner scanner2 = new Scanner(new File(fileName));

      String name = scanner2.nextLine();
      
      // create ArrayList
      ArrayList<DecagonalPrism> arrayList = new ArrayList<DecagonalPrism>();
      
      while (scanner2.hasNext()) {
         String label = scanner2.nextLine();
         double edge = (double) (scanner2.nextDouble());
         double height = (double) (scanner2.nextDouble());
         
         // scan next line before moving on to next set of inputs
         String extraLine = scanner2.nextLine(); 
                  
         DecagonalPrism dp = new DecagonalPrism(label, edge, height);
         arrayList.add(dp);
      }
      
      scanner2.close();
      
      DecagonalPrismList dpList = new DecagonalPrismList(name, arrayList); 
      
      System.out.println("\n" + dpList + "\n");
      System.out.print(dpList.summaryInfo());
      
      
         
   }


}