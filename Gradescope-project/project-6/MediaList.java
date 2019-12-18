import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**This class encapsulates a list of media items in a user's collection.
*  The list is implemented as either an ArrayList or array of type MediaItem.
*  Media items are either a book (electronic format), movie, podcast, or song. 
*  Each type of media item is represented by an instance of the Book, Movie, Podcast, or Song class.
*  These classes are subclasses of MediaItem. The list stores media items as 
*  references of type MediaItem.   
**/
public class MediaList {

   /*
    * Class instance variable declarations section.
    * You are required to declare at least one instance variable called itemList.
    * That variable should be either an array or an ArrayList of type MediaItem. 
    * This variable is the primary data structure that stores all of the MediaItem objects 
    * in the library.
    * You may declare other instance variables if you wish. Points will be 
    * deducted if you declare local variables here. A variable is local if
    * it is used in only one method.
   */
   private ArrayList<MediaItem>itemList;

   /**
   * Constructor.
   * You will use this method to initialize your itemList and
   * any other instance variables that were declared above.
   */    
   public MediaList(){
      itemList = new ArrayList<MediaItem>();
   }
   
   // add new item
   public void addItem(MediaItem newItem){
      itemList.add(newItem);
   }
   
   /**
   *  Returns true if the MediaItem with the title and author passed in
   *  is on the itemList, false otherwise. Assume the title/author pair
   *  uniquely identifies a MediaItem. 
   *  NOTE: All String comparisons are case-insensitive.
   */
   public boolean containsItem(String targetTitle, String targetAuthor){
      boolean output = false;
      for(MediaItem getmyItem:itemList){
         if(getmyItem.getTitle().equals(targetTitle)
               && getmyItem.getAuthor().equals(targetAuthor)){
            output = true;
            break;
         }
      }
      return output;
   }
   
   /**
   *  Remove the MediaItem with the title and author passed in.
   *  Return true if removed, false if not found or not removed.
   *  Assume the title/author pair uniquely identifies a MediaItem. 
   *  NOTE: All String comparisons are case-insensitive.
   */
   public boolean removeItem(String targetTitle, String targetAuthor){
      boolean output = false;
      Iterator<MediaItem> listIterator = itemList.iterator();

      while(listIterator.hasNext()){
         MediaItem tempItem = listIterator.next();
         if(tempItem.getTitle().equals(targetTitle)
               && tempItem.getAuthor().equals(targetAuthor)){
            output = true;
            listIterator.remove();
            break;
         }
      }

      return output;
   }
   
   /** TODO: implement this method.
   *  This method returns an array of the String representation of all of 
   *  the MediaItem objects that are currently stored in the itemList.
   *  A String representation of a MediaItem is returned by calling its toString() method. 
   *  The array returned may not contain any NULL values. This method returns an array of 
   *  length 0 if the itemList is empty.
   **/
   public String[] getItemListAsStringArray(){
      int size = 0;
      for(MediaItem getmyItem : itemList){
         if(getmyItem.toString() != null && !getmyItem.toString().equals(""))
            size += 1;
      }
      if(size > 0){
         int currIndex = 0;
         String[] output = new String[size];
         for(MediaItem getmyItem : itemList){
            if(getmyItem.toString() != null && !getmyItem.toString().equals("")){
               output[currIndex] = getmyItem.toString();
               currIndex += 1;
            }
         }
         return output;
      } else return emptyArray();
   }

   /**TODO: implement this method.
   *  This method returns a new array that contains only the String representations 
   *  of all MediaItems whose title matches the targetTitle passed in.
   *  A String representation of a MediaItem is returned by calling its toString() method.
   *  The array returned may not contain any NULL values.
   *  This method returns an array of length 0 if there are no matches.
   *  NOTE: All String comparisons are case-insensitive.
   **/   
   public String[] getAllItemsByTitle(String targetTitle){
      int size = 0;
      for(MediaItem getmyItem : itemList){
         if(getmyItem.getTitle() != null && getmyItem.getTitle().equals(targetTitle))
            size += 1;
      }
      if(size > 0){
         int currIndex = 0;
         String[] output = new String[size];
         for(MediaItem getmyItem : itemList){
            if(getmyItem.getTitle() != null && getmyItem.getTitle().equals(targetTitle)){
               output[currIndex] = getmyItem.toString();
               currIndex += 1;
            }
         }
         return output;
      } else return emptyArray();   
   }
   
   /**TODO: implement this method.
   *  This method returns a new array that contains only the String representations 
   *  of all MediaItems whose author matches the targetAuthor passed in.
   *  The array returned may not contain any NULL values.
   *  This method returns an array of length 0 if there are no matches.
   *  NOTE: All String comparisons are case-insensitive.
   **/   
   public String[] getAllItemsByAuthor(String targetAuthor){
      int size = 0;
      for(MediaItem getmyItem : itemList){
         if(getmyItem.getAuthor() != null && getmyItem.getAuthor().equals(targetAuthor))
            size += 1;
      }
      if(size > 0){
         int currIndex = 0;
         String[] output = new String[size];
         for(MediaItem getmyItem : itemList){
            if(getmyItem.getAuthor() != null && getmyItem.getAuthor().equals(targetAuthor)){
               output[currIndex] = getmyItem.toString();
               currIndex += 1;
            }
         }
         return output;
      } else return emptyArray();    
   }
   
   /** TODO: implement this method.
   *  This method returns a sorted array of the names of all the authors for
   *  all the media items in the list.
   *  Hint: use Arrays.sort for sorting an array, or Collections.sort for sorting
   *        an ArrayList.
   **/
   public String[] getSortedListOfAuthors(){
      int size = 0;
      for(MediaItem getmyItem : itemList){
         if(getmyItem.getAuthor() != null)
            size += 1;
      }
      if(size > 0){
         int currIndex = 0;
         String[] output = new String[size];
         for(MediaItem getmyItem : itemList){
            if(getmyItem.getAuthor() != null){
               output[currIndex] = getmyItem.getAuthor();
               currIndex += 1;
               if(!hasAuthor(output, getmyItem.getAuthor())){
                  // Useless right now since it has an unsolved bug.
               }
            }
         }
         Arrays.sort(output);
         return output;
      } else return emptyArray(); 
   }
   
   /**
    *  Returns the number of items currently stored in the itemList. 
   **/
   public int getNumItems(){
      return itemList.size();
   }
    
   /**
    * Returns true if the itemList contains no MediaItems, false otherwise.  
   **/
   public boolean isEmpty(){
      if(itemList.size() == 0)
         return true;
      else
         return false;
   }
  
   /****** Private, "helper" method section. You may define any private 
           methods you want below.  This is not a requirement of this project. 
           These methods perform tasks that make the code above simler and easier to 
           develop, troubleshoot, and understand.
    ******/
   private boolean hasAuthor(String[] searchList, String targetAuthor){
      boolean output = false;
      for(String authorGetter : searchList){
         if(authorGetter != null && authorGetter.equals(targetAuthor)){
            output = true;
            break;
         }
      }
      return output;
   } 
   
   private String[] emptyArray(){
      return new String[0];
   }
 }