/** This contains the class BankLoan, which will have a constructor and methods
 *  to use for various purposes and calculations of keeping track of loans.
 *  Activity 7A
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 10, 2021
 */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0; // added by me
   
   /** Constructor for BankLoan objects. Has instance variables for customer
    *  name, interest rate, balance, and increments loansCreated variable.
    *  @param customerNameIn - Customer name as a string
    *  @param interestRateIn - Interest rate as a double
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++; // increment the count
   }
   
   /** Method to return true or false if a loan was successfully made or not,
    *  depending on the max loan amount stored. Also changes balance if true.
    *  @param amount - The amount to borrow as a double
    *  @return Returns true if successful, or false if not.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /** Method to pay the bank and change the balance accordingly.
    *  @param amountPaid - The amount being paid to the bank as a double
    *  @return Returns any extra payment back to the customer, or 0 if exact
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /** Method to return the current balance.
    *  @return balance - The current balance as a double
    */
   public double getBalance() {
      return balance;
   }
   
   /** Method to set the interest rate, then return true or false depending
    *  on if it was successful or not.
    *  @param interestRateIn - The new interest rate as a double
    *  @return Returns true if successful or false if not
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /** Method to return the current interest rate.
    *  @return interestRate - The current interest rate as a double
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /** Method to apply the interest to the balance.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /** Method to return the object as a string with formatted output.
    *  @return output - The formatted output of the object as a string
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /** Method to check if the amount is valid (non-negative).
    *  @param amount - A double representing the amount to be checked
    *  @return Returns true if non-negative, or false otherwise.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /** Method to return if the customer is in debt or not.
    *  @param loan - A BankLoan object to check
    *  @return Returns true if they are in debt, or false otherwise.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /** Method to return the amount of loans that have been created.
    *  @return loansCreated - The number of loans created as an integer
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /** Method to reset the loansCreated variable to 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
