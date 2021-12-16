/** InventoryListApp contains a driver and main method.
 *  Activity 10
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 8, 2021
 */

public class InventoryListApp {

   /** Main method for InventoryListApp.
    *  @param args - not used
    */
   public static void main(String[] args) {
      
      // instantiate ItemsList
      ItemsList myItems = new ItemsList();
      
      // set tax rate
      InventoryItem.setTaxRate(0.05);
      
      // add 4 objects to myItems
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      // print toString output
      System.out.println(myItems.toString());
      // print total with surcharge
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
   }

}