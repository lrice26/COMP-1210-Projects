import java.text.DecimalFormat;

/** This class stores the name of the list and an array of TriangularPrism
 *  objects and has methods for interacting with info about the object list.
 *  
 *  Project 8
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 29, 2021
 */
 
public class TriangularPrismList {
   
   // instance variables/fields
   private String name = "";
   private TriangularPrism[] tpArray;
   private int size = 0;
   
   /** Constructor for TriangularPrismList object instances.
    *  @param nameIn - The name of the list as a string
    *  @param tpArrayIn - The array of TP objects to store
    *  @param sizeIn - The number of TP objects in the array
    */
   public TriangularPrismList(String nameIn, TriangularPrism[] tpArrayIn,
       int sizeIn) {
      
      // set values to instance variables
      name = nameIn;
      tpArray = tpArrayIn;
      size = sizeIn;
   }
   
   /** Method to return the name of the list.
    *  @return Returns the name of the list as a string
    */
   public String getName() {
      return name;  
   }
   
   /** Method to return the number of TriangularPrism objects in the list.
    *  @return Returns length of list, or 0 if none
    */
   public int numberOfTriangularPrisms() {
      return size;
   }
   
   /** Method to return total surface area for all TP objects in list.
    *  @return totalSA - Total surface area for all objects in list as a double
    */
   public double totalSurfaceArea() {
      double totalSA = 0.0;
      
      if (tpArray == null) {
         return 0.0;
      }
      
      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i] == null) {
            continue;
         } else {
            totalSA += tpArray[i].surfaceArea();
         }
      }
      
      return totalSA;
   }
   
   /** Method to return total volume for all TP objects in list.
    *  @return totalVol - Total volume for all objects in list, as a double
    */
   public double totalVolume() {
      double totalVol = 0.0;
      
      if (tpArray == null) {
         return 0.0;
      }
      
      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i] == null) {
            continue;
         } else {
            totalVol += tpArray[i].volume();         }
      }
            
      return totalVol;
   }
   
   /** Method to calculate average surface area for all TP objects in list.
    *  @return avgSA - Average surface area for all TP objects in list (double)
    */
   public double averageSurfaceArea() {
      
      if (tpArray == null) {
         return 0.0;
      }
      
      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i] == null) {
            return 0.0;
         }
      }
      
      double avgSA = totalSurfaceArea() / size;
      return avgSA;     
   }
   
   /** Method to calculate average volume for all TP objects in the list.
    *  @return avgVol - Average volume for all TP objects in list as a double
    */
   public double averageVolume() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");

      if (tpArray.length == 0) {
         return 0.0;   
      }
      
      for (int i = 0; i < size; i++) {
         if (tpArray[i] == null) {
            return 0.0;
         }
      }
      
      double avgVol = totalVolume() / numberOfTriangularPrisms();
      String avgVolStr = df.format(avgVol);
      avgVol = Double.parseDouble(avgVolStr);
      
      return avgVol;
   }
   
   /** Method to return TriangularPrismList as formatted string output.
    *  @return output - The list as a formatted string
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "----- Summary for " + name + " -----"
         + "\nNumber of TriangularPrisms: " + size
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
      
      return output;
   }
   
   /** Method to return the array of TriangularPrism objects.
    *  @return Returns the array of TriangularPrism objects in the list
    */
   public TriangularPrism[] getList() {
      return tpArray;
   }
   
   /** Method to add a TriangularPrism to the list.
    *  @param labelIn - String label for new TP object
    *  @param edgeIn - Double edge length for new TP
    *  @param heightIn - Double height value for new TP
    */
   public void addTriangularPrism(String labelIn, double edgeIn, 
      double heightIn) {
      
      TriangularPrism tpNew = new TriangularPrism(labelIn, edgeIn, heightIn);
      TriangularPrism[] tpArrayNew = new TriangularPrism[(tpArray.length + 1)];
      
      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i] == null) {
            return;
         }
      }
      
      for (int i = 0; i < tpArrayNew.length - 1; i++) {
         tpArrayNew[i] = tpArray[i];
      }  
      
      tpArrayNew[tpArrayNew.length - 1] = tpNew;
      
      tpArray = tpArrayNew;
      
      size++;
      
   }   
   
   /** Method to find a specific TriangularPrism in the list, or null.
    *  @param labelIn - The label of the TP object being found
    *  @return Returns the matching TP object, or null if not found
    */
   public TriangularPrism findTriangularPrism(String labelIn) {
      
      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i] == null) {
            return null;
         }
      }

      for (int i = 0; i < tpArray.length; i++) {
         if (tpArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            return tpArray[i];
         }
      }
      
      return null;
   }
   
   /** Method to find and delete a TriangularPrism object from list.
    *  @param labelIn - The label of the TP object to be deleted
    *  @return Returns the TriangularPrism deleted, or null if not found
    */
   public TriangularPrism deleteTriangularPrism(String labelIn) {
      
      if (findTriangularPrism(labelIn) != null) {
      
         TriangularPrism tp = findTriangularPrism(labelIn);
         TriangularPrism[] tpArrayNew = new TriangularPrism[tpArray.length];
         
         int count = 0;
         
         for (int i = 0; i < tpArray.length; i++) {
            
            if (tpArray[i] == tp) {
               continue;
            } else {
               tpArrayNew[count] = tpArray[i];
               count++;
            }  
         }
         
         tpArrayNew[tpArrayNew.length - 1] = null;
         
         size--;
         
         return tp;
      } else {
         return null;
      } 
   }
   
   /** Method to edit a TP object in the list.
    *  @param labelIn - Label used to find the object
    *  @param edgeIn - The new edge value
    *  @param heightIn - The new height value
    *  @return Returns true if found and edited, or false if not
    */
   public boolean editTriangularPrism(String labelIn, double edgeIn, 
      double heightIn) {
      
      if (findTriangularPrism(labelIn) == null) {
         return false;
      }
      
      for (int i = 0; i < size; i++) {
         if (tpArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            tpArray[i].setHeight(heightIn);
            tpArray[i].setEdge(edgeIn);
         }   
      }
      
      return true; 
      
   }
   
   /** Method to find the TP object with the largest volume.
    *  @return Returns the TP object with the largest volume, or null if empty
    */
   public TriangularPrism findTriangularPrismWithLargestVolume() {
      
      if (size > 0) {
         
         TriangularPrism tpLV = tpArray[0];
         
         for (int i = 0; i < tpArray.length; i++) {
            if (tpArray[i].volume() > tpLV.volume()) {
               tpLV = tpArray[i];
            }
         }
         
         return tpLV;
      }
      
      return null;
            
   } 
   
   
}