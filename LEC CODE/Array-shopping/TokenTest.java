public class TokenTest{

  public static void main(String[] args)
  {
    
  String phrase = "Hello there my friend.";
  
  String [] tokens = phrase.split(" ");
  
  for (int index = 0; index < tokens.length; index++) {
      System.out.println(tokens[index]);
   }
  
  }
}