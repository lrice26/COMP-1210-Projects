/** Class NonRefundable is a subclass of AirTicket.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class NonRefundable extends AirTicket {
   
   // instance variables
   private double discountFactor;
   
   /** Constructor for NonRefundable.
    *  @param flightNumIn - Flight number as a string
    *  @param tripIn - Itinerary object
    *  @param baseFareIn - The base fare as a double
    *  @param fareAdjIn - The fare adjustment factor as a double
    *  @param discountFactorIn - The discount factor as a double
    */
   public NonRefundable(String flightNumIn, Itinerary tripIn, 
      double baseFareIn, double fareAdjIn, double discountFactorIn) {
      
      super(flightNumIn, tripIn, baseFareIn, fareAdjIn);
      discountFactor = discountFactorIn;
   }
   
   /** Method to return the discount factor.
    *  @return Returns discountFactor as a double
    */
   public double getDiscountFactor() {
      return discountFactor;
   }
   
   /** Method to calculate and return total fare after adjustments/discount.
    *  @return Returns the total fare as a double
    */
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor() * getDiscountFactor();
   }
   
   /** Method to return total award miles.
    *  @return Returns total award miles as an int
    */
   public int totalAwardMiles() {
      return super.tripData.getMiles();
   }
   
   /** Method to output the object as a formatted string.
    *  @return output - Returns a formatted string of object output
    */
   public String toString() {
      String output = super.toString();
      output += "\n   Includes DiscountFactor: " + getDiscountFactor();
      return output;
   }

}