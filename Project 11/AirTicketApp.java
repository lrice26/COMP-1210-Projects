import java.io.FileNotFoundException;

/** AirTicketApp class contains the main method for this project.
 *  Project 10
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 12, 2021
 */

public class AirTicketApp {

   /** Main method for AirTicketApp.
    *  @param args - Contains file name
    *  @throws FileNotFoundException - Throws FileNotFoundException
    */
   public static void main(String[] args) {
      
      if (args.length == 0) {
         System.out.println("*** File name not provided by command line "
            + "argument.\nProgram ending.");
      }
      
      if (args.length != 0) {
         String fileName = args[0];
         AirTicketProcessor atp = new AirTicketProcessor();
         
         try {
            atp.readAirTicketFile(fileName);
            System.out.println(atp.generateReport());
            System.out.println(atp.generateReportByFlightNum());
            System.out.println(atp.generateReportByItinerary());
            System.out.println(atp.generateReportForInvalidInput());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** File not found.\nProgram ending.");
         }
         
      }
   }

}