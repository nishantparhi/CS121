public class DatePrinter {
   public void datePrint(int currDay, int currMonth, int currYear) {
    
      System.out.print(currMonth + "/" + currDay + "/" + currYear);
   }

   public void datePrint(int currDay, String currMonth, int currYear) {
      
      System.out.print(currMonth + " " + currDay + ", " + currYear);
   }

   public static void main(String[] args) {
      DatePrinter dailyPlanner = new DatePrinter();
      
      dailyPlanner.datePrint(30, 7, 2012);
      System.out.println();
      
      dailyPlanner.datePrint(30, "July", 2012);
      System.out.println();
   }
}

