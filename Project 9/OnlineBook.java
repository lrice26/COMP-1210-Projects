/** Class OnlineBook is a subclass of OnlineTextItem that also stores author
 *  name.
 *  Activity 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 */

public class OnlineBook extends OnlineTextItem {

   // instance variable
   protected String author;
   
   /** Constructor for OnlineBook instances.
    *  @param nameIn - The name as a string
    *  @param priceIn - The price as a double
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /** Method to return the object as a formatted string.
    *  @return Returns string output of the object
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /** Method to set the author.
    *  @param authorIn - The author as a string
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }

}