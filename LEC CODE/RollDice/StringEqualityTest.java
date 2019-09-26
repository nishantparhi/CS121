public class StringEqualityTest{
   public static void main(String[] args){
     /* This class tests String equality in two cases:
        1- when String reference variables are assigned to String literals 
        2- when String reference variables are assigned to String Objects
        As you will see, the equality operator, ==, compares the two references
        to see if they point to the same Object, which in case 1 they do. Make
        sure you use the debugger to see this. In case 2, they point to different
        Objects. When the "new" operator is invoked in case 2, memory is allocated 
        to a new String object. In case 1, the reference is assigned to the same 
        literal value, which Java handles by creating a single String Object.
        This is more efficient, but be careful about what behavior you expect.
        Always use the equals method when comparing for lexicographic eqivalence.
      */
      boolean result;
   
      String str1 = "Hello";
      String str2 = "Hello";
   
      String str4 = new String("Hello");
      String str5 = new String("Hello");

      /* Check out this behavior when String reference variables are
         assigned to String literals: 
      */
      // using == they both point to the same Object- use the debugger to see this.
      result = (str1==str2);
      System.out.println(result);
      // using equals same result
      result = (str1.equals(str2));
      System.out.println(result);
   
      /* Now String reference variables are
         assigned to String Objects: 
      */
      // using == they are not the same object
      result = (str4==str5);
      System.out.println(result);
      // using equals they contain the same characters
      result = (str4.equals(str5));
      System.out.println(result);
   }

}