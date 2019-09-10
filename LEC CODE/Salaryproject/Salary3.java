public class Salary3 {                         
   public static void main (String [] args) { 
      int hourlyWage;

      hourlyWage = 20;
                   
      System.out.print("Annual salary is: ");         
      System.out.println(hourlyWage * 40 * 50);   
    
      System.out.print("Monthly salary is: ");
      System.out.println((hourlyWage * 40 * 50) / 1); 
      // FIXME: The above is wrong. 
      // Change the 1 so the statement prints monthly salary.

   } 
}