public class MyTeam {
   public static void main(String[] args){

      int num = 0;
   
      String student1Name = "Lola";
      String role1 = "Manager";
      String student2Name = "Nishant";
      String role2 = "Presenter";
      String student3Name = "Maya";
      String role3 = "Recorder";
      String student4Name = "jinxu";
      String role4 = "reflector";
      num = num + 4;

      String str = "Welcome to COMPSCI121. Our group members are:";
      System.out.println(str);
      System.out.println(student1Name + ", our " + role1);
      System.out.println(student2Name + ", our " + role2);
      System.out.println(student3Name + ", our " + role3);
      System.out.println(student4Name + ", our " + role4);
      System.out.print("The number of team members is: " + num);

   
   }
}