import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains tests for the methods of the class NonRefundable.
 *  Project 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 5, 2021
 */

public class NonRefundableTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for getDiscountFactor method.
    *  @Test - Tests getDiscountFactor()
    */
   @Test public void getDiscountFactorTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", itn, 450, .45, .90);
      Assert.assertEquals(.90, nr.getDiscountFactor(), .0001);
   }
   
   /** Test for totalFare method.
    *  @Test - Tests totalFare()
    */
   @Test public void totalFareTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", itn, 450, .45, .90);
      Assert.assertEquals(182.25, nr.totalFare(), .0001);      
   }
   
   /** Test for totalAwardMiles method.
    *  @Test - Tests totalAwardMiles()
    */
   @Test public void totalAwardMilesTest() {
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", itn, 450, .45, .90);
      Assert.assertEquals(800, nr.totalAwardMiles(), .0001);
   }
   
   /** Test for toString method. 
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      String output = "Flight: DL 1860\nATL-LGA (2021/11/21 1400 - 2021/11/21 "
         + "1640) 800 miles (800 award miles)\nBase Fare: $450.00 Fare" 
         + " Adjustment Factor: 0.45\nTotal Fare: $182.25 (class NonRefundable)"
         + "\n   Includes DiscountFactor: 0.9";
      Itinerary itn = new Itinerary("ATL", "LGA", "2021/11/21 1400",
         "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", itn, 450, .45, .90);
      Assert.assertEquals(output, nr.toString());
   }
   
}
