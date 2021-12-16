/** Class InvalidCategoryException is an extension of the Exception class.
 *  Project 11
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 18, 2021
 */

public class InvalidCategoryException extends Exception {

   /** Constructor for class.
    *  @param category - The category as a string
    */
   public InvalidCategoryException(String category) {
      super(("For category: " + "\"" + category + "\""));
   }

}