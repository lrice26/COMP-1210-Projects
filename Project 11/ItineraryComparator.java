import java.util.Comparator;

/** This class implements the comparator interface for use with AirTicket.
 *  Project 10
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 12, 2021
 */

public class ItineraryComparator implements Comparator<AirTicket> {

   /** Method to compare two AirTicket objects.
    *  @param t1 - The first AirTicket
    *  @param t2 - The second AirTicket
    *  @return Returns 1 if first is greater, -1 is second is greater, or 0
    */
   public int compare(AirTicket t1, AirTicket t2) {
      return t1.getItinerary().toString().compareTo(t2.getItinerary()
         .toString());
   }   

}