// import the library
import java.util.Scanner;

public class Salary2 {
   public static void main(String [] args) {
      int wage;
      
      //create the new scanner object
      Scanner scnr = new Scanner(System.in);
      
      //call the nextInt() method on the scnr object
      //assign the input value to wage
      wage = scnr.nextInt();
      
      //print the output statements
      System.out.print("Salary is ");
      System.out.println(wage * 40 * 50);
   }
}