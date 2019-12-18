/**
 * This class encapsulates the data required to represent a movie in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a movie are: 
 *       int: playing time (minutes), String; lead actor, and String: year of release.
 **/
 public class Movie extends MediaItem {

  private int playTime;
  private String leadActor;
  private String releaseYear;
  
  public Movie(String title, String author, String genre, 
                   int playTime, String leadActor, String releaseYear){
     super(title, author, genre);
     this.playTime = playTime;
     this.leadActor = leadActor;
     this.releaseYear = releaseYear;
  }

  // return play time  
  public int getPlayTime(){
     return playTime;
  }
  
  // return lead actor
  public String getLeadActor(){
     return leadActor;
  }
  
  // return release year
  public String getReleaseYear(){
     return releaseYear;
  }
  
  /* TODO: Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Movie: [title], [author], [genre], [playTime], [leadActor], [releaseYear]
   * For example:
   *   "Movie: Black Panther, Coogler, fantasy, 134, Chadwick Boseman, 2018"
   */
  @Override
  public String toString(){
     return "Movie: " + super.toString() + ", " + playTime + ", " + leadActor + ", " + releaseYear;
  }
}