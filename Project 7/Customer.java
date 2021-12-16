/** This class, Customer, can be used to create, compare, and change instances
 *  of class Customer. 
 *  Activity 7B
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 19, 2021
 */
 
public class Customer implements Comparable<Customer> {
   
   // instance variables
   private String name = "";
   private String location = "";
   private double balance = 0.0;
   
   /** Constructor for Customer instances.
    *  @param nameIn - The customer's name as a string
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /** Method to set the customer's location.
    *  @param locationIn - The location as a string
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /** A second method to set the location, specifically with city and state.
    *  @param city - The customer's city as a string
    *  @param state - The customer's state as a string
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /** Method to change the customer's balance (add or substract).
    *  @param amount - The amount to add to the balance
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /** Method to return the location of the customer.
    *  @return location - The customer's location as a string
    */
   public String getLocation() {
      return location;
   }  
   
   /** Method to return the balance of the customer.
    *  @return balance - The customer's balance as a double
    */
   public double getBalance() {
      return balance;
   }
   
   /** Method to return the customer instance as string with formatted output.
    *  @return output - The customer object formatted as a string
    */
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
   /** Method to compare two Customer objects.
    *  @param obj - The object to compare this to.
    *  @return Returns int 0 if equal, -1 if the first is less, or 1 if the
    *  first is greater.
    */
   public int compareTo(Customer obj) {
      
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
      
   }
   
}