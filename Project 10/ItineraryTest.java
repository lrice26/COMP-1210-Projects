import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains tests for the Itinerary class.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class ItineraryTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for getFromAirport method.
    *  @Test - Tests getFromAirport()
    */
   @Test public void getFromAirportTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("ATL", itn.getFromAirport());
   }
   
   /** Test for getDepDateTime method.
    *  @Test - Tests getDepDateTime()
    */
   @Test public void getDepDateTimeTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("2021/11/21 1400", itn.getDepDateTime());
   }
   
   /** Test for getMiles method.
    *  @Test - Tests getMiles()
    */
   @Test public void getMilesTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals(800, itn.getMiles());
   }
   
   /** Test for toString method.
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Assert.assertEquals("ATL-LGA (2021/11/21 1400 - 2021/11/21 1640) "
         + "800 miles", itn.toString());
   }

}