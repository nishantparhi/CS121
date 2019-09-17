/*
 *Printing a pizza volume and area
*/  

public class PizzaCalculator {
      private double pizzaRadius;
      private double pizzaArea;
      private double pizzaVolume;
      private double pizzaDiameter;
      private final double PI_VAL = 3.14159265; //use of constant
   
   //Constructor initializes variables - does not have parameters
   public PizzaCalculator(){
      pizzaRadius = 0.0;
      pizzaArea = 0.0; 
      pizzaVolume = 0.0;  
   }
   
   public PizzaCalculator(double pizzaDiameter){
      pizzaRadius = 0.0;
      pizzaArea = 0.0; 
      pizzaVolume = 0.0;
      this.pizzaDiameter = pizzaDiameter; //use of this. keyword 
   }

   
   //method has 2 parameters and no return value
   public void printPizzaVolume(double pizzaDiameter, double pizzaHeight) { 
      // calculate pizza volume given a diameter and height
      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = PI_VAL * pizzaRadius * pizzaRadius;
      pizzaVolume = pizzaArea * pizzaHeight;
      
      // display results
      System.out.print("The volume of a ");
      System.out.println(pizzaDiameter + " x " + pizzaHeight + " inch pizza is ");
      System.out.println(pizzaVolume + " inches cubed.");
   }//end method
   
   //method has no parameter and one return value
   public double calculatePizzaArea() {
      // calculate pizza area given a diameter
      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = PI_VAL * pizzaRadius * pizzaRadius;
      return pizzaArea;
   
   }//end method
 
}//end class
