/** ItemsList class holds an array of InventoryItem objects.
 *  Activity 10
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 8, 2021
 */

public class ItemsList {

   // instance variables
   private InventoryItem[] inventory;
   private int count;
   
   /** Constructor for ItemsList class.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /** Method to add an InventoryItem and increment count variable.
    *  @param itemIn - the InventoryItem to add
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /** Method to calculate the total.
    *  @param electronicsSurcharge - 
    *  @return Returns the total as a double
    */
   public double calculateTotal(double electronicsSurcharge) {
      
      double total = 0;
      
      // iterate through and add price based on type
      for (int i = 0; i < count; i++) {
         // check if instance of ElectronicItem
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }

      return total;
   }
   
   /** Method to output the object as a string with formatted info.
    *  @return Returns a string formatted output
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
      
      return output;
   }

}