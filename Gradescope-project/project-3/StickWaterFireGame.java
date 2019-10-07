import java.util.Random;

/* This class ecapsulates the state and logic required to play the 
   Stick, Water, Fire game.
   
   Rules of the game:
   S beats W
   W beats F
   F beats S
   no winner on a tie.
   
   A member variable, rand, is an instance of the Random class. This instance is created
   either with or without a seed value which is passed into one of the StickWaterFireGame 
   constructors. The seeded instance will allow for testing and debugging of the game as 
   the same sequence of numbers will be generated. The unseeded version will allow for 
   normal play as the numbers are randomly generated.
   
   The state of the game is represented by the following member variables:
   -  playerScore, computerScore: The player and computer scores. These are initially 0 and are incremented by 
      the playRound method when either the player or computer wins a round.
   -  rounds: The number of rounds played. This is initially 0 and is incremented for 
      each round of play (even in the case of a tie).
   -  computerChoice: The computer's choice. This String is initially the empty string. It will be assigned to 
      one of the three choices: "S", "W", "F", during a round of play.
   
   The private method getRandomChoice() is called by the playRound method to help play a round.
   
   NOTE: You may not delete any methods or variables from the code. Extra variables and methods 
   are not required to make the program work correctly, but you may add them if you wish as long as
   you fulfill the project requirements.
   
*/
public class StickWaterFireGame {

   private Random rand;
   private int playerScore;
   private int computerScore;
   private int rounds;
   private String computerChoice;
    
    
  /*  The constructor assigns the member Random variable, rand, to 
   *  a new Random object using the seed passed in.
   *  
   *  It also initializes the instance variables to their default values:
   *  rounds, player and computer scores will be 0, the playerWins and computerWins
   *  variables should be set to false.
   */    
   public StickWaterFireGame(int seed) {
      // First, assign rand to a new Random object using the seed passed in.
      rand = new Random(seed);
      // Then, initialize rounds, playerScore and computerScore to 0.
      rounds = 0;
      playerScore = 0;
      computerScore = 0;
      // Finally, initialize computerChoice to an empty string.
      computerChoice = "";
   }   
   
  /*  This secondary constructor does the same things the first one does,
   *  except it does not use a seed to create the Random object
   */
   public StickWaterFireGame() {
      // First, assign rand to a new Random object.
      rand = new Random();
      // Then, initialize rounds, playerScore and computerScore to 0.
      rounds = 0;
      playerScore = 0;
      computerScore = 0;
      // Finally, initialize computerChoice to an empty string.
      computerChoice = "";
   }
    
  /*  This method carries out a single round of play of the SWF game. 
   *  
   *  It first ensures the player's input is valid using isValidInput, gets the 
   *  computer's choice (by calling the getRandomChoice method), compares it to 
   *  the player's choice, and determines who wins a round of play according to 
   *  the rules of the game. The player and computer scores are updated 
   *  accordingly, then the number of rounds of play is incremented. In
   *  the event of a tie, neither player has their score updated.
   *
   *  If the player's input is not valid, the computer wins by default (as the 
   *  player may be considered cheating). 
   */
   public void playRound(String playerChoice) {
      // First, get the computer's choice by calling the getRandomChoice() method.
      computerChoice = getRandomChoice();
      // Then, check if the player's input is valid using isValidInput and increment the computer's score if invalid.
      /* Next, compare the computer choice to the player's choice, and determines who wins 
       *  a round of play according to the rules of the game. Update the player and computer 
       *  scores as necessary.
       */
      if(!isValidInput(playerChoice)){
         computerScore += 1;
      } else { // Put the steps here to avoid the crash by the invalid input.
         if(computerChoice.equals("S") || computerChoice.equals("s")){
            if(playerChoice.equals("S") || playerChoice.equals("s")){
               // Tie
            } else if(playerChoice.equals("W") || playerChoice.equals("w")){
               // lost
               computerScore += 1;
            } else if(playerChoice.equals("F") || playerChoice.equals("f")){
               // won
               playerScore += 1;
            } else {

            }
         } else if(computerChoice.equals("W") || computerChoice.equals("w")){
            if(playerChoice.equals("S") || playerChoice.equals("s")){
               // won
               playerScore += 1;
            } else if(playerChoice.equals("W") || playerChoice.equals("w")){
               // Tie
            } else if(playerChoice.equals("F") || playerChoice.equals("f")){
               // lost
               computerScore += 1;
            } else {

            }
         } else if(computerChoice.equals("F") || computerChoice.equals("f")){
            if(playerChoice.equals("S") || playerChoice.equals("s")){
               // lost
               computerScore += 1;
            } else if(playerChoice.equals("W") || playerChoice.equals("w")){
               // won
               playerScore += 1;
            } else if(playerChoice.equals("F") || playerChoice.equals("f")){
               // Tie
            } else {

            }
         }
      }
      
      // Finally, increment the number of rounds of play.
      rounds += 1;
   }

  /*  This method returns true if the inputStr passed in is
   *  either "S", "W", or "F" (ignoring case), false otherwise.
   */
   public boolean isValidInput(String inputStr) {
      // Try to do this method in one line, using only a single return statement and boolean opperators
      if(inputStr.equals("S") || inputStr.equals("W") || inputStr.equals("F") || inputStr.equals("s") || inputStr.equals("w") || inputStr.equals("f")){
         return true; 
      } else {
         return false;
      }
   }
    
   // Returns the choice of the computer for the most recent round of play
   public String getComputerChoice(){
      return computerChoice;
   }

   // Returns true if the player has a higher score, false otherwise.    
   public boolean playerWinning(){
      if(playerScore > computerScore){
         // Player won
         return true;
      } else {
         // Player lost
         return false;
      }
   }

   // Returns true if the computer has a higher score, false otherwise.    
   public boolean computerWinning() {
      if(computerScore > playerScore){
         // Computer won
         return true;
      } else {
         // Computer lost
         return false;
      }
   }

   // Returns true if the player and computer have the same score, false otherwise.    
   public boolean isTie(){
      if(computerScore == playerScore){
         // tie
         return true;
      } else {
         // not tie
         return false;
      }
   }

   // Returns the number of rounds, the player's current score, and the computer's current score in a readable String format.    
   public String getScoreReportStr(){
      String returnValue = "[[[Output]]]\nRounds: " + rounds + "\nComputer's Score: " + computerScore + "\nPlayer's Score: " + playerScore;
      return returnValue;
   }

  /*  This "helper" method uses the instance of Random to generate an integer
   *  which it then maps to a String: "S", "W", "F", which is returned.
   *  This method is called by the playRound method.
   */
   private String getRandomChoice() {
      int newRandomNum = rand.nextInt(3);
      if(newRandomNum == 0){
         return "S";
      } else if(newRandomNum == 1){
         return "W";
      } else {
         return "F";
      }
      // To avoid calling another return outside the if.
   }
}