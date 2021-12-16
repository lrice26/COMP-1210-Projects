/** This is the main file where you can add new users, creating an instance
 *  of the UserInfo class.
 * 
 *  Activity 4
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version September 14, 2021
 */
 
public class UserInfoDriver {
      /** Main method where new UserInfo instances can be created and 
       *  methods on UserInfo can be called to add or change information.
       *
       *  @param args - Not used.
       */
   
   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
 
}