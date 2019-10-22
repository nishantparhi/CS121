public class ShoppingListRevised{

  public static void main(String[] args)
  {

   // Construct an empty list with 5 elements
   String[] shoppingList = new String[5];
   //variable to count items
   int shoppingListSize = 0;
   
   // Add first element to shopping list
   shoppingList[shoppingListSize] = "Milk";
   //increment item count
   shoppingListSize++;   
   
   // Add second element to shopping list
   shoppingList[shoppingListSize] = "Oranges";
   shoppingListSize++;           
   
   // Add third element to shopping list
   shoppingList[shoppingListSize] = "Apples";
   shoppingListSize++;
   
  
   /*  
   for (int index = 0; index < shoppingList.length; index++) {
      System.out.println(shoppingList[index]);
   }
   */
   for (int index = 0; index < shoppingListSize; index++) {
      System.out.println(shoppingList[index]);
   }
   
  }//end main
   
}//end class