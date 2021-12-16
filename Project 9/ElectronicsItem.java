/** This class, ElectronicItem, inherits from InventoryItem, but also adds in
 *  shipping costs.
 *  Activity 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 1, 2021
 */
 
public class ElectronicsItem extends InventoryItem {

   // instance variables
   protected double weight;
   /** Shipping cost is static and final, since constant double value.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /** Constructor for ElectronicsItem instances.
    *  @param nameIn - The name as a string
    *  @param priceIn - The price as a double
    *  @param weightIn - The weight of the item as a double
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /** Method to calculate cost including shipping.
    *  @return Returns the total cost as a double
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
    

}