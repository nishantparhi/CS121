import java.util.Scanner;

public class DemoMain{
   
   public static void main(String[] args){

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a positive integer");
       int number = scan.nextInt();

       if (number < 0)
           System.out.println("Number entered isn't positive");
       if (number > 0)
           System.out.println(number + " is positive");
       else
           System.out.println(number + " is negative or zero");
      
//double num2 = 5.0;
 //int num1 = num2;
int num1 = 5.1;
double num2 = 5;

   }
}