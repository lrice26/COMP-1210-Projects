/** This abstract class, OnlineTextItem, represents online text items that
 *  users can buy.
 *  Activity 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 1, 2021
 */
 
public abstract class OnlineTextItem extends InventoryItem {

   /** Constructor for OnlineTextItem
    *  @param nameIn - The name as a string
    *  @param priceIn - The price as a double
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /** Method to return cost (no tax).
    *  @return Returns the straight cost as a double
    */
   public double calculateCost() {
      return price;
   }
   
   
}