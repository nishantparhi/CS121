/**
* SnapCracklePop app.
* @author Nishant Parhi
* @version 1.0
*/

public class SnapCracklePop{
 
   /**
   * Integer storing the snap value.
   */
   private int snap;
   
   /**
   * Integer storing the crackle value.
   */
   private int crackle;
   
   /**
   * Integer storing the pop value.
   */
   private int pop;
   
   /**
   * For initializing with the provided values.
   * @param Variable Snap -> gaming.
   * @param Variable Crackle -> gaming.
   * @param Variable Pop -> gaming.
   */
    
   public SnapCracklePop(int snap, int crackle, int pop){
      this.snap = snap;
      this.crackle = crackle;
      this.pop = pop;
   }
   
   /**
   * To return the value for each round.
   * @param round Ask for the argument of round number.
   * @return The answer for that round.
   */ 
     
   /* playRound() is a helper method for playGame(). 
   *  It takes an int parameter representing the 
   *  current round of play, and returns the 
   *  String result for that specific round only.
   */
   
   public String playRound(int round){
      String output = "";
      if(round % snap == 0) output += "snap";
      if(round % crackle == 0) output += "crackle";
      if(round % pop == 0) output += "pop";
      if(output.equals("")) return round+"";
      else return output;
   }
   
   /**
   * To output the result texts for the whole game.
   * @param rounds The number of rounds you want to play.
   * @return The whole result of the game.
   */ 

   /* playGame() takes a single parameter representing the rounds and returns
   *  a String representing the result of the entire game. The helper method
   *  playRound() may be useful here, so you may want to complete it first.
   */
   
   public String playGame(int rounds){
      String output = "";
      for(int i = 1; i <= rounds; i++){
         output += "Round " + i + ": " + playRound(i) + "\n";
      }
      return output;
   }
   
   /**
   * Value of snap.
   * @return snap value.
   */ 
   
   public int getSnap(){
      return snap;
   }
   
   /**
   * Value of crackle.
   * @return crackel value.
   */ 
   
   public int getCrackle(){
      return crackle;
   }  
   
   /**
   * Value of pop.
   * @return pop value.
   */ 
     
   public int getPop(){
      return pop;
   }
} 

//end class