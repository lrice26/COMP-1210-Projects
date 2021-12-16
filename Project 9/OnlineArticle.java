/** OnlineArticle is a subclass of OnlineTextItem that also stores word count.
 *  Activity 9 
 *  @author Lyndsey Rice - COMP 1210 - D01
 */

public class OnlineArticle extends OnlineTextItem {

   // instance variable
   private int wordCount;
   
   /** Constructor for OnlineArticle instances.
    *  @param nameIn - The name as a string
    *  @param priceIn - The price as a double
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /** Method to set the word count.
    *  @param wordCountIn - The word count as an int
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   } 
   
}