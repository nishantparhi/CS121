import java.util.Scanner;

public class LoopDemo {

   public static void main (String [] args) { 
      // countdown(10);
      // doubleFor(5);
       
     // This do-while loop runs until a number is entered.
       Scanner in = new Scanner(System.in);
       boolean okay;
       double inputDbl;
       do{
           System.out.print("Enter a number: ");
           if (in.hasNextDouble()) {  // notice that the data stays in the buffer.
               okay = true;
           } else {
               okay = false;
               String word = in.next();
               System.err.println(word + " is not a number");
           }
        } while (!okay);
        inputDbl = in.nextDouble();// now the data is removed from the buffer.
        System.out.print("You entered: "+inputDbl);
   }
   
   // a while loop.
   public static void countdown(int n) {
       while (n > 0) {
           System.out.println(n);
           n = n - 1;
       }
       System.out.println("Blastoff!");
    }
    
    // exercise: write countdown as a for loop.
    
   // nested for loops.
   public static void doubleFor(int n) {
       for (int i=0; i < 4; i++) {
           for (int j=0; j < 2; j++) {
               System.out.println(i);
           }
       }
   }
}