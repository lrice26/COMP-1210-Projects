/** Class Economy is a subclass of AirTicket.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class Economy extends AirTicket {

   /** Instance variable econAM for economy award miles factor.
    */
   public static final double ECON_AM = 1.5;
   
   /** Constructor for Economy.
    *  @param flightNumIn - Flight number as a string
    *  @param tripIn - Itinerary object
    *  @param baseFareIn - Base fare as a double
    *  @param fareAdj - Fare adjustment factor as a double
    */
   public Economy(String flightNumIn, Itinerary tripIn, double baseFareIn,
      double fareAdj) {
      
      super(flightNumIn, tripIn, baseFareIn, fareAdj);
   }
   
   /** Method to return totalFare.
    *  @return Returns totalFare after fare adjustment factor as a double
    */
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor();
   }
   
   /** Method to return total award miles.
    *  @return Returns totalAwardMiles as an int
    */
   public int totalAwardMiles() {
      return (int) (super.tripData.getMiles() * ECON_AM);
   }
   
   /** Method to output object as a formatted string.
    *  @return Returns the object as a formatted string
    */
   public String toString() {
      return super.toString() + "\n   Includes Award Miles Factor: " + ECON_AM;
   }  

}