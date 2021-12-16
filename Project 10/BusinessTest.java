import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains tests for the methods of the Business class.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class BusinessTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for the totalFare method.
    *  @Test - Tests totalFare()
    */
   @Test public void totalFareTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business bus = new Business("DL 1860", itn, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(1000, bus.totalFare(), .0001);
   }  
   
   /** Test for the totalAwardMiles method.
    *  @Test - Tests totalAwardMiles()
    */
   @Test public void totalAwardMilesTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business bus = new Business("DL 1860", itn, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(1600, bus.totalAwardMiles(), .0001);
   }
   
   /** Test for the toString method.
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      String output = "Flight: DL 1860\nATL-LGA (2021/11/21 1400 - 2021/11/21"
         + " 1640) 800 miles (1600 award miles)\nBase Fare: $450.00 Fare "
         + "Adjustment Factor: 2.0\nTotal Fare: $1,000.00 (class Business)"
         + "\n   Includes Food/Beverage: $50.00 Entertainment: $50.00";
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Business bus = new Business("DL 1860", itn, 450, 2.0, 50.0, 50.00);
      Assert.assertEquals(output, bus.toString());
   }
   
}
