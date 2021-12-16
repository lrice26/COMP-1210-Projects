import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;

/** This file contains tests for all methods of TriangularPrismList class.
 *  Project 8
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 29, 2021
 */

public class TriangularPrismListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test for getName method.
    *  @Test - Tests getName()
    */
   @Test public void getNameTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 1);
      Assert.assertEquals("Test List", tpList.getName());
   }
   
   /** Test for numberOfTriangularPrisms method.
    *  @Test - Tests numberOfTriangularPrisms()
    */
   @Test public void numberOfTriangularPrismsTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test 2", 2, 2);
      TriangularPrism tp3 = new TriangularPrism("Test 3", 3, 3);
      TriangularPrism[] tpArray = {tp, tp2, tp3};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 3);
      Assert.assertEquals(3, tpList.numberOfTriangularPrisms());
   }
   
   /** Test for totalSurfaceArea method.
    *  @Test - Tests totalSurfaceArea()
    */
   @Test public void totalSurfaceAreaTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism tp2 = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 2);
      Assert.assertEquals(((2 * tp.triangleArea() + 3 * tp.rectangleArea()) 
         + (2 * tp2.triangleArea() + 3 * tp2.rectangleArea())), 
         tpList.totalSurfaceArea(), .00001);
   }
   
   /** Test 2 for totalSurfaceArea method (0 input).
    *  @Test - Tests totalSurfaceArea() with empty list
    */
   @Test public void totalSurfaceAreaTest2() {
      TriangularPrism[] tpArray = {};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 0);
      Assert.assertEquals(0, tpList.totalSurfaceArea(), .00001);
   }
   
   /** Test for totalVolume method.
    *  @Test - Tests totalVolume()
    */
   @Test public void totalVolumeTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism tp2 = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 2);
      Assert.assertEquals(((tp.triangleArea() * tp.getHeight()) 
         + (tp2.triangleArea() * tp2.getHeight())), tpList.totalVolume(),
             .00001);
   }
   
   /** Test 2 for totalVolume method.
    *  @Test - Tests totalVolume() with empty list
    */
   @Test public void totalVolumeTest2() {
      TriangularPrism[] tpArray = {};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 0);
      Assert.assertEquals(0, tpList.totalVolume(), .00001);
   }
   
   /** Test for averageSurfaceArea method.
    *  @Test - Tests averageSurfaceArea()
    */
   @Test public void averageSurfaceAreaTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism tp2 = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 2);
      Assert.assertEquals((2 * tp.triangleArea() + 3 * tp.rectangleArea()),
          tpList.averageSurfaceArea(), .00001);
   }
   
   /** Test 2 for averageSurfaceArea method.
    *  @Test - Tests averageSurfaceArea() with null list
    */
   @Test public void averageSurfaceAreaTest2() {
      TriangularPrism[] tpArray = new TriangularPrism[1];
      TriangularPrismList tpList = new TriangularPrismList("Test List",
          tpArray, 0);
      Assert.assertEquals(0.0, tpList.averageSurfaceArea(), .00001);
   }
   
   /** Test for averageVolume method.
    *  @Test - Tests averageVolume()
    */
   @Test public void averageVolumeTest() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
         
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism tp2 = new TriangularPrism("Test", 1.8, 3.25);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List", 
         tpArray, 2);
         
      double vol = tp.volume();
      String volStr = df.format(vol);
      vol = Double.parseDouble(volStr);
      
      Assert.assertEquals(vol, tpList.averageVolume(), .00001);
   }
   
   /** Test 2 for averageVolume method.
    *  @Test - Tests averageVolume() with empty list
    */
   @Test public void averageVolumeTest2() {
      TriangularPrism[] tpArray = {};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
          tpArray, 0);
      Assert.assertEquals(0, tpList.averageVolume(), .00001);
   }

   /** Test for toString method.
    *  @Test - Tests toString()
    */
   @Test public void toStringTest() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      Assert.assertEquals(("----- Summary for " + tpList.getName() + " -----"
         + "\nNumber of TriangularPrisms: " + tpList.numberOfTriangularPrisms()
         + "\nTotal Surface Area: " + df.format(tpList.totalSurfaceArea())
         + " square units"
         + "\nTotal Volume: " + df.format(tpList.totalVolume()) 
         + " cubic units"
         + "\nAverage Surface Area: " + df.format(tpList.averageSurfaceArea())
         + " square units"
         + "\nAverage Volume: " + df.format(tpList.averageVolume()) 
         + " cubic units"),
         tpList.toString());
   }
   
   /** Test for getList method.
    *  @Test - Tests getList()
    */
   @Test public void getListTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      Assert.assertArrayEquals(tpArray, tpList.getList());
   }
   
   /** Test for addTriangularPrism method.
    *  @Test - Tests addTriangularPrism()
    */
   @Test public void addTriangularPrismTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
         
      TriangularPrism tp2 = new TriangularPrism("Test 2", 1, 1);
         
      tpList.addTriangularPrism("Test 2", 1, 1);
      
      TriangularPrism[] tpArray2 = {tp, tp2};
      
      Assert.assertArrayEquals(tpArray2, tpList.getList());
   }
   
   
   /** Test for the findTriangularPrism method.
    *  @Test - Tests findTriangularPrism()
    */
   @Test public void findTriangularPrismTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      
      Assert.assertEquals(tp, tpList.findTriangularPrism("Test"));
   }
   
   /** Test 2 for the findTriangularPrism method.
    *  @Test - Tests findTriangularPrism with null output
    */
   @Test public void findTriangularPrismTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      
      Assert.assertEquals(null, tpList.findTriangularPrism("Not here"));
   }
   
   /** Test for the deleteTriangularPrism method.
    *  @Test - Tests deleteTriangularPrism()
    */
   @Test public void deleteTriangularPrismTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test 2", 1, 1);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 2);
      
      Assert.assertEquals(tp2, tpList.deleteTriangularPrism("Test 2")); 
   }
   
   /** Test 2 for the deleteTriangularPrism method.
    *  @Test - Tests deleteTriangularPrism with null output
    */
   @Test public void deleteTriangularPrismTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      
      Assert.assertEquals(null, tpList.deleteTriangularPrism("Not here"));
   }
   
   /** Test for editTriangularPrism method.
    *  @Test - Tests editTriangularPrism
    */
   @Test public void editTriangularPrismTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      
      Assert.assertEquals(true, tpList.editTriangularPrism("Test", 2, 2));
   }
   
   /** Test 2 for editTriangularPrism method.
    *  @Test - Tests editTriangularPrism with false output
    */
   @Test public void editTriangularPrismTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism[] tpArray = {tp};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 1);
      
      Assert.assertEquals(false, tpList.editTriangularPrism("Not here", 2, 2));
   }
   
   /** Test for findTriangularPrismWithLargestVolume method.
    *  @Test - Tests findTriangularPrismWithLargestVolume()
    */
   @Test public void findTPWithLargestVolumeTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test 2", 2, 2);
      TriangularPrism[] tpArray = {tp, tp2};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 2);
      
      Assert.assertEquals(tp2, tpList.findTriangularPrismWithLargestVolume());
   }
   
   /** Test 2 for findTriangularPrismWithLargestVolume method.
    *  @Test - Tests findTriangularPrismWithLargestVolume() with empty list
    */
   @Test public void findTPWithLargestVolumeTest2() {
      TriangularPrism[] tpArray = {};
      TriangularPrismList tpList = new TriangularPrismList("Test List",
         tpArray, 0);
      
      Assert.assertEquals(null, tpList.findTriangularPrismWithLargestVolume());
   }
    

}