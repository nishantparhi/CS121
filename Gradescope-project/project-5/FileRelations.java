/**
* FileRelations is intended to be a simple search engine to find the most related text files possible
* @author Nishant Parhi
* @version 1.0
*/

import java.io.*;

public class FileRelations{

   /**
   * a String holding the file name for the highest scoring file
   */
   private String topFile;
   /**
   * The score for the highest scoring file
   */
   private double topScore;
   /**
   * wordsToFind: a String array holding all the words to search for
   */
   private String[] wordsToFind;
   
   /**
   * This is the primary and only constructor for the FileRelations class.
   * @param toFind holds all the key words to search for
   */
   public FileRelations(String[] toFind){
      //TODO 1 Initialize instance variables
      topFile = "";
      topScore = 0;
      wordsToFind = toFind;
   }
   
   /**
   * Analyses the file based on the keywords and updates the top scoring file and score once done.
   * @param fileContent an array of Strings each representing a line in the original file
   * @param fileName the name of the file being analysed
   */ 
   public void analyseFile(String[] fileContent, String fileName){
      //TODO 4
      // Search the fileContent array to find the frequency of words in each line, using the scoreLine method 
      double sumScore = 0;
      for(int i = 0; i < fileContent.length; i++){
         sumScore += scoreLine(fileContent[i]);
      }
      // Divide the score by the total number of lines
      sumScore = sumScore / fileContent.length;
      // Compare to and possibly replace topScore
      // Assign the topFile to the file name with topScore if needed
      if(sumScore > topScore || topFile.equals("")){
         topScore = sumScore;
         topFile = fileName;
      }
   }
   
   /**
   * Analyses the line passed in and scores it based on frequency of the key words. A helper method for analyseFile.
   * @param line a String representing a single line in a file
   * @returns the score of the line passed in
   */ 
   private int scoreLine(String line){
      //TODO 3
      // Split the line into words
      String[] splitedList = line.split(" ");
      // Score each word and sum those scores
      int sumScore = 0;
      for(String text: splitedList){
         sumScore += countWord(text);
      }
      // Return the sums
      return sumScore;
   }
   
   /**
   * Analyses the word passed in and scores it based on if it is one of the key words. A helper method for scoreLine.
   * @param word a String representing a single word in a file
   * @returns the score of the word passed in
   */ 
   private int countWord(String word){
      //TODO 2
      // Compare word to each of the wordsToFind and score
      int outputScore = 0;
      for(int i = 0; i < wordsToFind.length; i++){
         if(word.equalsIgnoreCase(wordsToFind[i])) ++outputScore;
      }
      // Return the result of the word comparison
      return outputScore;
   }
   
   /**
   * A getter method for the key words used in this object's search
   * @returns a String array containing the key words to search for.
   */ 
   public String[] getWords(){
      //TODO 5
      return wordsToFind;
   }
   
   /**
   * A getter method for the top scoring file in the object currently
   * @returns a String representing the file name of the top scoring file.
   */ 
   public String getTopFile(){
      //TODO 6
      return topFile;
   }
   
   /**
   * A getter method for the score of the top scoring file in the object currently
   * @returns an int representing the score of the top scoring file.
   */ 
   public double getTopScore(){
      //TODO 7
      return topScore;
   }
}