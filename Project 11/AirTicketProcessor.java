import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

/** AirTicketProcessor class provides methods for reading data files and 
 *  generating reports.
 *  Project 10
 *  @author Lyndsey Rice - COMP 1210 - D01
 *  @version November 11, 2021
 */

public class AirTicketProcessor {

   // instance variables
   private AirTicket[] atArr;
   private String[] invalid;
   
   /** Constructor for AirTicketProcessor.
    */
   public AirTicketProcessor() {
      atArr = new AirTicket[0];
      invalid = new String[0];
   }
   
   /** Method to add an AirTicket to the array.
    *  @param atIn - The AirTicket to add
    */
   public void addAirTicket(AirTicket atIn) {
      atArr = Arrays.copyOf(atArr, atArr.length + 1);
      atArr[atArr.length - 1] = atIn;
   }
   
   /** Method to add to the invalid record array.
    *  @param invalidIn - The invalid record
    */
   public void addInvalidRecord(String invalidIn) {
      invalid = Arrays.copyOf(invalid, invalid.length + 1);
      invalid[invalid.length - 1] = invalidIn;
   }
   
   /** Method to generate a report based on original ticket order.
    *  @return output - A string representing the air ticket array
    */
   public String generateReport() {
      String output = "----------------------------" + "\nAir Ticket Report" 
         + "\n----------------------------" + "\n";
         
      for (int i = 0; i < atArr.length; i++) {
         output += "\n";
         output += atArr[i].toString();
         output += "\n";
      }
      
      return output;
   }
   
   /** Method to generate a report based on natural sorting by ticket number.
    *  @return output - A string representing the air ticket array, sorted
    */
   public String generateReportByFlightNum() {
      String output = "--------------------------------------" 
         + "\nAir Ticket Report" + " (by Flight Number)" 
         + "\n--------------------------------------" + "\n";
      
      Arrays.sort(atArr);
      
      for (int i = 0; i < atArr.length; i++) {
         output += "\n";
         output += atArr[i].toString();
         output += "\n";
      }
      
      return output;
   }
   
   /** Method to generate a report sorted by Itinerary.
    *  @return output - A string representing the sorted air tickets
    */
   public String generateReportByItinerary() {
      String output = "--------------------------------------" 
         + "\nAir Ticket Report" + " (by Itinerary)" 
         + "\n--------------------------------------" + "\n";
      
      Arrays.sort(atArr, new ItineraryComparator());
      
      for (int i = 0; i < atArr.length; i++) {
         output += "\n";
         output += atArr[i].toString();
         output += "\n";
      }
      
      return output;

   }
   
   /** Method to read data from a file and create AirTicket objects.
    *  @param fileName - The name of the file as a string
    *  @throws FileNotFoundException - Throws FileNotFoundException
    */
   public void readAirTicketFile(String fileName) throws 
      FileNotFoundException {
      
      Scanner scanner = new Scanner(new File(fileName)); 
      
      while (scanner.hasNext()) {
         
         String currentLine = scanner.nextLine();
         Scanner lineScan = new Scanner(currentLine);
         lineScan.useDelimiter(",");
         String code = lineScan.next();
         char charCode = code.charAt(0);
         
         try {
                  
            String flightNumber = lineScan.next();
            String fromAirport = lineScan.next();
            String toAirport = lineScan.next();
            String departure = lineScan.next();
            String arrival = lineScan.next();
            int miles = Integer.parseInt(lineScan.next());
            
            double baseFare = Double.parseDouble(lineScan.next());
            double fareAdjustment = Double.parseDouble(lineScan.next());
                  
            Itinerary tripData = new Itinerary(fromAirport, toAirport, 
               departure, arrival, miles);
            
            switch (charCode) {
               
               case 'B':
                                 
                  Business busi = new Business(flightNumber, tripData, 
                     baseFare, fareAdjustment, 
                     Double.parseDouble(lineScan.next()),
                     Double.parseDouble(lineScan.next())); 
                     
                  addAirTicket(busi);
                                    
                  break;
               
               case 'E':
                  Economy econ = new Economy(flightNumber, tripData,
                     baseFare, fareAdjustment); 
                  
                  addAirTicket(econ);
               
                  break;
               
               case 'F':
                  
                  Elite elite = new Elite(flightNumber, tripData,
                     baseFare, fareAdjustment, 
                     Double.parseDouble(lineScan.next()),
                     Double.parseDouble(lineScan.next()),
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(elite);
               
                  break;
               
               case 'N':
                  
                  NonRefundable nonref = new NonRefundable(flightNumber, 
                     tripData, baseFare, fareAdjustment,
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(nonref);
                              
                  break;
               
               default:
                  throw new InvalidCategoryException(code);
            }
            
         } 
            
         catch (InvalidCategoryException e) {
            String str = e + " in: " + currentLine;
            addInvalidRecord(str);
         } 
            
         catch (NumberFormatException e) {
            String str = e + " in: " + currentLine;
            addInvalidRecord(str);
         }
      } 
   }
   
   /** Method to return AirTicket array.
    *  @return atArr - Returns the array of AirTickets.
    */
   public AirTicket[] getTickets() {
      return atArr;
   }
   
   /** Method to return the string array of invalid inputs.
    *  @return invalid - Returns the string array of invalids
    */
   public String[] getInvalidInput() {
      return invalid;
   }
   
   /** Method to generate a report for invalid input.
    *  @return output - Returns a string output of the formatted invalid inputs
    */
   public String generateReportForInvalidInput() {
      String output = "--------------------------------------"
         + "\nAir Ticket Report for Invalid Input\n" 
         + "--------------------------------------";
   
      for (String input: invalid) {
         output += "\n" + input;
      }
      
      return output;
   }
   
}