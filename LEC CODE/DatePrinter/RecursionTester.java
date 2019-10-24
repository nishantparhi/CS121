import java.util.*;

public class RecursionTester {

   public static void main(String[] args) {
      
      System.out.println(mystery(5));
      //countdown(3);
      //columnString("monkey");  
      //columnString2("donkey");   
      
  }
   
   public static int mystery(int n){ 
         if(n == 1)
               return 1;
         else
               return n + mystery(n-1);
      } 
      
  public static void countdown(int n) {
      if (n == 0) {
         System.out.println("Blastoff!");
      } 
      else {
         System.out.println(n);
         countdown(n - 1);
      }
   }
   
   public static void columnString(String s){
      if(s.length() == 0)
         return;
      else {
         System.out.println(s.charAt(0));
         columnString(s.substring(1));
      }
   }
   
   public static void columnString2(String s){
      if(s.length() == 0)
           return;
      	else {
          columnString2(s.substring(1));
          System.out.print(s.charAt(0));
        }  
   }

   
}//end class
