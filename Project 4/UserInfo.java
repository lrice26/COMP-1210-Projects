/** Simple program that makes a new class UserInfo for use in
 *  UserInfoDriver, where new user instances can be created.
 *    
 *  Activity 4
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 14, 2021
 */
 
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   
   /** UserInfo constructor is blueprint for later instances of users. 
    *  @param firstNameIn - user's first name
    *  @param lastNameIn - user's last name
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   
   /** Method to turn output into string form to make more readable and useful.
    *  @return output - The formatted output with the user's info.
    */
    
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   
   /** Method to set the user's location as a string.
    *  @param locationIn - The user's location as a string
    */
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /** Method to set the user's age as an integer.
    *  @param ageIn - The user's age as an integer > 0.
    *  @return isSet - A boolean representing if age was set or not
    */
   
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /** Method to return the user's age as an integer.
    *  @return age - The user's age as an integer
    */
   
   public int getAge() {
      return age;
   }
   
   /** Method to return the user's location.
    *  @return location - The user's location as a string
    */
   
   public String getLocation() {
      return location;
   }
   
   /** Method to set status as offline.
    *
    */
   
   public void logOff() {
      status = OFFLINE;
   }
   
   /** Method to set status as online.
    *
    */
   
   public void logOn() {
      status = ONLINE;
   }
}