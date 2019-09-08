/*
   This class prints messages.
*/
public class MyFirstProgram {
   public static void main(String[] args){
            
      int num = 0;
   
      String student1Name = "some name";
      String role1 = "Manager";
      num = num + 1;
      
      //Messages are printed via System.out
      String str = "Welcome to COMPSCI121. Our group members are:";
      System.out.println(str);
      System.out.println(student1Name + ", our " + role1);
      System.out.print("The number of team members is: " + num);
   }
}


