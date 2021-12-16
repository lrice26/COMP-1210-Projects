import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This file contains the tests for each of TriangularPrism's methods.
 *  Project 7A
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 15, 2021
 */
public class TriangularPrismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** A test for the getLabel and setLabel methods.
    *  @Test - Tests getLabel() and setLabel() 
    */
   @Test public void getAndSetLabelTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      tp.getLabel();
      Assert.assertEquals(" ", true, tp.setLabel("New Test"));
   }
   
   /** Another test for the setLabel method.
    *  @Test - Tests setLabel() with null input
    */
   @Test public void setLabelTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      Assert.assertEquals(" ", false, tp.setLabel(null));
   }
   
   /** A test for the getEdge and setEdge methods.
    *  @Test - Tests getEdge() and setEdge()
    */
   @Test public void getAndSetEdgeTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      tp.getEdge();
      Assert.assertEquals(" ", true, tp.setEdge(2));
   }
   
   /** Another test for the setEdge method.
    *  @Test - Tests setEdge() with negative input
    */
   @Test public void setEdgeTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      Assert.assertEquals(false, tp.setEdge(-5));
   }
   
   /** A test for the getHeight and setHeight methods.
    *  @Test - Tests getHeight() and setHeight()
    */
   @Test public void getAndSetHeightTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      tp.getHeight();
      Assert.assertEquals(" ", true, tp.setHeight(2));
   }
   
   /** Another test for the setHeight method.
    *  @Test - Tests setHeight() with negative input
    */
   @Test public void setHeightTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      Assert.assertEquals(false, tp.setHeight(-5));
   }
   
   /** A test for the getCount and resetCount methods.
    *  @Test - Test for getCount() and resetCount()
    */
   @Test public void getAndResetCountTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      tp.getCount();
      tp.resetCount();
   }
   
   /** A test for the toString method.
    *  @Test - Test for toString()
    */
   @Test public void toStringTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      Assert.assertTrue(tp.toString().contains("Test"));
   }
   
   /** A test for the equals method (false input).
    *  @Test - Test for equals() with non TP input
    */
   @Test public void equalsTestFalse() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      int fakeInput = 1;
      tp.hashCode();
      Assert.assertEquals(false, tp.equals(fakeInput));
   }
    
   /** A test for the equals method (TTT).
    *  @Test - Test for equals()
    */
   @Test public void equalsTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test", 1, 1);
      tp.hashCode();
      Assert.assertEquals(" ", true, tp.equals(tp2));
   }
   
   /** A second test for the equals method (TTF).
    *  @Test - Test for equals()
    */
   @Test public void equalsTest2() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test", 1, 2);
      tp.hashCode();
      Assert.assertEquals(" ", false, tp.equals(tp2));
   }
   
   /** A third test for the equals method (TFF).
    *  @Test - Test for equals()
    */
   @Test public void equalsTest3() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test", 2, 2);
      tp.hashCode();
      Assert.assertEquals(" ", false, tp.equals(tp2));
   }
   
   /** A fourth test for the equals method (FFF).
    *  @Test - Test for equals()
    */
   @Test public void equalsTest4() {
      TriangularPrism tp = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test2", 2, 2);
      tp.hashCode();
      Assert.assertEquals(" ", false, tp.equals(tp2));
   }
   
   /** A test for the triangle area method.
    *  @Test - Test for triangleArea()
    */
   @Test public void triangleAreaTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      Assert.assertEquals(" ", 1.403, tp.triangleArea(), .01);
   }
   
   /** A test for the rectangle area method.
    *  @Test - Test for rectangleArea()
    */
   @Test public void rectangleAreaTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      Assert.assertEquals(" ", 5.85, tp.rectangleArea(), .01);
   }
   
   /** A test for the surface area method.
    *  @Test - Test for surfaceArea()
    */
   @Test public void surfaceAreaTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      Assert.assertEquals(" ", 20.356, tp.surfaceArea(), .01);
   }
   
   /** A test for the volume method.
    *  @Test - Test for volume()
    */
   @Test public void volumeTest() {
      TriangularPrism tp = new TriangularPrism("Test", 1.8, 3.25);
      Assert.assertEquals(" ", 4.56, tp.volume(), .01);
   }
   
   /** First test for compare to method.
    *  @Test - Tests compareTo()
    */
   @Test public void compareToTest1() {
      TriangularPrism tp1 = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test2", 1, 1);
      
      Assert.assertTrue(tp1.compareTo(tp2) == 0);
   }
   
   /** Second test for compare to method.
    *  @Test - Tests compareTo()
    */
   @Test public void compareToTest2() {
      TriangularPrism tp1 = new TriangularPrism("Test", 2, 1);
      TriangularPrism tp2 = new TriangularPrism("Test2", 1, 1);
      
      Assert.assertTrue(tp1.compareTo(tp2) > 0);
   }

   /** Third test for compare to method.
    *  @Test - Tests compareTo()
    */
   @Test public void compareToTest3() {
      TriangularPrism tp1 = new TriangularPrism("Test", 1, 1);
      TriangularPrism tp2 = new TriangularPrism("Test2", 2, 1);
      
      Assert.assertTrue(tp1.compareTo(tp2) < 0);
   }
   


   

   

}