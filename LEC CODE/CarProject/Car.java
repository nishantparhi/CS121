/* This class models a car, with attributes fuelCapacity- the size of the
 * car's tank, and the current amount of fuel in the tank. The Car class
 * provides public methods to get and set the fuel level and capacity, as well as
 * a method that calculates the cost of filling up the tank.
*/
 
 public class Car{
  // the Car attributes
  private double fuelCapacity;
  private double fuelAmount;

  // the Car constructors
  public Car(){
    fuelCapacity = 0.00;
    fuelAmount = 0.00;
   }
  
  public Car(double cap, double amt){
    fuelCapacity = cap;
    fuelAmount = amt;
   }
  
  // Car methods
  public void setFuel(double amt){
    fuelAmount = amt;
  }
  
  public void setCapacity(double cap){
    fuelCapacity = cap;
  }
  
  public double getFuel(){
    return fuelAmount;
  }
  
  public double fillUpCost(double gallonCost){ 
    return ((fuelCapacity - fuelAmount) * gallonCost); 
  } 
    
}//end class