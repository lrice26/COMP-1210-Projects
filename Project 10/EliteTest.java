import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains tests for the methods of the class Elite.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class EliteTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for totalFare method.
    *  @Test - Tests totalFare()
    */
   @Test public void totalFareTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Elite elite = new Elite("DL 1860", itn, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals(1325, elite.totalFare(), .0001);
   }
   
   /** Test for toString method.
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      String output = "Flight: DL 1860\nATL-LGA (2021/11/21 1400 - 2021/11/21"
         + " 1640) 800 miles (1600 award miles)\nBase Fare: $450.00 Fare "
         + "Adjustment Factor: 2.5\nTotal Fare: $1,325.00 (class Elite)"
         + "\n   Includes Food/Beverage: $50.00 Entertainment: $50.00"
         + "\n   Includes: Comm Services: $100.00"; 
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Elite elite = new Elite("DL 1860", itn, 450, 2.5, 50.0, 50.00, 100.00);
      Assert.assertEquals(output, elite.toString());
   }
   
}