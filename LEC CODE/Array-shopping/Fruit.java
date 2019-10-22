public class Fruit {
	private String type;
	private String color;
	private int daysOld;
	private boolean hasSeeds;
	
   public Fruit(String t, String c, int age, boolean seeds) {
		type = t;
		color = c;
		daysOld = age;
		hasSeeds = seeds;
	}
   //get methods
   public String getType(){return type;}
   public String getColor(){return color;}
   public int getDaysOld(){return daysOld;}
   public boolean hasSeeds(){return hasSeeds;}
   //add a day to daysOld
   public void incrementDaysOld(){
      daysOld++;
   }
   
   // returns a String representation of this object
   public String toString(){
   	 String message = daysOld + "-day-old ";
	    if (!hasSeeds) {
	      message += "un";
	    }
	    message += "seeded " + color + " " + type;
       return message;
	}
   
   //a static method to print an array of Fuit objects
   public static void printFruitArray(Fruit[] fruits) {
	  for (Fruit f : fruits) {
	    String message = f.toString()+", ";
	    System.out.println(message);
	  }
	}
}




















