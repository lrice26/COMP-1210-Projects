/** Itinerary class stores trip data and provides methods to interact with
 *  the data.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class Itinerary {

   // instance variables
   private String fromAP;
   private String toAP;
   private String depDT;
   private String arrDT;
   private int miles;
   
   /** Constructor for Itinerary class.
    *  @param fromAPIn - Departure airport as a string
    *  @param toAPIn - Arrival airport as a string
    *  @param depDTIn - Departure date/time as a string
    *  @param arrDTIn - Arrival date/time as a string
    *  @param milesIn - Miles as an int
    */
   public Itinerary(String fromAPIn, String toAPIn, String depDTIn, 
      String arrDTIn, int milesIn) {
      
      // set to instance variables
      fromAP = fromAPIn;
      toAP = toAPIn;
      depDT = depDTIn;
      arrDT = arrDTIn;
      miles = milesIn;   
   } 
   
   /** Method to return the from airport.
    *  @return Returns string representing the departure airport as a string
    */
   public String getFromAirport() {
      return fromAP;
   }
   
   /** Method to return the departure date and time.
    *  @return Returns the departure date and time as a string
    */
   public String getDepDateTime() {
      return depDT;
   }
   
   /** Method to return the number of miles.
    *  @return Returns number of miles as an int
    */
   public int getMiles() {
      return miles;
   }
   
   /** Method to return the itinerary as a formatted string.
    *  @return Returns the object as a formatted output string
    */
   public String toString() {
      return fromAP + "-" + toAP + " (" + depDT + " - " + arrDT + ") " + miles
         + " miles";
   }

}