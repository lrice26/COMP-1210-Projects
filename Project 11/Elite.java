import java.text.DecimalFormat;

/** Elite class is a subclass of Business class.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210- D01
 *  @version November 5, 2021
 */

public class Elite extends Business {

   // instance variables
   private double comm;
   
   /** Constructor for Business.
    *  @param flightNumIn - Flight number as a string
    *  @param tripIn - Itinerary object
    *  @param baseFareIn - Base fare as a double
    *  @param fareAdjIn - Fare adjustment factor as a double
    *  @param fbIn - Food and beverages as a double
    *  @param entIn - Entertainment as a double
    *  @param commIn - Communication services as a double
    */
   public Elite(String flightNumIn, Itinerary tripIn, double baseFareIn,
      double fareAdjIn, double fbIn, double entIn, double commIn) {
      
      super(flightNumIn, tripIn, baseFareIn, fareAdjIn, fbIn, entIn);
      comm = commIn;
   }
   
   /** Method to return totalFare.
    *  @return Returns totalFare as a double
    */
   public double totalFare() {
      return super.totalFare() + comm;
   }
   
   /** Method to return the object output as a formatted string.
    *  @return Returns a formatted string output of the object
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Includes: Comm Services: " 
         + df.format(comm);
   }

}