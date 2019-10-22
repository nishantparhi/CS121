
public class ShoppingList{

  public static void main(String[] args)
  {

   // Construct an empty list with 5 elements
   String[] shoppingList = new String[5];
   shoppingList[0] = "Milk";
   shoppingList[1] = "Oranges";
   shoppingList[2] = "Apples";
   
   shoppingList[0] = shoppingList[2];
   shoppingList[2] = shoppingList[0];

  //print my weekly shopping items
   for (int index = 0; index < shoppingList.length; index++) {
      System.out.println(shoppingList[index]);
   }
   
   // problem prints nulls
   
  }//end main
   
}//end class

