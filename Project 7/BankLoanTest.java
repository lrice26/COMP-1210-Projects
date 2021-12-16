import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This program is the testing file for the BankLoan class.
 *  Activity 7A
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version October 10, 2021
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test for the chargeInterest method on BankLoan objects.
    *  @Test - Tests the chargeInterest method to see if it produces the
    *  correct result
    */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
   
   /** A test for the getLoansCreated method.
    *  @Test - Test for getLoansCreated()
    */
   @Test public void getLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      BankLoan loan1 = new BankLoan("Test", .10);
      Assert.assertEquals(" ", 1, BankLoan.getLoansCreated(), .000001);
   }  
   
   /** A test for the resetLoansCreated method.
    *  @Test - Test for resetLoansCreated()
    */
   @Test public void resetLoansCreated() {
      BankLoan loan1 = new BankLoan("Test", .10);
      BankLoan.resetLoansCreated();
      Assert.assertEquals(" ", 0, BankLoan.getLoansCreated(), .000001);
   }
   
   /** A test for the borrowFromBank method.
    *  @Test - Test for borrowFromBank()
    */
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("Test", 0.10);
      Assert.assertEquals(" ", true, loan1.borrowFromBank(1000));
   }
   
   /** A test for the payBank method.
    *  @Test - Test for payBank()
    */
   @Test public void payBankTest() {
      BankLoan loan1 = new BankLoan("Test", 0.10);
      loan1.borrowFromBank(1000);
      Assert.assertEquals(" ", 0, loan1.payBank(500), .00001);
   }
   
   /** A test for the setInterestRate method.
    *  @Test - Test for setInterestRate()
    */
   @Test public void setInterestRateTest() {
      BankLoan loan1 = new BankLoan("Test", .10);
      Assert.assertEquals(" ", true, loan1.setInterestRate(0.09));
   } 
   
   /** A test for the toString method.
    *  @Test - Test for toString()
    */
   @Test public void toStringTest() {
      BankLoan loan1 = new BankLoan("Test", .10);
      Assert.assertEquals(" ", "Name: Test\r\nInterest rate: 0.1%\r\n" 
          + "Balance: $0.0\r\n", loan1.toString());
   }
   
   /** A test for the isAmountValid method.
    *  @Test - Test for isAmountValid()
    */
   @Test public void isAmountValidTest() {
      BankLoan loan1 = new BankLoan("Test", 0.10);
      Assert.assertEquals(" ", true, loan1.isAmountValid(1000));
   }
   
   /** A test for the isInDebt method.
    *  @Test - Test for isInDebt()
    */
   @Test public void isInDebtTest() {
      BankLoan loan1 = new BankLoan("Test", 0.10);
      loan1.borrowFromBank(1000);
      Assert.assertEquals(" ", true, loan1.isInDebt(loan1));
   }
   
}
