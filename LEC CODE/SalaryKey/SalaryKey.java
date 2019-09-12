import java.util.Scanner;

public class SalaryKey {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      final int MONTHS_PER_YEAR=12; // TODO: Declare as final and use standard naming  
      int hourlyWage;
      int workHoursPerWeek;      
      int workWeeksPerYear;
      int annualSalary; 
      int monthlySalary;           
      
      System.out.println("Enter hourly wage: ");
      hourlyWage = scnr.nextInt();

      // TODO: Get user input values for workHoursPerWeek and workWeeksPerYear
      System.out.println("Enter hours per week: ");
      workHoursPerWeek = scnr.nextInt();
      
      System.out.println("Enter weeks per hour: ");
      workWeeksPerYear = scnr.nextInt();

      annualSalary = hourlyWage * workHoursPerWeek * workWeeksPerYear;
      System.out.print("Annual salary is: ");         
      System.out.println(annualSalary);  
      
      // TODO: Change monthsPerYear to the final variable that uses the standard naming
      monthlySalary = (hourlyWage * workHoursPerWeek * workWeeksPerYear) / MONTHS_PER_YEAR;
      System.out.print("Monthly salary is: ");
      System.out.println(monthlySalary); 
   } 
}