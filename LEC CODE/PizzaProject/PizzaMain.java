/*
 *Creating instances of 2 clases
*/

public class PizzaMain {

   public static void main (String [] args) {
      
      //create first instance of PizzaCalculator class
      PizzaCalculator pizza1 = new PizzaCalculator();
      //create second instance of PizzaCalculator class
      PizzaCalculator pizza2 = new  PizzaCalculator();
      
      // main method calls printPizzaVolume method on first instance
      pizza1.printPizzaVolume(12.0, 0.8);//sends arguments
      pizza2.printPizzaVolume(16.0, 0.8);//sends arguments
      
      //create third instance of PizzaCalculator class
      PizzaCalculator pizza3 = new  PizzaCalculator(6.0);
      
      // main method calls printPizzaArea method on third instance
      double pizzaArea = pizza3.calculatePizzaArea();//sends no arguments
            // display results
      System.out.print("The area is ");
      System.out.println(pizzaArea + " inches squared.");

      
   }
}