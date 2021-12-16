import java.text.DecimalFormat;

/** This contains all the methods that will be referenced and used
 *  when creating a new instance of and printing DecagonalPrism.
 *
 *  Project 4
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 17, 2021
 */
 
public class DecagonalPrism {
   
   // instance variables
   private String label;
   private double edge;
   private double height;
   
   // constructor
   
   /** DecagonalPrism constructor is blueprint for later instances of it.
    *  @param labelIn - string representing label for object
    *  @param edgeIn - double representing length of edge
    *  @param heightIn - double representing height of prism
    */
   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   
   // methods
   
   /** Method to return a String representing the label field.
    *  @return label - A string representing the label field of the object
    */
    
   public String getLabel() {
      return label;
   }
   
   /** Method to set the label to the string input, if there is any, 
    *  and return true or false representing if set was completed or not.
    *  @param labelIn - User-inputted string label
    *  @return isSet - return boolean based on if the label was set or not
    */
   
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      
      if (labelIn != null) {
         String labelInTrimmed = labelIn.trim();
         label = labelInTrimmed;
         isSet = true;
      } 
      
      return isSet;   
   }
   
   /** Method to get and return the edge value as a double.
    *  @return edge - Edge length as a double
    */
   
   public double getEdge() {
      return edge;
   }
   
   /** Method to set edge length and return a boolean based on 
    *  if the action was completed or not.
    *  @param edgeIn - The inputted edge value as a double
    *  @return isSet - Boolean representing if the edge value was
    *  set or not
    */
   
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isSet = true;
      }
      
      return isSet;
   
   }
   
   /** Method to get and return the height value as a double.
    *  @return height - A double representing the height of the prism
    */
    
   public double getHeight() {
      return height;
   }
   
   /** Method to set the height of the prism and return a boolean based
    *  on if the value was set or not.
    *  @param heightIn - A double representing inputted height value.
    *  @return isSet - A boolean representing if the action was completed
    *  or not.
    */
    
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      
      if (heightIn >= 0) {
         height = heightIn;
         isSet = true;
      }
      
      return isSet;
   }
   
   /** Method to calculate and return surface area based on edge and 
    *  height values.
    *  @return surfaceArea - Double representing calculated surface area value
    */
    
   public double surfaceArea() {
      double surfaceArea = 10 * edge * height + 5 * Math.pow(edge, 2) 
         * Math.sqrt(5.0 + (2.0 * Math.sqrt(5)));
      return surfaceArea;
   }
   
   /** Method to calculate and return baseArea based on edge value.
    *  @return baseArea - Double representing calculated base area value
    */
   
   public double baseArea() {
      double baseArea = 5.0 / 2.0 * Math.pow(edge, 2)  
         * Math.sqrt(5.0 + (2.0 * Math.sqrt(5)));
      return baseArea;
   }
   
   /** Method to calculate slant height based on height and edge values.
    *  @return lateralSA - the slant height based on height and edge values
    *  as a double
    */
   
   public double lateralSurfaceArea() {
      double lateralSA = 10 * edge * height;
      return lateralSA;
   }
   
   /** Method to calculate and return volume as a double.
    *  @return volume - Double representing volume based on height and edge
    *  values
    */
    
   public double volume() {
      double volume = 5.0 / 2.0 * Math.pow(edge, 2)  
         * Math.sqrt(5.0 + (2.0 * Math.sqrt(5))) * height;
      return volume;
   }
   
   /** Method to format and print out the instance object as a string.
    *  @return output - String output with readable formatted information
    *  about the prism.
    */
    
   public String toString() {
      
      // decimal format object
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String output = "A decagonal prism \"" + getLabel()
         + "\" with edge = " + getEdge() + " units and height = " 
         + df.format(getHeight())
         + " units, has:"
         + "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units"
         + "\n\tbase area = " + df.format(baseArea()) + " square units"
         + "\n\tlateral surface area = " + df.format(lateralSurfaceArea())
         + " square units"
         + "\n\tvolume = " + df.format(volume())
         + " cubic units\n";
         
      return output;
      
   }
   
   
   
    

}