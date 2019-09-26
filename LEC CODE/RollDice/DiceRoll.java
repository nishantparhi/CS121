import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
   public static void main (String [] args) {
      
       Random randGen = new Random();
       System.out.println(randGen.nextInt());
       
       //to get 0 or 1 to simulate heads/tail
       System.out.println(randGen.nextInt(2));
       System.out.println(randGen.nextInt(2));
       
       //Uncomment to see random 6 numbers starting from 10
       /*  
       System.out.println(randGen.nextInt(6)+ 10);
       System.out.println(randGen.nextInt(6)+ 10);
       System.out.println(randGen.nextInt(6)+ 10);
       System.out.println(randGen.nextInt(6)+ 10);
       System.out.println(randGen.nextInt(6)+ 10);
       System.out.println(randGen.nextInt(6)+ 10);
       */
      
      //Uncomment to get random numbers from 0 to 9
      /*
      System.out.println(randGen.nextInt(10));
      System.out.println(randGen.nextInt(10));
      System.out.println(randGen.nextInt(10));
      System.out.println(randGen.nextInt(0));
      System.out.println(randGen.nextInt(3));
      System.out.println(randGen.nextInt(1));
      System.out.println(randGen.nextInt(2));
      */
      
      //Uncomment below to see how to set the seed
      /*
      Scanner scnr = new Scanner(System.in);
      int seedVal;
      
      System.out.print("Enter seed value: ");
      seedVal = scnr.nextInt();
      randGen.setSeed(seedVal);
      System.out.println(randGen.nextInt(10));
      System.out.println(randGen.nextInt(10));
      */
      
   }
}

