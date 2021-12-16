import java.text.DecimalFormat;

/** Class for constructor and methods of TriangularPrism objects.
 *
 * Project 7A
 * @author Lyndsey Rice - COMP 1210 - D01
 * @version October 15, 2021
 */
 
public class TriangularPrism implements Comparable<TriangularPrism> {
   
   // variables - set to private
   private String label = "";
   private double edge = 0;
   private double height = 0;
   private static int count = 0;
   
   /** Constructor for TriangularPrism objects. Accepts three parameters.
    *  @param labelIn - The label of the TriangularPrism as a string.
    *  @param edgeIn - Double representing the edge value.
    *  @param heightIn - Double representing the height value.
    */
   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      count++;
   }
   
   /** Method to return the label as a string.
    *  @return label - The label of the object as a string.
    */
   public String getLabel() {
      return label;
   }
   
   /** Method to set the label of the object to a new string. Returns true if
    *  successful, or false if not.
    *  @param labelIn - String representing new label.
    *  @return Returns true if label successfully set, or false if not.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      } else {
         return false;
      }
   }
   
   /** Method to return the edge value of the object.
    *  @return edge - double representing the object's edge value.
    */
   public double getEdge() {
      return edge;
   }
   
   /** Method to set the edge value of an object. Returns true if successful,
    *  or false if not.
    *  @param edgeIn - double representing the new edge value.
    *  @return Returns true if edge value successfully set, or false if not.
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }  
   
   /** Method to return the height value of the object.
    *  @return height - double representing the object's height value.
    */
   public double getHeight() {
      return height;
   }
   
   /** Method to set the height value of an object. Returns true if successful,
    *  or false if not.
    *  @param heightIn - double representing the new height value.
    *  @return Returns true if height value successfully set, or false if not.
    */
   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      } else {
         return false;
      }
   }  
   
   /** Method to return the area of one of the triangular faces of the prism.
    *  @return The area of one of the triangular faces as a double.
    */
   public double triangleArea() {
      double output = .25 * Math.sqrt((3 * Math.pow(edge, 4)));
     
      return output;
   }
   
   /** Method to return the area of a rectangle side of the prism.
    *  @return The area of one of the rectangular sides of prism as a double.
    */
   public double rectangleArea() {
      return edge * height;
   }
   
   /** Method to return the total surface area of the prism.
    *  @return The surface area of the prism as a double.
    */
   public double surfaceArea() {
      return 2 * triangleArea() + 3 * rectangleArea();
   }
   
   /** Method to return the volume of the prism.
    *  @return The volume of the triangular prism as a double.
    */
   public double volume() {   
      return triangleArea() * height;
   }
   
   /** Method to return the TriangularPrism object as a formatted string.
    *  @return Returns the object formatted as string output.
    */
   public String toString() {
      // decimal format object
      DecimalFormat df = new DecimalFormat("#,##0.0##");

      return "TriangularPrism \"" + getLabel() + "\" with triangle"
         + " edge of " + getEdge() + " units\nand prism height of "
         + getHeight() + " units has:"
         + "\n\ttriangle area = " + df.format(triangleArea()) + " square units"
         + "\n\trectangle area = " + df.format(rectangleArea()) 
         + " square units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
   }
   
   /** Method to return the number of objects that have been created.
    *  @return count - The integer count of TP objects that have been made.
    */
   public static int getCount() {
      return count;
   }

   /** Method to reset the count variable back to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /** Instance method that checks if an object is a TriangularPrism, for 
    *  use in testing equality of TP objects.
    *  @param obj - The object being tested.
    *  @return Returns true if the object is a TP and equal to an existing TP,
    *  or returns false otherwise.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof TriangularPrism)) {
         return false;
      } 
      else {
         TriangularPrism d = (TriangularPrism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && (Math.abs(edge - d.getEdge()) < .000001)
            && (Math.abs(height - d.getHeight()) < .000001));
      }
   }
   
   /** Method required by Checkstyle to implement the equals method above.
    *  @return Returns int of value 0.
    */
   public int hashCode() {
      int zero = 0;
      return zero;
   }
   
   /** Method to compare two TriangularPrism objects.
    *  @param obj - The object being compared to
    *  @return Returns 0 if they are equal, -1 if the first is less than, or 1
    *  if the first is greater than.
    */
   public int compareTo(TriangularPrism obj) {
      if (this.volume() < obj.volume()) {
         return -1;
      }
      else if (this.volume() > obj.volume()) {
         return 1;
      }
      else {
         return 0;
      }
   }
   
}