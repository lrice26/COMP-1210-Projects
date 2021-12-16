import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/** This program presents the user with a menu of eight options that can
 *  be called to do various things with the DecagonalPrismList class.
 *  Project 6
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 1, 2021
 */

public class DecagonalPrismListMenuApp {
   
   /** The main method shows the user a menu of actions, then reads in their
    *  input and performs the action they choose on DecagonalPrismList class.
    *  @param args - Not used
    *  @throws FileNotFoundException - FileNotFoundException
    */
   public static void main(String[] args) throws FileNotFoundException {
      // create empty DPList object
      String listName = "*** no list name assigned ***";
      ArrayList<DecagonalPrism> dpArrayList = new ArrayList<DecagonalPrism>();
      DecagonalPrismList dpList = new DecagonalPrismList(listName, dpArrayList);
   
      // create Scanner
      Scanner scanner = new Scanner(System.in);
      
      // print instructions and menu of options to user
      System.out.println("DecagonalPrism List System Menu");
      System.out.println("R - Read File and Create DecagonalPrism List"
         + "\nP - Print DecagonalPrism List"
         + "\nS - Print Summary"
         + "\nA - Add DecagonalPrism"
         + "\nD - Delete DecagonalPrism"
         + "\nF - Find DecagonalPrism"
         + "\nE - Edit DecagonalPrism"
         + "\nQ - Quit");
      
      String userInput;
     
      // do while loop to keep asking for user input
      do {
         
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         
         // scan and store in userInput, then make upper case
         userInput = scanner.nextLine();
         userInput = userInput.toUpperCase().trim();
         
                  
         // switch and cases based on user input
         switch (userInput.toUpperCase()) {
            
            case "R":
               System.out.print("\tFile name: ");
               String fileName = scanner.nextLine();
               dpList = dpList.readFile(fileName);
       
               System.out.println("\tFile read in and DecagonalPrism List" 
                  + " created\n");
               break;
               
            case "P":
               System.out.print("\n" + dpList.toString() + "\n");
               break;
            
            case "S":
               System.out.println("\n" + dpList.summaryInfo() + "\n");
               break;
            
            case "A":
               System.out.print("\tLabel: ");
               String newLabel = scanner.nextLine();
               System.out.print("\tEdge: ");
               double newEdge = Double.parseDouble(scanner.nextLine());
               System.out.print("\tHeight: ");
               double newHeight = Double.parseDouble(scanner.nextLine());
               
               dpList.addDecagonalPrism(newLabel, newEdge, newHeight);
               
               System.out.println("\t*** DecagonalPrism added ***");
               
               break;
            
            case "D":
               System.out.print("\tLabel: ");
               String deleteLabel = scanner.nextLine();
               
               if (dpList.deleteDecagonalPrism(deleteLabel) != null) {
                  System.out.println("\t\"" + deleteLabel + "\" deleted\n");
               } else {
                  System.out.println("\t\"" + deleteLabel + "\" not found\n");
               }
               
               break;
               
            case "F":
               System.out.print("\tLabel: ");
               String findLabel = scanner.nextLine();
               
               if (dpList.findDecagonalPrism(findLabel) != null) {
                  System.out.println(dpList.findDecagonalPrism(findLabel)
                     + "\n");
               } else {
                  System.out.println("\t\"" + findLabel + "\" not found\n");    
               }
               
               break;
            
            case "E":
               System.out.print("Label: ");
               String editLabel = scanner.nextLine();
               System.out.print("Edge: ");
               double editEdge = Double.parseDouble(scanner.nextLine());
               System.out.print("Height: ");
               double editHeight = Double.parseDouble(scanner.nextLine());
               
               if (dpList.editDecagonalPrism(editLabel, editEdge, 
                  editHeight)) {
                  System.out.println("\"" + editLabel + "\" successfully " 
                     + "edited\n");
               } else {
                  System.out.println("\"" + editLabel + "\" not found\n");
               }
               
               break;
            
            case "Q":
               break;
         
            default: 
               System.out.println("\t*** invalid code ***\n");
               break;
                        
         }
      
      } while (!userInput.equalsIgnoreCase("Q"));
   }


}