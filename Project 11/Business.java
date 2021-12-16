import java.text.DecimalFormat;

/** Class Business is a subclass of AirTicket.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class Business extends AirTicket {

   // instance variables
   protected double fb;
   protected double ent;
   /** Static final variable for business award miles factor.
    */
   public static final double BUSI_AM = 2.0;
   
   /** Constructor for Business.
    *  @param flightNumIn - Flight number as a string
    *  @param tripIn - Itinerary object
    *  @param baseFareIn - Base fare as a double
    *  @param fareAdjIn - Fare adjustment factor as a double
    *  @param fbIn - Food and beverages as a double
    *  @param entIn - Entertainment as a double
    */
   public Business(String flightNumIn, Itinerary tripIn, double baseFareIn,
      double fareAdjIn, double fbIn, double entIn) {
      
      super(flightNumIn, tripIn, baseFareIn, fareAdjIn);
      fb = fbIn;
      ent = entIn;  
   }
   
   /** Method to return totalFare.
    *  @return Returns totalFare as a double
    */
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor() + fb + ent;
   }
   
   /** Method to return total award miles.
    *  @return Returns totalAwardMiles as an int.
    */
   public int totalAwardMiles() {
      return (int) (super.tripData.getMiles() * BUSI_AM);
   }
   
   /** Method to return formatted output as a string.
    *  @return Returns a string formatted output
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Includes Food/Beverage: "
         + df.format(fb) + " Entertainment: " + df.format(ent);
   }
}