/** This class represents an Inventory item in a store and provides methods to
 *  interact with items.
 *  Activity 9
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 1, 2021
 */
 
public class InventoryItem {
   
   // instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /** Constructor for InventoryItem instance.
    *  @param nameIn - The name of the item as a string
    *  @param priceIn - The price of the item as a double
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /** Method to return the name.
    *  @return Returns the name as a string
    */
   public String getName() {
      return name;
   }
   
   /** Method to calculate and  return cost with tax.
    *  @return Returns price including tax
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /** Method to set the tax rate.
    *  @param taxRateIn - The new tax rate as a double
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /** Method to return the item and price as a formatted string.
    *  @return Returns the item as a formatted string.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
   
   
   
    

}