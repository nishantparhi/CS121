/**
 * A class representing an elapsed time measurement 
 * in hours and minutes. 
 * @author Mary Adams
 * @version 1.0
 */
public class ElapsedTime {
   /**
    * The hours portion of the time
    */
   private int hours;
   
   /**
    * The minutes portion of the time
    */
   private int minutes;

   /**
    * Constructor initializing hours and minutes. 
    * @param hours portion of time
    * @param minutes portion of time
    */   
   public ElapsedTime(int hours, int minutes) {
      this.hours   = hours;
      this.minutes = minutes;
   }
   
   /**
    * Default constructor initializing all fields to 0. 
    */   
   public ElapsedTime() {
     this(0, 0);
     
   }
   
   /**
    * Prints the time represented by an ElapsedTime 
    * object in hours and minutes.
    */
   public void printTime() {
      System.out.print(hours + " hour(s) " + minutes + " minute(s)");
   }
   
   /**
    * Sets the hours to timeHours and minutes fields to 
    * timeMins.
    * @param timeHours hours portion of time
    * @param timeMins minutes portion of time
   */
   public void setTime(int timeHours, int timeMins) {
      hours = timeHours;
      minutes = timeMins;
   }

   /**
    * Returns the total time in minutes.
    * @return an int value representing the elapsed time in minutes.
    */
   public int getTimeMinutes() {
      return ((hours * 60) + minutes);
   }
}