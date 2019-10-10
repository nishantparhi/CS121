import java.util.Scanner;

public class ListLetters {

   public static void main(String[] args) {
      String str; // Line of text entered by the user.
      int count; // Number of different letters found in str.
      char letter; // A letter in the alphabet.
      
      System.out.println("Please type in a line of text.");
      
      Scanner scan = new Scanner(System.in);
      str = scan.nextLine().toUpperCase();
      count = 0;
      
      System.out.println("Your input contains the following letters:\n ");
      
      for(letter = 'A'; letter <= 'Z'; letter++) {
         int i; //Position of a character in str.
         
         for(i = 0; i < str.length(); i++) {
            if(letter == str.charAt(i)) {
               System.out.print(letter + " ");
               count++;
               break;
            }
         }
      }
      
      System.out.println("\n\nThere were " + count + " different letters.");
      
   } //end main()
} //end class ListLetters