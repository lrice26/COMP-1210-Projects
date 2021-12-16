/** InventoryApp is the driver class with a main method.
 *  Activity 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 */

public class InventoryApp {

   /** Main method for class InventoryApp, interacts with other classes.
    *  @param args - Not used
    */
   public static void main(String[] args) {
   
      // set tax rate
      InventoryItem.setTaxRate(0.05);
      
      // item1 - InventoryItem
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      // item2 - ElectronicsItem
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 
         1.8);
      // item3 - OnlineArticle
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      // item4 - OnlineBook
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   
   }

}