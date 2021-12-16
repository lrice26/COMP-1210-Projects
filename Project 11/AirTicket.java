import java.text.DecimalFormat;

/** AirTicket class is an abstract class to hold ticket data and provide
 *  methods for interacting with said data.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public abstract class AirTicket implements Comparable<AirTicket> {

   // instance variables
   protected String flightNumber;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdj;
   
   /** Constructor for AirTicket - to be used with super in subclasses.
    *  @param flightNumIn - Flight number as a string
    *  @param tripDataIn - The itinerary object with trip data
    *  @param baseFareIn - The base fare as a double
    *  @param fareAdjIn - Fare adjustment factor as a double
    */
   public AirTicket(String flightNumIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjIn) {
      
      flightNumber = flightNumIn;
      tripData = tripDataIn;
      baseFare = baseFareIn;
      fareAdj = fareAdjIn;   
   }
   
   /** Method to return the flight number.
    *  @return Returns the flight number as a string
    */
   public String getFlightNum() {
      return flightNumber;
   }
   
   /** Method to return the base fare.
    *  @return Returns the base fare as a double
    */
   public double getBaseFare() {
      return baseFare;
   }
   
   /** Method to return the fare adjustment factor.
    *  @return Returns the fare adjustment factor as a double
    */
   public double getFareAdjustmentFactor() {
      return fareAdj;
   }
   
   /** Method to output the object's information as a formatted string.
    *  @return Returns string output of the data
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return "Flight: " + getFlightNum() + "\n" + tripData + " (" 
         + totalAwardMiles() + " award miles)" + "\nBase Fare: " 
         + df.format(getBaseFare())
         + " Fare Adjustment Factor: " + getFareAdjustmentFactor()
         + "\nTotal Fare: " + df.format(totalFare()) + " (" + getClass() + ")"; 
   }
   
   /** Abstract method to return the total fare as a double.
    *  @return Returns the total fare as a double
    */
   public abstract double totalFare();
   
   /** Abstract method to return the number of award miles as an int.
    *  @return Returns the award miles as an int
    */
   public abstract int totalAwardMiles();
   
   /** Method to compare two tickets.
    *  @param ticketIn - The air ticket to compare to
    *  @return Returns an int depending on the result of flight numbers
    */
   public int compareTo(AirTicket ticketIn) {
      return flightNumber.compareTo(ticketIn.getFlightNum());
   }
   
   /** Method to return the trip data field value of type Itinerary.
    *  @return Returns the trip data field value
    */
   public Itinerary getItinerary() {
      return tripData;
   }

}