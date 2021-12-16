import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains tests for the Economy class.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */
public class EconomyTest {


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
      Economy econ = new Economy("DL 1860", itn, 450, 1.0);
      Assert.assertEquals(450, econ.totalFare(), .0001);
   }
   
   /** Test for the totalAwardMiles method.
    *  @Test - Tests totalAwardMiles()
    */
   @Test public void totalAwardMiles() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy econ = new Economy("DL 1860", itn, 450, 1.0);
      Assert.assertEquals(1200, econ.totalAwardMiles(), .0001);
   }
   
   /** Test for the toString method.
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      String output = "Flight: DL 1860\nATL-LGA (2021/11/21 1400 - 2021/11/21"
         + " 1640) 800 miles (1200 award miles)\nBase Fare: $450.00 Fare "
         + "Adjustment Factor: 1.0\nTotal Fare: $450.00 (class Economy)"
         + "\n   Includes Award Miles Factor: 1.5";
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      Economy econ = new Economy("DL 1860", itn, 450, 1.0);
      Assert.assertEquals(output, econ.toString());
   }

}