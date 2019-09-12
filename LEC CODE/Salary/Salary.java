import java.util.Scanner;

public class Salary {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int monthsPerYear; // TODO: Declare as final and use standard naming  
      int hourlyWage;
      int workHoursPerWeek;      
      int workWeeksPerYear;
      int annualSalary; 
      int monthlySalary; 

      monthsPerYear = 12;            
      
      System.out.println("Enter hourly wage: ");
      hourlyWage = scnr.nextInt();

      // TODO: Get user input values for workHoursPerWeek and workWeeksPerYear
      workHoursPerWeek = 40;      
      workWeeksPerYear = 50;

      annualSalary = hourlyWage * workHoursPerWeek * workHoursPerWeek;
      System.out.print("Annual salary is: ");         
      System.out.println(annualSalary);  
      
      // TODO: Change monthsPerYear to the final variable that uses the standard naming
      monthlySalary = (hourlyWage * workHoursPerWeek * workWeeksPerYear) / monthsPerYear;
      System.out.print("Monthly salary is: ");
      System.out.println(monthlySalary); 
   } 
}