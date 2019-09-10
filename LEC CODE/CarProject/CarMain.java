/* This class uses instances of the Car class. It creates Car objects and 
 * uses Car class methods to get and set the amount of fuesl and fuel capacity 
 * in the Car objects. It also prints to the console information about the Cars.
*/
public class CarMain{

  public static void main(String[] args){
    
    //create an instance of a Car, with fuel capacity, fuel amount parameters.
    Car myCar = new Car(13.5, 5.0);
    
    //create another Car instance using the default constructor.
    Car yourCar = new Car();
    
    //using set methods to change capacity and fuel amount.
    yourCar.setCapacity(10.00);
    yourCar.setFuel(5.00);
    
    // printing information contained in the Car objects.
    System.out.println (myCar.getFuel());
    System.out.println (yourCar.getFuel());
          
   }//end main
  
  
  }//end class 