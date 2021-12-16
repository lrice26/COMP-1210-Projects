import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/** This program creates an array list of Decagonal Prism objects and makes
 *  calculations, and has toString and summaryInfo methods for printing output.
 *  Project 5
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 24, 2021
 */
 
public class DecagonalPrismList {
   
   // instance variables
   private String name = "";
   private ArrayList<DecagonalPrism> objArray = new ArrayList<DecagonalPrism>();
   
   /** Constructor for class is used to create new Decagonal Prism list 
    *  instances.
    *  @param nameIn - Name of list
    *  @param objArrayIn - Object array to be entered
    */
   public DecagonalPrismList(String nameIn, 
      ArrayList<DecagonalPrism> objArrayIn) {
      // assign values to instance variables
      name = nameIn;
      objArray = objArrayIn;
   }
   
   /** Method to return the name of the list.
    *  @return name - The name of the list as a string.
    */
   public String getName() {
      return name;
   }  
   
   /** Method to return the number of objects in the list.
    *  @return Integer representing the number of objects in the list;
    *   0 if empty.
    */
   public int numberOfDecagonalPrisms() {
      // return int of size, or 0 if empty
      if (objArray.size() > 0) {
         return objArray.size();
      } else {
         return 0;
      }
   }
   
   /** Method to return total surface area of all objects in the list.
    *  @return totalSA - Value representing total surface area of all objects
    *  in the list, or 0 if the list is empty.
    */
   public double totalSurfaceArea() {
      // while loop to calculate SA for each and keep running total of total SA
      if (objArray.size() > 0) {
         double totalSA = 0.0;
         int index = 0;
         while (index < objArray.size()) {
            DecagonalPrism d1 = objArray.get(index);
            totalSA += d1.surfaceArea();
            index++;
         }
         return totalSA;
        
      } else {
         double totalSA = 0.0;
         return totalSA;      
      }
      
   }
   
   /** Method to return total base area of all objects in the list.
    *  @return totalBA - Value representing total base area of all objects
    *  in the list, or 0 if the list is empty.
    */
   public double totalBaseArea() {
   
      // while loop to calculate BA for each and keep running total of total BA
      if (objArray.size() > 0) {
         double totalBA = 0.0;
         int index = 0;
         while (index < objArray.size()) {
            DecagonalPrism d1 = objArray.get(index);
            totalBA += d1.baseArea();
            index++;
         }
         return totalBA;
        
      } else {
         double totalBA = 0.0;
         return totalBA;
      }
      
   }

   /** Method to return total lateral surface area of all objects in the list.
    *  @return totalLSA - Value representing total lateral surface area of all
    *  objects in the list, or 0 if the list is empty.
    */
   public double totalLateralSurfaceArea() {
   
      // while loop to calculate LSA for each; keep running total of total LSA
      if (objArray.size() > 0) {
         double totalLSA = 0.0;
         int index = 0;
         while (index < objArray.size()) {
            DecagonalPrism d1 = objArray.get(index);
            totalLSA += d1.lateralSurfaceArea();
            index++;
         }
         return totalLSA;
        
      } else {
         double totalLSA = 0.0;
         return totalLSA;
      }
      
   }
   
   /** Method to calculate and return total volume for all objects in list.
    *  @return totalVol - Double representing total volume for all objects
    *  in list, or 0 if list is empty.
    */
   public double totalVolume() {
      if (objArray.size() > 0) {
         double totalVol = 0.0;
         int index = 0;
         while (index < objArray.size()) {
            DecagonalPrism d1 = objArray.get(index);
            totalVol += d1.volume();
            index++;
         }
         return totalVol;
         
      } else {
         double totalVol = 0.0;
         return totalVol;
      }
      
   }
   
   /** Method to calculate and return average surface area for list objects.
    *  @return avgSA - Double representing average surface area for all 
    *  objects in the list, or 0 if list is empty.
    */
   public double averageSurfaceArea() {
      if (objArray.size() > 0) {
         
         double totalSA = 0.0;
      
         if (objArray.size() > 0) {
            int index = 0;
            while (index < objArray.size()) {
               DecagonalPrism d1 = objArray.get(index);
               totalSA += d1.surfaceArea();
               index++;
            }
                             
         }
                           
         double avgSA = totalSA / objArray.size();
         return avgSA;
      } else {
         return 0; 
      }
   }
   
   /** Method to calculate and return average volume for all list objects.
    *  @return avgVol - Double representing average volume for all objects
    *  in the list, or 0 if list is empty.
    */
   public double averageVolume() {
      if (objArray.size() > 0) {
         
         double totalVol = 0.0;
      
         if (objArray.size() > 0) {
            int index = 0;
            while (index < objArray.size()) {
               DecagonalPrism d1 = objArray.get(index);
               totalVol += d1.volume();
               index++;
            }
                             
         }
                           
         double avgVol = totalVol / objArray.size();
         return avgVol;
      } else {
         return 0; 
      }
   }
   
   /** Method to return a string output of the name of the list and each
    *  decagonal prism object.
    *  @return output - String with name of list and each object in list.
    */
   public String toString() {
      int index = 0;
      String output = name + "\n";
      
      while (index < objArray.size()) {
         output += "\n" + objArray.get(index).toString();
         index++;
      }
      return output;
   }
   
   /** Method to return a string of list summary information values.
    *  @return output - String with certain mathematical values for the list.
    */
   public String summaryInfo() {
   
      String output = "----- Summary for " + name + " -----";
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      output += "\nNumber of Decagonal Prisms: " + objArray.size()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Base Area: " + df.format(totalBaseArea())
         + "\nTotal Lateral Surface Area: " 
         + df.format(totalLateralSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
   
      return output;
   }
   
   /** Method to return the ArrayList of DecagonalPrism objects.
    *  @return An ArrayList of the DecagonalPrism objects
    */
   public ArrayList<DecagonalPrism> getList() {
      return objArray;
   }
    
   /** Method to take a string parameter of the file name, read and store it,
    *  then create an ArrayList of DP objects, using the list name and list to
    *  create a new DecagonalPrismList object and return it.
    *  @param fileNameIn - The name of the file as a string
    *  @throws FileNotFoundException - FileNotFoundException
    *  @return newDPList - A DecagonalPrismList object with label from fileName
    */
   public DecagonalPrismList readFile(String fileNameIn) 
      throws FileNotFoundException {
      
      String fileName = fileNameIn;
      File file = new File(fileName);
      Scanner scanFile = new Scanner(file);
      ArrayList<DecagonalPrism> dpArrayList = new ArrayList<DecagonalPrism>();
      
      String nameOfList = scanFile.nextLine();
                    
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         double edgeIn = scanFile.nextDouble();
         double heightIn = Double.parseDouble(scanFile.next());
         String extra = scanFile.nextLine();
         
         DecagonalPrism newDP = new DecagonalPrism(labelIn, edgeIn, heightIn);
         dpArrayList.add(newDP);
      }
      
      scanFile.close();
      
      DecagonalPrismList newDPList = new DecagonalPrismList(nameOfList,
         dpArrayList);
      
      return newDPList;
   }
   
   /** Method to add a DecagonalPrism object to the DecagonalPrismList object.
    *  @param labelIn - String representing label of new Decagonal Prism
    *  @param edgeIn - Double representing the edge length of the DP
    *  @param heightIn - Double representing the height of the DP
    */
   public void addDecagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      DecagonalPrism newDP = new DecagonalPrism(labelIn, edgeIn, heightIn);
      objArray.add(newDP);
   }  
   
   /** Method to find a DecagonalPrism object given the label.
    *  @param label - String of the label of the object being located.
    *  @return Returns the corresponding DecagonalPrism object, or null if
    *  not found in the list.
    */
   public DecagonalPrism findDecagonalPrism(String label) {
      for (DecagonalPrism dp : objArray) {
         if (dp.getLabel().equalsIgnoreCase(label)) {
            return dp;
         }
      }
      return null;
   }
    
   /** Method to delete a DecagonalPrism from the list and return the object.
    *  @param label - String representing the label of the object being located
    *  @return Returns the corresponding DecagonalPrism object if it was found
    *  and deleted, or null otherwise.
    */
   public DecagonalPrism deleteDecagonalPrism(String label) {
      for (DecagonalPrism dp: objArray) {
         if (dp.getLabel().equalsIgnoreCase(label)) {
            objArray.remove(dp);
            return dp;
         }
      }
      return null;
   }
   
   /** Method to edit a DecagonalPrism object in the list, if found.
    *  @param labelIn - The string label of the object to be found
    *  @param edgeIn - Double representing the new edge of the object
    *  @param heightIn - Double representing the new height of the object
    *  @return Returns true or false if object is edited or not, respectively
    */
   public boolean editDecagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      
      for (DecagonalPrism dp: objArray) {
         if (dp.getLabel().equalsIgnoreCase(labelIn)) {
            dp.setEdge(edgeIn);
            dp.setHeight(heightIn);
            return true;
         }
      }
      
      return false;
   }   
   
}