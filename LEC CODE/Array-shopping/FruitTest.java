
public class FruitTest{

  public static void main(String[] args)
  {
    Fruit apple1 = new Fruit("apple", "green", 3, true);
    Fruit apple2 = new Fruit("apple", "green", 3, true);
    Fruit grape = new Fruit("grape", "green", 6, false);
    Fruit[] myFruits = {apple1, grape, apple2};
    myFruits[2] = new Fruit("grape", "green", 1, true);
    Fruit.printFruitArray(myFruits);
    
    
    
    // count the number of green fruit in myFruits
    int countGreen = 0;
    for (Fruit f : myFruits) {
      if (f.getColor().equals("green")) {
        countGreen++;
      }
    }
    System.out.println(countGreen + " green fruits");
    
    // find the type of the oldest fruit
    int currentOldestIndex = 0;
    for (int j = 0; j < myFruits.length; j++) {
      if (myFruits[j].getDaysOld() > myFruits[currentOldestIndex].getDaysOld()) {
        currentOldestIndex = j;
      }
    }
    System.out.println(myFruits[currentOldestIndex].getType() + " at index " + currentOldestIndex);
    
    // increment days Old of myFruits
    incrementDaysOld(myFruits);
    
    // remove fruit that is at least 7 days old
    int myFruitlength = 3;
    for (int j = 0; j < myFruitlength; j++) {
      if (myFruits[j].getDaysOld() >= 7) {
        // want to remove the element
        for (int i = j; i < myFruitlength; i++) {
          // move the fruit one index down
        }
      }
    }
    
  }//end main
  
  	public static void incrementDaysOld(Fruit[] fruits) {
	 // using a regular for loop:
    /*
      for (int i = 0; i < fruits.length; i++) {
	      fruits[i].incrementDaysOld();
	   }
    */
    // using the enhanced, or for-each loop:
    for (Fruit curFruit : fruits) {
       curFruit.incrementDaysOld();
    }
	}


} // end class