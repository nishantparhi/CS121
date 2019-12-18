/**
 * This class encapsulates the data required to represent a podcast in a collection
 * of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a podcast are: 
 *     String: its description, String: its website, String: its date, 
 *     true if it is a video podcast, false otherwise.
 **/
 public class Podcast extends MediaItem {
   /* TODO: instance variable declarations */
   private String description;
   private String website;
   private String date;
   private boolean isVideo;
    
   public Podcast(String title, String author, String genre, String description,
                  String website, String date, boolean isVideo){
      super(title, author, genre);
      this.description = description;
      this.website = website;
      this.date = date;
      this.isVideo = isVideo;
   }
    
   // get description
   public String getDescription(){
      return description;
   }
   
   // get website
   public String getWebsite(){
      return website;
   }
   
   // get date
   public String getDate(){
      return date;
   }

   // get whether it is a video podcast
   public boolean isVideo(){
      return isVideo;
   }
   
  /* TODO: Override the superclass toString method. Use a call to the superclass toString method
   * to get the superclass attributes.
   * The return should have the format:
   *   Podcast: [title], [author], [genre], [description], [website], [date], [isVideo]
   * For example:
   *   "Podcast: Bit Flip, Simon Adler, science, Back in 2003, Belgium was holding a national election. One of their first where the votes would be cast and counted on computers. Thousands of hours of preparation went into making it unhackable. And when the day of the vote came, everything seemed to have gone well. That was, until a cosmic chain of events caused a single bit to flip and called the outcome into question., https://www.wnycstudios.org/podcasts/radiolab, May 8, 2019, false"
   */
  @Override
  public String toString(){
     return "Podcast: " + super.toString() + ", " + description + ", " + website
        + ", " + date + ", " + isVideo;
  }
  
}